import java.time.LocalDate;

public class Airline {
    int id;
    String cuit;
    String iataCode;
    String name;
    LocalDate startDateActivities;

    //region Constructors

    public Airline() {}

    public Airline(int id, String cuit, String iataCode, String name, LocalDate startDateActivities) {
        this.id = id;
        this.cuit = cuit;
        this.iataCode = iataCode;
        this.name = name;
        this.startDateActivities = startDateActivities;
    }

    //endregion

    //region Getter and Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDateActivities() {
        return startDateActivities;
    }

    public void setStartDateActivities(LocalDate startDateActivities) {
        this.startDateActivities = startDateActivities;
    }


    //endregion

    //region Methods

    public static Airline createAirline(int id, String cuit, String iataCode, String name, LocalDate startDateActivities) throws NullAirplaneExceptions {

        if (cuit == null || iataCode == null || name == null) {
            throw new NullAirplaneExceptions("Invalid value for a parameter");
        }

        if (Pilot.pilotCuilValidation(cuit) != true){
            throw new NullAirplaneExceptions("The format of attribute CUIT does not match the nomenclature");
        }

        if (iataCode.matches("[a-zA-Z]+" ) != true || iataCode.length()>2 || iataCode.length()<2){
            throw new NullAirplaneExceptions("the IATA Code doesn't respect the nomenclature for Airlines (Only letters and a max. of 2)");
        }

        Airline airline = new Airline ();
        airline.setId(id);
        airline.setCuit(cuit);
        airline.setIataCode(iataCode.toUpperCase());
        airline.setStartDateActivities(startDateActivities);
        return airline;
    }

    public void readAirline(){}
    public void updateAirline(){}
    public void deleteAirline(){}

    //endregion
}

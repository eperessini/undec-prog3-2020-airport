public class Airport {
    int id;
    String iataCode;
    String name;
    City city;
    double postalCode;

    //region Constructors

    public Airport(){}

    public Airport(int id, String iataCode, String name, City city, double postalCode) {
        this.id = id;
        this.iataCode = iataCode;
        this.name = name;
        this.city = city;
        this.postalCode = postalCode;
    }

    //endregion

    //region Getter and Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public double getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(double postalCode) {
        this.postalCode = postalCode;
    }


    //endregion

    //region Methods

    public static Airport createAirport(int id, String iataCode, String name, City city)throws NullAirplaneExceptions{

        if(iataCode == null || name == null || city == null) {
            throw new NullAirplaneExceptions("Invalid value for a parameter");
        }

        if (iataCode.matches("[a-zA-Z]+" ) != true || iataCode.length()>3 || iataCode.length()<3){
            throw new NullAirplaneExceptions("the IATA Code doesn't respect the nomenclature (Only letters and a max. of 3)");
        }

        Airport airport = new Airport();
        airport.setId(id);
        airport.setIataCode(iataCode.toUpperCase());
        airport.setName(name);
        airport.setCity(city);
        airport.setPostalCode(city.getPostalCode());
        return airport;
    }

    public void readAirport(){}
    public void updateAirport(){}
    public void deleteAirport(){}

    //endregion
}


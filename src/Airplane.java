public class Airplane {
    int id;
    String registrationNumber;
    String model;
    int passengerCapacity;
    Airline airline;
    int productionYear;
    Status status;

    //region Constructors

    public Airplane(int id, String registrationNumber, String model, int passengerCapacity, Airline airline, int productionYear, Status status) {
        this.id = id;
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.airline = airline;
        this.productionYear = productionYear;
        this.status = status;
    }

    public Airplane() {}

    //endregion

    //region Getter and Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    //endregion

    //region Methods

    public static Airplane createAirplane(int id, String registrationNumber, String model, int passengerCapacity, Airline airline, int productionYear, Status status) throws NullAirplaneExceptions {

        Airplane airplane = new Airplane();

        if(registrationNumber == null || model == null || productionYear == 0 ) {
            throw new NullAirplaneExceptions("Invalid value for a parameter");
        }

        if (airplane.registrationNumberValidation(registrationNumber) != true){
            throw new NullAirplaneExceptions("The format does not match the nomenclature");
        }

        airplane.setId(id);
        airplane.setRegistrationNumber(registrationNumber);
        airplane.setModel(model);
        airplane.setPassengerCapacity(passengerCapacity);
        airplane.setAirline(airline);
        airplane.setProductionYear(productionYear);
        airplane.setStatus(status);
        return airplane;
    }

    public boolean registrationNumberValidation(String registrationNumber) {

        //registrationNumber.charAt(0) != 'L' || registrationNumber.charAt(1) != 'V' || registrationNumber.charAt(2) != '-'
        if (registrationNumber.length() != 6 || registrationNumber.charAt(2) != '-'){
            return false;
        }
        return true;
    }

    public void readAirplane(){}
    public void updateAirplane(){}
    public void deleteAirplane(){}

    //endregion
}

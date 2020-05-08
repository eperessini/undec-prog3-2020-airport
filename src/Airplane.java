public class Airplane {
    int id;
    int registrationNumber;
    String model;
    int passengerCapacity;
    Airline airline;
    int productionYear;
    Status status;

    //region Constructors

    public Airplane(int id, int registrationNumber, String model, int passengerCapacity, Airline airline, int productionYear, Status status) {
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

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
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

    public void createAirplane(){}
    public void readAirplane(){}
    public void updateAirplane(){}
    public void deleteAirplane(){}

    //endregion
}

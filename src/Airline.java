public class Airline {
    int id;
    String name;
    String description;
    City city;
    String postalCode;

    //region Constructors

    public Airline(int id, String name, String description, City city, String postalCode) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.city = city;
        this.postalCode = postalCode;
    }

    public Airline() {}

    //endregion

    //region Getter and Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    //endregion

    //region Methods

    public void createAirline(){}
    public void readAirline(){}
    public void updateAirline(){}
    public void deleteAirline(){}

    //endregion
}

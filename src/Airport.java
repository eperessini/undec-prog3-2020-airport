public class Airport {
    int id;
    String name;
    String description;
    City city;

    //region Constructors

    public Airport(int id, String name, String description, City city) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.city = city;
    }

    public Airport() {}

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

    //endregion

    //region Methods

    public void createAirport(){}
    public void readAirport(){}
    public void updateAirport(){}
    public void deleteAirport(){}

    //endregion
}


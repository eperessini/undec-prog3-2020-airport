import java.util.ArrayList;

public class City {
    int id;
    String name;
    double postalCode;


    //region Constructors

    public City(int id, String name, double postalCode) {
        this.id = id;
        this.name = name;
        this.postalCode = postalCode;
    }

    public City() {}

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

    public double getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(double postalCode) {
        this.postalCode = postalCode;
    }

    //endregion

    //region Methods

    public static void createCity(){}
    public void readCity(){}
    public void updateCity(){}
    public void deleteCity(){}

    //endregion
}

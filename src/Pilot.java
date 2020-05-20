import java.time.LocalDate;
import java.time.Period;

public class Pilot {
    int id;
    String cuil;
    int docket;
    String lastName;
    String firstName;
    LocalDate birthDate;

    //region Constructors
    public Pilot() {
    }

    public Pilot(int id, String cuil, int docket, String lastName, String firstName, LocalDate birthDate) {
        this.id = id;
        this.cuil = cuil;
        this.docket = docket;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
    }
    //endregion

    //region Setter and Getter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuiL) {
        this.cuil = cuiL;
    }

    public double getDocket() {
        return docket;
    }

    public void setDocket(int docket) {
        this.docket = docket;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


    //endregion

    //region Methods

    public static Pilot createPilot(int id, String cuil, int docket, String lastName, String firstName, LocalDate birthDate) throws NullAirplaneExceptions {
        Pilot pilot = new Pilot();
        if(cuil == null || docket == 0 || lastName == null || firstName == null) {
            throw new NullAirplaneExceptions("Invalid value for a parameter");
        }

        if (pilot.pilotCuilValidation(cuil) != true){
            throw new NullAirplaneExceptions("The format of attribute CUIL does not match the nomenclature");
        }

        if (pilot.pilotLegalAgeValidation(birthDate) == false) {
            throw new NullAirplaneExceptions("The pilot is not in legal age.");
        }

        pilot.setId(id);
        pilot.setCuil(cuil);
        pilot.setDocket(docket);
        pilot.setLastName(lastName);
        pilot.setFirstName(firstName);
        pilot.setBirthDate(birthDate);
        return pilot;
    }

    public boolean pilotCuilValidation(String cuil) {

        if (cuil.length() != 13 || cuil.charAt(2) != '-' || cuil.charAt(11) != '-'){
            return false;
        }
        return true;
    }

    public boolean pilotLegalAgeValidation(LocalDate birthDate) {
        LocalDate now = LocalDate.now();
        Period period = Period.between(birthDate, now);
        int legalAge = 18;
        if (period.getYears()<legalAge){
            System.out.printf("Your age is: %s years old, %s months y %s days", period.getYears(), period.getMonths(), period.getDays());
            System.out.println("Legal age is "+legalAge);
            return false;
        }
        System.out.printf("Your age is: %s years old, %s months y %s days", period.getYears(), period.getMonths(), period.getDays());
        return true;
    }



    //endregion

}

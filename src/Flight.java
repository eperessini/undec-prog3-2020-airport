import java.time.LocalDate;
import java.util.Date;

public class Flight {
    int id;
    String flightCode;
    LocalDate departureDate;
    LocalDate arrivalDate;
    Airport departureAirport;
    Airport arrivalAirport;
    Airplane airplane;
    Crew crew;
    Airline airline;



    //region Constructors

    public Flight(){}

    public Flight(int id, String flightCode, LocalDate departureDate, LocalDate arrivalDate, Airport departureAirport, Airport arrivalAirport, Airplane airplane, Crew crew, Airline airline) {
        this.id = id;
        this.flightCode = flightCode;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.airplane = airplane;
        this.crew = crew;
        this.airline = airline;
    }

    //endregion

    //region Getter and Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(Airport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public Crew getCrew() {
        return crew;
    }

    public void setCrew(Crew crew) {
        this.crew = crew;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    //endregion Getter and Setter

    //region Methods

    public static Flight createFlight(int id, String flightCode, LocalDate departureDate, LocalDate arrivalDate, Airport departureAirport, Airport arrivalAirport, Airplane airplane, Crew crew, Airline airline) throws NullAirplaneExceptions {

        if(id == 0 || flightCode == null || departureAirport == null || arrivalAirport == null || airplane == null || crew == null || airline == null){
            throw new NullAirplaneExceptions("Invalid value for a parameter");
        }

        if (departureDate.isAfter(arrivalDate) == true){
            throw new NullAirplaneExceptions("The departure date cannot be later than the arrival date");
        }

        if (departureAirport.getId() == arrivalAirport.getId()){
            throw new NullAirplaneExceptions("The departure airport and arrival aiport are the same");
        }

        Flight flight = new Flight();
        flight.setId(id);
        flight.setFlightCode(airline.iataCode+flightCode);

        if (airline.iataCode.charAt(0) == flightCode.charAt(0) || airline.iataCode.charAt(0) == flightCode.charAt(0)){
            throw new NullAirplaneExceptions("The Iata Code in the Flight doesn't match with the Iata Code in the Airline");
        }

        flight.setDepartureDate(departureDate);
        flight.setArrivalDate(arrivalDate);
        flight.setDepartureAirport(departureAirport);
        flight.setArrivalAirport(arrivalAirport);
        flight.setAirplane(airplane);
        flight.setCrew(crew);
        flight.setAirline(airline);

        return flight;
    }
    public void readFlight(){}
    public void updateFlight(){}
    public void deleteFlight(){}

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", flightCode='" + flightCode + '\'' +
                ", departureDate=" + departureDate +
                ", arrivalDate=" + arrivalDate +
                ", departureAirport=" + departureAirport +
                ", arrivalAirport=" + arrivalAirport +
                ", airplane=" + airplane +
                ", crew=" + crew +
                ", airline=" + airline +
                '}';
    }

    //endregion Methods
}

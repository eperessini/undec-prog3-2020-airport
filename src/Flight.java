import java.util.Date;

public class Flight {
    int id;
    Airport departureAirport;
    Date departureDate;
    Airport arrivalAirport;
    Date arrivalDate;
    Airline airline;
    Crew crew;
    Airplane airplane;

    //region Constructors

    public Flight(int id, Airport departureAirport, Date departureDate, Airport arrivalAirport, Date arrivalDate, Airline airline, Crew crew, Airplane airplane) {
        this.id = id;
        this.departureAirport = departureAirport;
        this.departureDate = departureDate;
        this.arrivalAirport = arrivalAirport;
        this.arrivalDate = arrivalDate;
        this.airline = airline;
        this.crew = crew;
        this.airplane = airplane;
    }

    public Flight (){}

    //endregion

    //region Getter and Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(Airport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public Crew getCrew() {
        return crew;
    }

    public void setCrew(Crew crew) {
        this.crew = crew;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    //endregion Getter and Setter

    //region Methods

    public void createFlight(){}
    public void readFlight(){}
    public void updateFlight(){}
    public void deleteFlight(){}

    //endregion Methods
}

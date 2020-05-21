import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class FlightManager {

    private ArrayList<Flight> FlightsCollection = new ArrayList();

    //region Constructors

    public FlightManager(){}

    public FlightManager(ArrayList<Flight> flightsCollection) {
        FlightsCollection = flightsCollection;
    }

    //endregion

    //region Getter and Setter

    public ArrayList<Flight> getFlightsCollection() {
        return FlightsCollection;
    }

    public void setFlightsCollection(ArrayList<Flight> flightsCollection) {
        FlightsCollection = flightsCollection;
    }

    //endregion

    //region Methods

    public ArrayList<Flight> searchFlightByDepartureDate (LocalDate departureDate){

        ArrayList<Flight> FlightsCollectionReturn = new ArrayList();
        for (Flight flight: FlightsCollection) {
            if (flight.getDepartureDate() == departureDate) {
                FlightsCollectionReturn.add(flight);
            }
        }
        return FlightsCollectionReturn;
    }

    public ArrayList<Flight> searchFlightByArrivalDate (LocalDate ArrivalDate){

        ArrayList<Flight> FlightsCollectionReturn = new ArrayList();
        for (Flight flight: FlightsCollection) {
            if (flight.getDepartureDate() == ArrivalDate) {
                FlightsCollectionReturn.add(flight);
            }
        }
        return FlightsCollectionReturn;
    }

    public ArrayList<Flight> searchFlightByAirline (Airline airline){

        ArrayList<Flight> FlightsCollectionReturn = new ArrayList();
        for (Flight flight: FlightsCollection) {
            if (flight.getAirline().getId() == airline.getId()) {
                FlightsCollectionReturn.add(flight);
            }
        }
        return FlightsCollectionReturn;
    }


    public boolean ChangeFlightArrivalDate(Flight flight, LocalDate ArrivalDate){

        if(flight.getDepartureDate().isAfter(ArrivalDate) == true){
            System.out.println("The new Arrival Date is before the Departure Date. Cannot update.");
            return false;
        }
        flight.setArrivalDate(ArrivalDate);
        return true;
    }

    public boolean ChangeFlightDepartureDate(Flight flight, LocalDate DepartureDate){
        if(flight.getArrivalDate().isBefore(DepartureDate) == true){
            System.out.println("The new Departure Date is after the Arrival Date. Cannot update.");
            return false;
        }
        flight.setArrivalDate(DepartureDate);
        return true;

    }



    //endregion Methods

}

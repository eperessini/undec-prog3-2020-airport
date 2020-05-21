import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class TestsFlight {
    public TestsFlight(){}


    @Test
    public void testFlightCreationSuccessful() throws NullAirplaneExceptions {

        LocalDate departureDate = LocalDate.of(2020, Month.JUNE,1);
        LocalDate arrivalDate = LocalDate.of(2020, Month.JUNE,3);

        LocalDate dateAirline = LocalDate.of(1992, Month.AUGUST,16);

        City city = new City (001,"Ciudad de Buenos Aires", 1675);
        City city1 = new City (002,"Ciudad de Cordoba", 3586);

        // In this test, the parameters respects all the restrictions. A Created Flight Object is expected

        Assert.assertNotNull(Flight.createFlight(
                001,
                Integer.toString(123),
                departureDate,
                arrivalDate,
                Airport.createAirport(0001, "eze", "Jorge Newbery", city),
                Airport.createAirport(0002, "cba", "Ingeniero Ambrosio Taravella", city1),
                Airplane.createAirplane(0001, "LV-GIK", "Apache", 3000, null, 2000, null),
                Crew.createCrew(),
                Airline.createAirline(0001, "40-58874236-3", "ar", "Aerolineas Payaso", dateAirline)));
    }

    @Test
    public void testFlightCreationFails() throws NullAirplaneExceptions {

        LocalDate departureDate = LocalDate.of(2020, Month.JUNE,1);
        LocalDate arrivalDate = LocalDate.of(2020, Month.JUNE,3);

        LocalDate dateAirline = LocalDate.of(1992, Month.AUGUST,16);

        City city = new City (001,"Ciudad de Buenos Aires", 1675);
        City city1 = new City (002,"Ciudad de Cordoba", 3586);

        ///In this test, the departure date is later than the arrival date. A fail during the Flight creation is expected

        /*departureDate = LocalDate.of(2020, Month.JUNE,10);
        arrivalDate = LocalDate.of(2020, Month.JUNE,8);

        Assert.assertNotNull(Flight.createFlight(
                001,
                Integer.toString(123),
                departureDate,
                arrivalDate,
                Airport.createAirport(0001, "eze", "Jorge Newbery", city),
                Airport.createAirport(0002, "cba", "Ingeniero Ambrosio Taravella", city1),
                Airplane.createAirplane(0001, "LV-GIK", "Apache", 3000, null, 2000, null),
                Crew.createCrew(),
                Airline.createAirline(0001, "40-58874236-3", "ar", "Aerolineas Payaso", dateAirline)));
         */


        ///In this test, the arrival Airport is the same than the departure Airport. A fail during the Flight creation is expected
        /*Assert.assertNotNull(Flight.createFlight(
                001,
                Integer.toString(123),
                departureDate,
                arrivalDate,
                Airport.createAirport(0001, "eze", "Jorge Newbery", city),
                Airport.createAirport(0001, "cba", "Ingeniero Ambrosio Taravella", city1),
                Airplane.createAirplane(0001, "LV-GIK", "Apache", 3000, null, 2000, null),
                Crew.createCrew(),
                Airline.createAirline(0001, "40-58874236-3", "ar", "Aerolineas Payaso", dateAirline)));

         */


    }
}

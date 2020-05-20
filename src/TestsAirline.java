import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class TestsAirline {

    public void TestsAirline(){}

    @Test
    public void testAirlineCreationSuccessful() throws NullAirplaneExceptions {

        LocalDate date = LocalDate.of(1992, Month.AUGUST,16);
        // In this test, the parameters respects the restrictions
        Assert.assertNotNull(Airline.createAirline(0001, "40-58874236-3", "ar", "Aerolineas Payaso", date));
    }

    @Test
    public void testAirlineCreationFails() throws NullAirplaneExceptions {

        LocalDate date = LocalDate.of(1992, Month.AUGUST, 16);
        // In this test, the parameter iataCode has letters mixed with numbers
        Assert.assertNotNull(Airline.createAirline(0001, "40-58874236-3", "1r", "Aerolineas Payaso", date));

        // In this test, the parameter iataCode has more than 3 letters
        Assert.assertNotNull(Airline.createAirline(0001, "40-58874236-3", "ARG", "Aerolineas Payaso", date));

        // In this test, the parameter name doesn't respect the restriction not null
        Assert.assertNotNull(Airline.createAirline(0001, "40-58874236-3", "1r", null, date));
    }
}

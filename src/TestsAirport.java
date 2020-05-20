import org.junit.Assert;
import org.junit.Test;

public class TestsAirport {

    @Test
    public void testAirportCreationSuccessful() throws NullAirplaneExceptions {
        City city = new City (001,"Ciudad de Buenos Aires", 1675);

        // In this test, the parameters respect the restrictions
        Assert.assertNotNull(Airport.createAirport(0001, "eze", "Jorge Newbery", city));

    }

    @Test
    public void testAirportCreationFails() throws NullAirplaneExceptions {
        City city = new City (001,"Ciudad de Buenos Aires", 1675);

        // In this test, the parameter iataCode has letters mixed with numbers
        Assert.assertNotNull(Airport.createAirport(0001, "e1z", "Jorge Newbery", city));

        // In this test, the parameter iataCode has more than 3 letters
        Assert.assertNotNull(Airport.createAirport(0001, "ezeeee", "Jorge Newbery", city));

        // In this test, the parameter name doesn't respect the restriction not null
        Assert.assertNotNull(Airport.createAirport(0001, "eze", null, city));

        // In this test, the parameter city doesn't respect the restriction not null
        Assert.assertNotNull(Airport.createAirport(0001, "eze", "Jorge Newbery", null));

    }
}

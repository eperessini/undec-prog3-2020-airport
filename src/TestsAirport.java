import org.junit.Assert;
import org.junit.Test;

public class TestsAirport {

    @Test
    public void testAirplaneCreationSuccessful() throws NullAirplaneExceptions {

        // In this test, the parameters respect the restrictions
        Airplane airplane_1 = new Airplane ();
        Assert.assertNotNull(airplane_1.createAirplane(0001, "LV-GIK", "Apache", 3000, null, 2000, null));

    }

    @Test
    public void testAirplaneCreationFails () throws NullAirplaneExceptions {
        // In this test, the parameters doesn't respect the restrictions
        Airplane airplane_1 = new Airplane ();

        // parameter registrationNumber doesn't respect the restriction
        Assert.assertNotNull(airplane_1.createAirplane(0001, "01-GIK", "Apache", 3000, null, 2000, null));

        // parameter model doesn't respect the restriction
        Assert.assertNotNull(airplane_1.createAirplane(0001, "LV-GIK", null, 3000, null, 0, null));

        // parameter productionNumber doesn't respect the restriction
        Assert.assertNotNull(airplane_1.createAirplane(0001, "LV-GIK", "Apache", 3000, null, 0, null));
    }

}

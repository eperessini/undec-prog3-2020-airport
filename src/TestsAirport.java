import org.junit.Assert;
import org.junit.Test;

public class TestsAirport {

    @Test
    public void testNewPlane () throws NullAirplaneExceptions {

        Airplane airplane_1 = new Airplane ();
        //airplane_1.createAirplane(0001, "LV-10", "Apache", 3000, null, 2000, null);

        Assert.assertNotNull(airplane_1.createAirplane(0001, "LV-10", "Apache", 3000, null, 2000, null));
        }












}

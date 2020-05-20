import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;
import java.time.Month;



public class TestsPilot {

    public TestsPilot(){}

    @Test
    public void testPilotCreationSuccessful() throws NullAirplaneExceptions {
        LocalDate date = LocalDate.of(1988,Month.MAY,12);

        // In this test, the parameters respect the restrictions
        Assert.assertNotNull(Pilot.createPilot(001,"20-33707738-3",205852,"Peressini","Emiliano",date));
    }

    @Test
    public void testPilotCreationFails () throws NullAirplaneExceptions {
        LocalDate date = LocalDate.of(1988,Month.MAY,12);

        // In this test, the parameter CUIL doesn't respect the restriction (CUIL format)
        Assert.assertNotNull(Pilot.createPilot(001,"20852337077383",205852,"Peressini","Emiliano",date));

        // In this test, the parameter docket doesn't respect the restriction
        Assert.assertNotNull(Pilot.createPilot(001,"20-33707738-3",0,"Peressini","Emiliano",date));

        // In this test, the parameter lastName doesn't respect the restriction
        Assert.assertNotNull(Pilot.createPilot(001,"20-33707738-3",205852,null,"Emiliano",date));

        // In this test, the parameter firstName doesn't respect the restriction
        Assert.assertNotNull(Pilot.createPilot(001,"20-33707738-3",205852,"Peressini",null,date));

        // In this test, the parameter birthDate doesn't respect the restriction (the pilot is not in legal age)
        date = LocalDate.of(2010,Month.MAY,12);
        Assert.assertNotNull(Pilot.createPilot(001,"20-33707738-3",205852,"Peressini","Emiliano",date));

    }

}

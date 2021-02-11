import junitparams.*;
import org.junit.*;
import org.junit.runner.*;

import java.util.concurrent.*;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class RoverTest {

    @Test
    @Parameters({
            "N,E",
            "E,S",
            "S,W",
            "W,N"
    })
    public void turnsRightClockwise(String startFacing, String endsFacing){
        Rover rover = new Rover(startFacing);
        rover.go("R");
        assertEquals(endsFacing, rover.getFacing());
    }

    @Test
    @Parameters({
            "N,W",
            "W,S",
            "S,E",
            "E,N"
    })
    public void turnsLeftAnticlockwise(String startFacing, String endsFacing){
        Rover rover = new Rover(startFacing);
        rover.go("L");
        assertEquals(endsFacing, rover.getFacing());
    }

}

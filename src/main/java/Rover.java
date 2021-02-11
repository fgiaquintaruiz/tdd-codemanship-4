import java.util.*;

public class Rover {
    private String facing;

    public Rover(String facing) {
        this.facing = facing;
    }

    public void go(String instructions) {

        if("R".equals(instructions)){
            right();
        } else {
            left();
        }

    }

    private void left() {
        turn(new String[]{"N", "W", "S", "E"});
    }

    private void right() {
        turn(new String[]{"N", "E", "S", "W"});
    }

    private void turn(String[] compass) {
        int index = Arrays.asList(compass).indexOf(facing);
        facing = compass[(index + 1) % 4];
    }

    public String getFacing() {
        return this.facing;
    }
}

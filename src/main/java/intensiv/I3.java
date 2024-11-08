package intensiv;

import fopbot.Direction;
import fopbot.Robot;
import fopbot.RobotFamily;
import fopbot.World;

public class I3 {

    static {
        World.setSize(7, 7);
        World.setVisible(true);
    }

    static void putAllCoins() {
        Robot bob = new Robot(2, 2, Direction.RIGHT, 12, RobotFamily.TRIANGLE_BLUE);
        // TODO I3 a)
    }

    static void buildStairs() {
        Robot robot = new Robot(0, 0, Direction.RIGHT, 1000, RobotFamily.TRIANGLE_BLUE);
        // TODO I3 b)
    }

    static void robotRotations() {
        Robot robot = new Robot(3, 3, Direction.RIGHT, 8, RobotFamily.SQUARE_ORANGE);
        // TODO I3 c)
    }

}

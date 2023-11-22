package h04.strategy;

import fopbot.Field;
import fopbot.Robot;

public class MoveByTeleport implements  MoveStrategy{

    public void start(Robot robot, Field field) {
        robot.setField(field.getX(), field.getY());
    }
}

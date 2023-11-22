package h04.strategy;

import fopbot.Field;
import fopbot.Robot;

public interface MoveStrategy {
    public void start(Robot robot, Field field);
}

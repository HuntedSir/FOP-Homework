package h04.strategy;

import fopbot.Direction;
import fopbot.Field;
import fopbot.Robot;
import fopbot.World;

public class MoveByWalk implements  MoveStrategyWithCounter{
    private int moveCount = -1;
    public void start(Robot robot, Field field) {
        this.moveCount=0;
        // Align the robot to the set Y coordinate
        int yVariable = field.getY();
        while (robot.getY() != yVariable) {
            if (robot.getY() < yVariable) {
                while (robot.getDirection() != Direction.UP){
                    robot.turnLeft();
                }
                robot.move();
                this.moveCount++;
            }
            else {
                while (robot.getDirection() != Direction.DOWN){
                    robot.turnLeft();
                }
                robot.move();
                this.moveCount++;
            }
        }

        // Align the robot to the set X coordinate
        int xVariable = field.getX();
        while (robot.getX() != xVariable) {
            if (robot.getX() < xVariable) {
                while (robot.getDirection() != Direction.RIGHT){
                    robot.turnLeft();
                }
                robot.move();
                this.moveCount++;
            }
            else {
                while (robot.getDirection() != Direction.LEFT){
                    robot.turnLeft();
                }
                robot.move();
                this.moveCount++;
            }
        }
    }

    public int getMoveCount() {
        return this.moveCount;
    }
}

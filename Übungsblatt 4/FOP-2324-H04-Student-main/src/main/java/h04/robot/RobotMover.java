package h04.robot;

import fopbot.Field;
import fopbot.Robot;
import h04.selection.FieldSelectionListener;
import h04.strategy.MoveStrategy;

import java.util.ArrayList;
import java.util.List;

public class RobotMover implements FieldSelectionListener {
    private MoveStrategy moveStrategy;
    private List<Robot> robots = new ArrayList<Robot>();
    public RobotMover(MoveStrategy moveStrategy){
        this.moveStrategy = moveStrategy;
    }
    public void addRobot(Robot robot){
        this.robots.add(robot);
    }
    public void onFieldSelection(Field field) {
        for (int i = 0; i<robots.size();i++) {
            this.moveStrategy.start(this.robots.get(i), field);
        }
    }
}

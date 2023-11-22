package h04.robot;

import fopbot.Field;
import fopbot.Robot;
import h04.selection.FieldSelectionListener;
import h04.strategy.MoveStrategy;
import h04.strategy.MoveStrategyWithCounter;

public class MoveableRobot extends Robot implements FieldSelectionListener {
    public MoveStrategy moveStrategy;
    public MoveableRobot(MoveStrategy moveStrategy) {
        super(0, 0);
        this.moveStrategy = moveStrategy;
    }
    public void onFieldSelection(Field field) {
        this.moveStrategy.start(this, field);
        if(this instanceof MoveStrategyWithCounter){
            int counter = ((MoveStrategyWithCounter) this).getMoveCount();
            for (int i = 0; i < counter; i++) {
                this.turnLeft();
            }
        }
    }
}

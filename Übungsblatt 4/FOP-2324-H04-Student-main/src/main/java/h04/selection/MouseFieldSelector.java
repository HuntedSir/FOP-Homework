package h04.selection;

import fopbot.Field;
import fopbot.FieldClickEvent;
import fopbot.FieldClickListener;
import fopbot.World;

public class MouseFieldSelector implements FieldSelector, FieldClickListener {
    private FieldSelectionListener fieldSelectionListener;
    private Field field;
    private boolean firstTimeBeingCalled = true;
    public MouseFieldSelector() {
        World.addFieldClickListener(this);
    }
    public void onFieldClick(FieldClickEvent event) {
        Field clickedField = event.getField();
        if (!this.firstTimeBeingCalled) {
            if(this.field == clickedField){
                fieldSelectionListener.onFieldSelection(clickedField);
            }
        }
        this.firstTimeBeingCalled = false;
        this.field=clickedField;
    }


    public void setFieldSelectionListener(FieldSelectionListener fieldSelectionListener) {
        this.fieldSelectionListener = fieldSelectionListener;
    }
}

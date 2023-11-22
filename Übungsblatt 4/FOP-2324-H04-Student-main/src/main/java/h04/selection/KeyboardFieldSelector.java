package h04.selection;


import fopbot.*;

import java.awt.*;

public class KeyboardFieldSelector implements FieldSelector, KeyPressListener {

    private FieldSelectionListener fieldSelectionListener;
    private boolean firstTimeUsed = true;
    private Field markedField;

    public KeyboardFieldSelector() {
        World.addKeyPressListener(this);
    }

    public void setFieldSelectionListener(FieldSelectionListener fieldSelectionListener) {
        this.fieldSelectionListener = fieldSelectionListener;
    }

    public void onKeyPress(KeyPressEvent event) {

        Key key = event.getKey();
        KarelWorld world = event.getWorld();

        if(this.firstTimeUsed == true){
            this.markedField = world.getField(0,0);
            this.firstTimeUsed = false;
        }


        if (key == Key.UP) {
            this.markedField.setFieldColor(null);
            this.markedField = world.getField(this.markedField.getX(), (this.markedField.getY() + 1) % World.getHeight());
            this.markedField.setFieldColor(Color.RED);
        }
        if (key == Key.DOWN) {
            this.markedField.setFieldColor(null);
            int y = this.markedField.getY() - 1;
            if(y<0) {
                this.markedField = world.getField(this.markedField.getX(), World.getHeight()-1);
            }
            else {
                this.markedField = world.getField(this.markedField.getX(), y);
            }
            this.markedField.setFieldColor(Color.RED);
        }
        if (key == Key.LEFT) {
            this.markedField.setFieldColor(null);
            int x = this.markedField.getX() - 1;
            if(x<0) {
                this.markedField = world.getField(World.getWidth()-1, this.markedField.getY());
            }
            else {
                this.markedField = world.getField(x, this.markedField.getY());
            }
            this.markedField.setFieldColor(Color.RED);
        }
        if (key == Key.RIGHT) {
            this.markedField.setFieldColor(null);
            this.markedField = world.getField((this.markedField.getX() + 1) % World.getWidth(), this.markedField.getY());
            this.markedField.setFieldColor(Color.RED);
        }

        if(key == Key.SPACE){
            if (this.markedField != null){
                fieldSelectionListener.onFieldSelection(this.markedField);
            }
        }


    }
}

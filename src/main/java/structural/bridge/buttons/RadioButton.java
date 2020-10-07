package structural.bridge.buttons;

public class RadioButton extends Button {
    protected Sizeable sizeable;

    public RadioButton(Sizeable sizeable) {
        this.sizeable = sizeable;
    }

    public void draw() {
        sizeable.setSize();
        System.out.println("Drawing a radio button.\n");
    }

}

package structural.bridge.buttons;

public class DropdownButton extends Button {
    protected Sizeable sizeable;

    public DropdownButton(Sizeable sizeable) {
        this.sizeable = sizeable;
    }

    public void draw() {
        sizeable.setSize();
        System.out.println("Drawing a dropdown button.\n");
    }

}

package structural.bridge.buttons;

public class CheckboxButton extends Button {

    protected Sizeable sizeable;

    public CheckboxButton(Sizeable sizeable) {
        this.sizeable = sizeable;
    }

    public void draw() {
      sizeable.setSize();
      System.out.println("Drawing a checkbox button.\n");
    }

}

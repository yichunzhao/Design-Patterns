package structural.bridge.buttons;

/**
 * Button has different types of sub-buttons; each button has small, medium and large sizes.
 * <p>
 * SizedButton->FunctionButton->Button
 */
public class Canvas {

    public static void main(String[] args) {

        CheckboxButton checkboxButton = new CheckboxButton(new Small());
        checkboxButton.draw();

        RadioButton radioButton = new RadioButton(new Medium());
        radioButton.draw();

        DropdownButton dropdownButton = new DropdownButton(new Large());
        dropdownButton.draw();
    }

}

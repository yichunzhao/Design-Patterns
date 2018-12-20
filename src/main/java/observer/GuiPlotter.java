package observer;

import lombok.Getter;
import lombok.Setter;

import java.util.Observable;
import java.util.Observer;

/**
 * @author YNZ
 */
public class GuiPlotter implements Observer {
    @Getter
    @Setter
    private Double value;

    @Override
    public void update(Observable o, Object value) {
        setValue((Double) value);

    }
}

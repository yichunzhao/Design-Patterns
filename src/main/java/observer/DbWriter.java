package observer;

import lombok.Getter;
import lombok.Setter;

import java.util.Observable;
import java.util.Observer;

/**
 * @author YNZ
 */
public class DbWriter implements Observer {
    @Setter
    @Getter
    private Double value;

    @Override
    public void update(Observable o, Object value) {
        setValue((Double) value);
    }
}

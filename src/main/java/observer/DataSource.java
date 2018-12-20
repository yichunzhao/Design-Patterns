package observer;

import lombok.Getter;

import java.util.Observable;

/**
 * @author YNZ
 */

public class DataSource extends Observable {

    @Getter
    private Double value;

    public void setValue(Double value) {
        this.value = value;
        setChanged();
        notifyObservers(value);
    }
}

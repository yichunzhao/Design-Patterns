package statepattern;

/**
 * @author YNZ
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}

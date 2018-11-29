package observer;

/**
 * @author YNZ
 */
public class DbWriter implements Observer {

    @Override
    public void update() {
        System.out.println("update database entries ...");
    }
}

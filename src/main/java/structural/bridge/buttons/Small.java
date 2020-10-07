package structural.bridge.buttons;

public class Small implements Sizeable {
    @Override
    public void setSize() {
        System.out.println("Setting size to small...");
    }
}

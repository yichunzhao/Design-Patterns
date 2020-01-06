package commandPattern;

public class Receiver {
    //receiver receiving commands from an invoker.
    private Command command;

    public Receiver(Command command) {
        this.command = command;
    }

    public void doSomething(){
        System.out.println("Receiver is doing something here");
    }


}

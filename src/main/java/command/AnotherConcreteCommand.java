package command;

public class AnotherConcreteCommand implements Command {
    //receiver of command.
    private AnotherReceiver receiver;

    public AnotherConcreteCommand(AnotherReceiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doSomethingElse();
    }
}

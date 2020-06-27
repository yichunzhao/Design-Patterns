package command;

public class ClientSide {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        AnotherReceiver anotherReceiver = new AnotherReceiver();

        Command concreteCommand = new ConcreteCommand(receiver);
        Command anotherConcreteCommand = new AnotherConcreteCommand(anotherReceiver);

        Invoker invoker = new Invoker();
        invoker.setAnotherConcreteCommand(anotherConcreteCommand);
        invoker.setConcreteCommand(concreteCommand);

        invoker.invokingAnotherConcreteCommand();
        invoker.invokingConcreteCommand();
    }

}

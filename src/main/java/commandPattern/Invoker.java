package commandPattern;

/**
 * invoker fires a command, and then command ask the receiver to execute.
 *
 */
public class Invoker {
    //invoker has a concrete command(an invoker owns commands)
    //an command is aggregated with an invoker
    //using an interface to decoupling the impl. from implementation.
    private Command concreteCommand;

    //invoker gives another concrete command
    private Command anotherConcreteCommand;

    public Invoker(){}

    //command has an independent life cycle.
    public void setConcreteCommand(Command concreteCommand) {
        this.concreteCommand = concreteCommand;
    }

    public void setAnotherConcreteCommand(Command anotherConcreteCommand) {
        this.anotherConcreteCommand = anotherConcreteCommand;
    }

    public void invokingConcreteCommand(){
        concreteCommand.execute();
    }

    public void invokingAnotherConcreteCommand(){
        anotherConcreteCommand.execute();
    }

}

package statepattern;

import java.util.Optional;

/**
 * @author YNZ
 */
public class UsingStatePattern {

    public static void main(String[] args) {
        Context context = new Context();


        if(!Optional.ofNullable(context.getState()).isPresent()){
            State start = new StartState();
            start.doAction(context);

            System.out.println(context.getState().toString());
        }


        if (context.getState() instanceof StartState) {
            State stop = new StopState();
            stop.doAction(context);

            System.out.println(context.getState().toString());
        }


    }
}

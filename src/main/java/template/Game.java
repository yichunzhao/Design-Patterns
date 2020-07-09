package template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
abstract class Game {

    //a step can be customized.
    abstract void initialize();

    //a step can be customized.
    abstract void startPlay();

    final void play() {
        initialize();
        startPlay();
        endPlay();
    }

    //if there is a common step
    private void endPlay() {
        log.info("Game over!");
    }

}

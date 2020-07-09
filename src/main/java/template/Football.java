package template;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data(staticConstructor = "instance")
public class Football extends Game {
    @Override
    void initialize() {
        log.info("Preparing to play a football game.");
    }

    @Override
    void startPlay() {
        log.info("Playing a football game.");
    }

}

package template;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data(staticConstructor = "instance")
public class Cricket extends Game {

    @Override
    void initialize() {
        log.info("preparing to play a cricket game.");
    }

    @Override
    void startPlay() {
        log.info("Playing the cricket game.");
    }

}

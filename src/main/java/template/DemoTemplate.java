package template;

import lombok.extern.slf4j.Slf4j;

/**
 * If a procedure that is carried out in steps and in a fixed order, then a template pattern maybe a model to
 * present it.
 */
@Slf4j
public class DemoTemplate {

    public static void main(String[] args) {
        Cricket.instance().play();
        Football.instance().play();
    }
}

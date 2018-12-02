package statepattern;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author YNZ
 */
@NoArgsConstructor
@Getter
@Setter
public class Context {
    private  State state;
}

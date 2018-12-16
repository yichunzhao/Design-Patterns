package VisitorPattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * @author YNZ
 */

@Builder
@AllArgsConstructor
public class CarEngine implements Visitable {
    @Getter
    private float volume;

    @Override
    public void accept(CarVisitor visitor) {
        visitor.visitEngine(this);
    }
}

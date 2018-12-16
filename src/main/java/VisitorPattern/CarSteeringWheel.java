package VisitorPattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * @author YNZ
 */

@Builder
@AllArgsConstructor
public class CarSteeringWheel implements Visitable {
    @Getter
    private boolean straightUp;

    @Override
    public void accept(CarVisitor visitor) {
        visitor.visitSteeringWheel(this);


    }
}

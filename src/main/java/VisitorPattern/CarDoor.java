package VisitorPattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * @author YNZ
 */

@Builder
@AllArgsConstructor
public class CarDoor implements Visitable {
    @Getter
    private int numberOfDoors;

    @Override
    public void accept(CarVisitor visitor) {
        visitor.visitDoor(this);
    }
}

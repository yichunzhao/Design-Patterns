package VisitorPattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * @author YNZ
 */

@Builder
@AllArgsConstructor
public class CarTyre implements Visitable {
    @Getter
    private String brand;

    @Override
    public void accept(CarVisitor visitor) {
        visitor.visitTyre(this);

    }
}

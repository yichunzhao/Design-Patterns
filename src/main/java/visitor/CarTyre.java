package visitor;

import lombok.AllArgsConstructor;
import lombok.Builder;

/**
 * @author YNZ
 */
@Builder
@AllArgsConstructor
public class CarTyre implements Visitable {

    private String brand;

    public String getBrand() {
        return brand;
    }

    @Override
    public void accept(CarVisitor visitor) {
        visitor.visitTyre(this);
    }
}

package strategypattern;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * @author YNZ
 */

public class Isosceles implements TriangleTypeIdentifier {

    public Boolean identify(double a, double b, double c) {
        boolean isIsosceles = false;

        Set<Double> sides = Stream.of(a, b, c).collect(Collectors.toSet());

        return sides.size() == 2;
    }
}

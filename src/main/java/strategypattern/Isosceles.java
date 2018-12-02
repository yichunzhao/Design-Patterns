package strategypattern;

import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * @author YNZ
 */

public class Isosceles implements TriangleTypeIdentifier {

    public Boolean identify(double a, double b, double c) {
        return Stream.of(a, b, c).collect(Collectors.toSet()).size() == 2;
    }
}

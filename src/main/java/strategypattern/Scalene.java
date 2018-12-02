package strategypattern;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toSet;

/**
 * @author YNZ
 */

public class Scalene implements TriangleTypeIdentifier {

    public Boolean identify(double a, double b, double c) {
        return Stream.of(a, b, c).collect(toSet()).size() == 3;
    }
}

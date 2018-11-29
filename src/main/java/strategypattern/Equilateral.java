package strategypattern;

/**
 * @author YNZ
 */

public class Equilateral implements strategypattern.TriangleTypeIdentifier {

    public Boolean identify(double a, double b, double c) {
        Boolean isEquilateral = false;
        if (a == b && b == c) isEquilateral = true;
        return isEquilateral;
    }
}

package strategypattern;

/**
 * @author YNZ
 */

public class Scalene implements strategypattern.TriangleTypeIdentifier {

    public Boolean identify(double a, double b, double c) {
        return false;
    }
}

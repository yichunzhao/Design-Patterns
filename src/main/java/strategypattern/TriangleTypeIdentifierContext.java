package strategypattern;

/**
 * @author YNZ
 */
public class TriangleTypeIdentifierContext {
    private TriangleTypeIdentifier identifier;

    public TriangleTypeIdentifierContext(TriangleTypeIdentifier identifier) {
        this.identifier = identifier;
    }

    public Boolean execute(double a, double b, double c){
        return this.identifier.identify(a, b, c);

    }
}

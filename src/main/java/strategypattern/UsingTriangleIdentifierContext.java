package strategypattern;

/**
 * @author YNZ
 */
public class UsingTriangleIdentifierContext {

    public static void main(String[] args) {
        double a = 1;
        double b = 3;
        double c = 4;

        TriangleTypeIdentifierContext context = new TriangleTypeIdentifierContext(new Equilateral());
        Boolean result = context.execute(a, b, c);
        if (result) System.out.println("this is an equilateral ...");

    }
}

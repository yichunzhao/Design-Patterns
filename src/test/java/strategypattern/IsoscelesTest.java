package strategypattern;

import static org.junit.Assert.assertEquals;

/**
 * @author YNZ
 */
public class IsoscelesTest {

    public void whenTwoSideEqual_ThenReturnTrue() {

        double a = 10;
        double b = 20;
        double c = 10;

        strategypattern.Isosceles isosceles = new strategypattern.Isosceles();
        boolean actual = isosceles.identify(a, b, c);

        assertEquals(true, actual);


    }


}
package Others.filterpattern;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * @author YNZ
 */
public class CriteriaTest {
    List<Person> persons;

    @Before
    public void setup() {
        persons = Stream.of(
                new Person("mike", Gender.MALE, 16),
                new Person("tom", Gender.MALE, 18),
                new Person("mia", Gender.FEMALE, 28))
                .collect(toList());
    }

    @Test
    public void meetFemaleCriteria() {
        List<Person> females = Criteria.meetFemaleCriteria(persons);
        assertThat(females.size(), is(1));
    }

    @Test
    public void meetMaleCriteria() {
        List<Person> males = Criteria.meetMaleCriteria(persons);
        assertThat(males.size(), is(2));
    }
}
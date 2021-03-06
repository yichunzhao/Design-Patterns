package filterpattern;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author YNZ
 */
public class UsingFilterPattern {

    public static void main(String[] args) {

        List<Person> persons = Stream.of(
                new Person("mike", Gender.MALE, 16),
                new Person("tom", Gender.MALE, 18),
                new Person("mia", Gender.FEMALE, 28))
                .collect(toList());

        List<Person> females = Criteria.meetFemaleCriteria(persons);
        System.out.println("size of females : " + females.size());

        List<Person> males = Criteria.meetMaleCriteria(persons);
        System.out.println("size of males : " + males.size());

    }
}

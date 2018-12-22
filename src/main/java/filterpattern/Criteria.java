package filterpattern;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author YNZ
 */
public interface Criteria {

    static List<Person> meetFemaleCriteria(List<Person> persons) {
        return persons.stream().filter(person -> person.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());
    }

    static List<Person> meetMaleCriteria(List<Person> persons) {
        return persons.stream().filter(person -> person.getGender().equals(Gender.MALE)).collect(Collectors.toList());
    }


}

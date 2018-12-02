package filterpattern;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author YNZ
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(person -> person.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());
    }
}

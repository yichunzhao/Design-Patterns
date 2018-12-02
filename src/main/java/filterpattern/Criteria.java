package filterpattern;

import java.util.List;

/**
 * @author YNZ
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}

package filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YNZ
 */
public class UsingFilterPattern {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        CriteriaFemale criteriaFemale = new CriteriaFemale();
        List<Person> females = criteriaFemale.meetCriteria(persons);
        System.out.println("size of females : " + females.size());

        CriteriaMale criteriaMale = new CriteriaMale();
        List<Person> males = criteriaMale.meetCriteria(persons);
        System.out.println("size of males : " + males.size());


    }
}

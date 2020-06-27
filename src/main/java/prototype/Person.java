package prototype;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person implements Cloneable<Person> {
    private String name;

    private Address address;

    @Override
    public Person makeCopy() {
        //watch out here, could be a shallow copy or deep copy.
        return new Person(name, new Address(address));
    }
}

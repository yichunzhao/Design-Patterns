package prototype;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {
    private String street;
    private String city;
    private String zip;

    public Address(Address address) {
        this.street = address.street;
        this.city = address.city;
        this.zip = address.zip;
    }
}

package structural.adapter.arrayToList;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor(staticName = "of")
public class Student {

    private final String name;
}

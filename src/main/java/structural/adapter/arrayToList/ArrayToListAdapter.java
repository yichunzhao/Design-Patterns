package structural.adapter.arrayToList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ArrayToListAdapter<T> implements ConvertToList<T> {
    private final T[] ts;

    public ArrayToListAdapter(T... ts) {
        this.ts = ts;
    }

    public static <T> ArrayToListAdapter<T> of(T... ts) {
        return new ArrayToListAdapter<>(ts);
    }

    @Override
    public List<T> toList() {
        return Arrays.stream(ts).collect(Collectors.toList());
    }
}

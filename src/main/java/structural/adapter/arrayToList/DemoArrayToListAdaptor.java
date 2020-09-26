package structural.adapter.arrayToList;

public class DemoArrayToListAdaptor {

    public static void main(String[] args) {
        Integer[] integers = {1, 4, 5, 9};
        ArrayToListAdapter<Integer> integerArrayToListAdapter = new ArrayToListAdapter<>(integers);

        System.out.println("adapted to List:" + integerArrayToListAdapter.toList());
        System.out.println("Student[] adapted to List: " +
                new ArrayToListAdapter<>(Student.of("mike"), Student.of("mia"), Student.of("jack")).toList());
        System.out.println("int[] adapted to List: " + ArrayToListAdapter.of(2, 3, 4).toList());
        System.out.println("String[] adapted to List: " + ArrayToListAdapter.of("red", "blue", "yellow", "black").toList());
    }
}

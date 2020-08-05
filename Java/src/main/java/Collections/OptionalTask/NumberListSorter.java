package Collections.OptionalTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberListSorter {
    public static void main(String[] args) {
        List<Integer> numbers =
                new ArrayList<>(Arrays.asList(2, 5, -21, 51, -12, -23, 0, 1, -7, 101, -36, 42, 18));
        System.out.println(numbers.toString());
        System.out.println();
        numbers.sort((o1, o2) -> o2 - o1);
        System.out.println(numbers.toString());
        System.out.println();
    }
}

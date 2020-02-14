package _java._se._06._collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsSortExample {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("red", "green", "blue");
        Collections.sort(list1);;
        System.out.println(list1);
        List<String> list2 = Arrays.asList("green", "red", "yellow", "blue");
        Collections.sort(list2, Collections.reverseOrder());
        System.out.println(list2);
    }
}

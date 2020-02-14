package _java._se._06._set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Berling");
        set.add("New York");
        TreeSet<String> treeSet = new TreeSet<String>(set);
        System.out.println(treeSet);
        for(Object element : set)
            System.out.println(element.toString() +" ");
    }
}

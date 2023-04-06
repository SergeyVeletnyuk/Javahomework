package homework3.task3;

import java.util.HashSet;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        set1.add(1);
        set1.add(4);
        set1.add(7);
        set1.add(9);

        set2.add(2);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        symmetricSetDifference(set1, set2);
        System.out.println(set1);
        System.out.println(set2);

    }
    public static void symmetricSetDifference(Set<Integer>set1, Set<Integer>set2){
        //creating a new set
        Set<Integer> newSet = new HashSet<Integer>(set1);
        newSet.removeAll(set2);
        set2.removeAll(set1);
        newSet.addAll(set2);
        System.out.println(newSet);
    }
}
package collection;

import java.util.HashMap;
import java.util.HashSet;

public class hash {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<Integer>();
        a.add(12);
        a.add(15);
        a.add(50);
        a.add(12);
        System.out.println(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}

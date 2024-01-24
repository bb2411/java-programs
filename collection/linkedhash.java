package collection;

import java.util.LinkedHashSet;

public class linkedhash {
    public static void main(String[] args) {
        LinkedHashSet<Integer> a = new LinkedHashSet<Integer>();
        a.add(12);
        a.add(15);
        a.add(1);
        a.add(18);
        a.add(1);
        System.out.println(a);
        for (int i : a) {
            System.out.println(i);
            ;
        }
    }
}

package collection;

import java.util.ArrayList;
import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(2);
        a.add(5);
        a.add(9);
        a.add(1);
        a.add(7);
        a.add(18);
        a.add(1);
        a.add(12);
        a.sort(null);
        System.out.println(a);
        // a.removeAll(a);
        // System.out.println(a);
        /*
         * Iterator b = a.iterator();
         * while (b.hasNext()) {
         * System.out.println(b.next());
         * }
         */
        for (int i : a) {
            System.out.println(i);
        }
        
    }

}

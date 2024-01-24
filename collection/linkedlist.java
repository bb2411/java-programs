package collection;

import java.util.*;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<Integer>();
        a.add(10);
        a.add(20);
        a.add(30);
        for (int i : a) {
            System.out.println(i);
        }
    }
}

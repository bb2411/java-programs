package others;

import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        String a[] = { "bhargav", "darshan", "adi", "manthan", "jay" };
        Scanner in = new Scanner(System.in);
        System.out.println(args);
        System.out.print("enter name you want to search :");
        String b = in.next();
        for (int i = 0; i < a.length; i++) {
            if (a[i].equalsIgnoreCase(b)) {
                System.out.println("element is on :" + i);
                System.out.println("data :" + a[i]);
            }
        }
    }
}

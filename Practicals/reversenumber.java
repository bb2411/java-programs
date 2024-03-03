import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("enter number :");
        int a = in.nextInt();
        int rem = a;
        int reverse = 0;
        while (rem > 0) {
            int temp = rem % 10;
            rem = rem - temp;
            rem = rem / 10;
            reverse = reverse * 10 + temp;
        }
        System.out.println("Orignal value :" + a);
        System.out.println("reversed value :" + reverse);
    }
}

import java.util.Scanner;

public class Greatest_of_three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first digit :");
        int a = input.nextInt();
        System.out.println("enter second digit :");
        int b = input.nextInt();
        System.out.println("enter third digit :");
        int c = input.nextInt();
        if (a > b) {
            if (a > c) {
                System.err.println("A is greater" + a);
            } else {
                System.out.println("C is greater" + c);
            }
        } else {
            if (b > c) {
                System.out.println("B is greater" + b);
            } else {
                System.out.println("A is greater" + a);
            }
        }
        input.close();
    }
}

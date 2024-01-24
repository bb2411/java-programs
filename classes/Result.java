import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THREE MARKS :");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int total = a + b + c;
        float per = total * 100 / 300;
        System.out.println("your total marks out of 300 is :" + total);
        System.out.println("your per is :" + per);
        if (a >= 30 && b >= 30 && c >= 30) {
            System.out.println("you are passed");
            System.out.println("your persentage is:" + per);
        } else {
            System.out.println("you are not passed");
            System.out.println("your persentage is:" + per);

        }
    }
}

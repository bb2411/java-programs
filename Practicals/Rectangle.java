import java.util.Scanner;

public class Rectangle {
    int length;
    int weigth;

    Rectangle(int a, int b) {
        length = a;
        weigth = b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter length :");
        int a = in.nextInt();
        System.out.println("Enter weigth :");
        int b = in.nextInt();
        Rectangle c = new Rectangle(a, b);
        System.out.println("legth :" + c.length + " Weigth :" + c.weigth);
        in.close();
    }
}

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter n number :");
        int a = in.nextInt();
        int flag = 0;
        for (int i = 2; i <= a; i++) {
            flag = 0;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    flag = 1;
                }
            }
            if (flag == 1) {
                continue;
            } else {
                System.out.println(i);
            }
            in.close();
        }
    }
}

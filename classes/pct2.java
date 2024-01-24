import java.util.Scanner;

public class pct2 {
    public int fact(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        pct p2 = new pct();
        bhatt w = new bhatt();
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        int w1 = input.nextInt();
        int z = p2.sum(q, w1);
        System.out.println("sum :" + z);
        bhatt.check(q, w1);
    }
}

import java.util.Scanner;

class pct {
    public int sum(int a, int b) {
        System.out.println("PCT FILE CALLED");
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        pct2 q2 = new pct2();
        pct p1 = new pct();
        Scanner input = new Scanner(System.in);
        System.out.println("bhargav bhatt");

        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        int bb = input.nextInt();
        int a = p1.sum(x, y) + bb;
        int b = p1.sum(x, y, z);
        System.out.println("multiplicatioon :" + q2.fact(x, y));
        System.out.println("sum of two number is:" + a);
        System.out.println("sum of three number is :" + b);
    }
}

class bhatt {
    public static int check(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
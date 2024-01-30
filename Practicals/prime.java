public class prime {
    public static void main(String[] args) {
        int a = 13;
        int i = 2;
        int flag = 0;
        while (i < a) {
            if (a % i == 0) {
                System.out.println(i);
                flag = 1;
            }
            i++;
        }
        if (flag == 1) {
            System.out.println("Not a Prime Number");
        } else {
            System.out.println("Prime Number");
        }
    }
}

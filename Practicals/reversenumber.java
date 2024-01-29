public class reversenumber {
    public static void main(String[] args) {
        int a = 1234;
        int rem = a;
        int reverse = 0;
        while (true) {
            int temp = rem % 10;
            rem = rem - temp;
            rem = rem / 10;
            reverse = reverse * 10 + temp;

            if (rem == 0) {
                break;
            }
        }
        System.out.println("Orignal value :" + a);
        System.out.println("reversed value :" + reverse);
    }
}

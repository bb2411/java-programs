public class array {
    public static void main(String[] args) {
        int[] a = { 1, 5, 1, 4, 2, 4, 7, 3, 6, 9 };
        // int[] b = new int[10];
        // Scanner input = new Scanner(System.in);
        /*
         * for (int i = 0; i < 9; i++) {
         * System.out.println("enter element :");
         * a[i] = input.nextInt();
         * }
         */
        System.out.println("array before sorting");
        for (int i = 0; i <= 9; i++) {
            System.out.println("element :" + a[i]);
        }
        // int max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("array after sorting");
        for (int i = 0; i < a.length; i++) {
            System.out.println("element :" + a[i]);
        }
    }
}
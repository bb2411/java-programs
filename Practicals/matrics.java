import java.util.Scanner;

public class matrics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] a = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(" Enter a[%d][%d] :", i, j);
                a[i][j] = in.nextInt();
            }
            System.out.println();
        }
        int[][] b = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(" Enter b[%d][%d] :", i, j);
                b[i][j] = in.nextInt();
            }
            System.out.println();
        }
        int[][] c = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(" %2d ", c[i][j]);
            }
            System.out.println();
        }
        in.close();
    }
}
public class constover {
    int a;
    int b;

    constover(int x) {
        a = x;
    }

    constover(int x, int y) {
        a = x;
        b = y;
    }

    public static void main(String[] args) {
        constover a = new constover(25);
        constover b = new constover(10, 20);
        System.out.println("value of (a,b) of a :(" + a.a + "," + a.b + ")");
        System.out.println("value of (a,b) of b :(" + b.a + "," + b.b + ")");
    }
}

public class Rectangle {
    int length;
    int weigth;

    Rectangle(int a, int b) {
        length = a;
        weigth = b;
    }

    public static void main(String[] args) {
        Rectangle a = new Rectangle(5, 10);
        System.out.println("legth :" + a.length + " Weigth :" + a.weigth);
    }
}

public class Shape {
    static double pi = Math.PI;

    public void area(float radius) {
        System.out.println("area of circle :" + (2 * (pi * (radius * radius))));
    }

    public void area(float length, float width) {
        System.out.println("area of sqare :" + (length * width));
    }

    public static void main(String[] args) {
        Shape a = new Shape();
        a.area(5);
        a.area(5, 10);
    }
}

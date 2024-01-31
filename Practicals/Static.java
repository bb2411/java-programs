public class Static {
    static int a;

    public void adda() {
        a++;
    }

    public static void main(String[] args) {
        Static s1 = new Static();
        s1.adda();
        System.out.println("Value of a after increment using s1 :" + Static.a);
        System.out.println("value of a without any object :" + Static.a);
    }
}

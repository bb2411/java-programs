public class Useofthis {
    int a;

    public int getthisvalue(int a) {
        int sum = a + a;
        return sum;
    }

    public static void main(String[] args) {
        Useofthis a = new Useofthis();
        a.a = 10;
        System.out.println("Adding 2 number one from the class instance and another will be passed by user");
        System.out.println("Addition :" + a.getthisvalue(20));
    }
}

package others;

public class constructor {
    int id;
    String name;

    public constructor(int i, String pname) {
        id = i;
        name = pname;
    }

    public void get() {
        System.out.println("id:" + id);
        System.out.println("name:" + name);
    }

    public static void main(String[] args) {
        constructor a = new constructor(150, "bhargav");
        a.get();
    }
}

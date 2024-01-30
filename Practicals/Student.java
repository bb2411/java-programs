public class Student {
    int enrollno;
    String name;

    public static void main(String[] args) {
        Student a = new Student();
        Student b = new Student();
        Student c = new Student();
        b.name = "aditya";
        c.name = "darshan";
        a.name = "bhargav";
        a.enrollno = 226090307;
        c.enrollno = 123423;
        b.enrollno = 332312;
        System.out.println("Name :" + a.name + "  Enrollment No. :" + a.enrollno);
        System.out.println("Name :" + b.name + "  Enrollment No. :" + b.enrollno);
        System.out.println("Name :" + c.name + "  Enrollment No. :" + c.enrollno);
    }
}

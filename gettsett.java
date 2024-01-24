class emp {
    int id;
    String name;
    public int getId() {
        return id;
    }
    public void setId(int sid) {
        id = sid;
    }
    public String getName() {
        return name;
    }
    public void setName(String sname) {
        name = sname;
    }
}
public class gettsett {
    public static void main(String[] args) {
        emp a = new emp();
        a.setId(123);
        a.setName("bhargav bhatt");
        System.out.println("employee id :" + a.getId());
        System.out.println("employee name :" + a.getName());
    }
}

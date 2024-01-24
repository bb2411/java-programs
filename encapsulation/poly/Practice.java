package poly;

class Practice1 {
    public void print() {
        System.out.println("HELLO ITS PRACTICE CLASS PRINT FUNCTION");
    }
}

class derived extends Practice1 {
    public void print() {
        System.out.println("YOU ARE IN DERIVED CLASS");
    }
}

public class Practice {
    public static void main(String[] args) {
        Practice1 a = new derived();
        a.print();
    }
}

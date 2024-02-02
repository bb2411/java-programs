public class stringfun {
    public static void main(String[] args) {
        String name = "bhargav";
        System.out.println("STRING :" + name);
        System.out.println("LENGTH OF STRING :" + name.length());
        String[] spited = name.split("");
        System.out.println("Array of string containing each elements :");
        for (String string : spited) {
            System.out.println(string);
        }
        System.out.println("String Format :" + String.format(name));
        System.out.println("1 index of string :" + name.charAt(1));
        System.out.println("AV is in String or not :" + name.contains("av"));
    }
}
public class stringfun {
    public static void main(String[] args) {
        String name = "bhargav";
        System.out.println("STRING :" + name);
        System.out.println("LENGTH OF STRING :" + name.length());
        String[] spited = name.split("");
        System.out.println("Array of string containing each elements :");
        for (String string : spited) {
            System.out.print(" " + string + " ");
        }
        System.out.println();
        System.out.println(String.format("string is %s", name));
        System.out.println("1 index of string :" + name.charAt(1));
        System.out.println("AV is in String or not :" + name.contains("av"));
    }
}
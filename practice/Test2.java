package practice;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int roll;
        String name;
        String email;
        String dep;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Student information u want");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Student name :");
            name = s.nextLine();
            System.out.println("Enter Student Enrollment :");
            roll = s.nextInt();
            System.out.println("Enter Email of the Student : ");
            email = s.nextLine();
            System.out.println("Enter Department of the Student :");
            dep = s.nextLine();
        }
        System.out.println("The Imofmation are as follows::\n\n");
        System.out.println("Student Name:" + name);
        System.out.println("Student Enroll:" + roll);
        System.out.println("Student Email:" + email);
        System.out.println("Student Depatment:" + dep);
    }
}
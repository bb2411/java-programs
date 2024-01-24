package others;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}

public class Studentdetail {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Add students
        while (true) {
            System.out.print("Enter student name (or 'exit' to stop): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter student age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            System.out.print("Enter student course: ");
            String course = scanner.nextLine();

            Student student = new Student(name, age, course);
            students.add(student);
        }

        // Display student details
        System.out.println("\nStudent Details:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Course: " + student.getCourse());
            System.out.println();
        }
    }
}

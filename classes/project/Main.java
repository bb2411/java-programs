package project;

import java.util.Scanner;

public class Main {
    static int num;
    static Scanner input = new Scanner(System.in);
    Entity b[] = new Entity[100];

    public void add() {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER NUM OF GOODS YOU WANT TO ADD :");
        int n = in.nextInt();
        for (int i = num; i < num + n; i++) {
            System.out.println("PRODUCT NUM :" + i);
            b[i].setId();
            b[i].setName();
            b[i].setRate();
            System.out.flush();
        }
    }

    public void bill() {

    }

    public static void main(String[] args) {
        Main call = new Main();
        System.out.println("1,ADD GOODS ");
        System.out.println("2,BILL ");
        System.out.print("select option :");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                call.add();
                break;
            case 2:
                call.bill();
                break;
            default:
                System.out.println("invalid input");
                break;
        }
    }
}

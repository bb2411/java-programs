package project;

import java.util.Scanner;

public class Entity {
    int id;
    String name;
    int rate;
    static Scanner in = new Scanner(System.in);

    public int getId() {
        return id;
    }

    public void setId() {
        System.out.println("enter id of product :");
        id = in.nextInt();
    }

    public String getName() {
        return name;
    }

    public void setName() {
        System.out.println("enter name of product  :");
        name = in.nextLine();
    }

    public int getRate() {
        return rate;
    }

    public void setRate() {
        System.out.println("enter rate of product  :");
        rate = in.nextInt();
    }
}

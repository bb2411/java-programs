class Animal {
    void animal() {
        System.out.println("Animal class");
    }
}

class Dog extends Animal {
    void andog() {
        System.out.println("Animal extends to dog class");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.animal();
        dog.animal();
        dog.andog();
    }
}

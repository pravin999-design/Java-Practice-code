class Animal {
    void eat() {
        System.out.println("I can eat");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("I can bark");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("I can weep");
    }
}

public class Main {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();   // from Animal
        p.bark();  // from Dog
        p.weep();  // from Puppy
    }
}

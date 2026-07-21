package javaDemos;

class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Bark");
    }
}

public class UpcastingDemo{
    public static void main(String[] args) {
        Animal a = new Dog();
         // there is no bark() method in the reference class so it give the compile time error
        //it is not consider for the runtime actual object cheking so its not overriding
        //a.bark();   // Compile Error
        a.eat();
    }
}

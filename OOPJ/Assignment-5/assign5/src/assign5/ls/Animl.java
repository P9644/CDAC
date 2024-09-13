package assign5.ls;
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);  
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}
public class Animl {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        animal.eat();
        animal.sleep();

        Dog dog = new Dog("Buddy");
        dog.eat();    
        dog.sleep();  
        dog.bark();   
    }
}

/*
3)	Create a base class Animal with attributes like name, and methods like eat() and sleep(). Create a subclass Dog that inherits from Animal and has an additional method bark(). Write a program to demonstrate the use of inheritance by creating objects of Animal and Dog and calling their methods.
*/
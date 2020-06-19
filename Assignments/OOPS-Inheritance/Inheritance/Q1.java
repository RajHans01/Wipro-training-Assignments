Create a class named ‘Animal’ which includes methods like eat() and sleep().

Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly().

Create an instance of Animal class and invoke the eat and sleep methods using this object.

Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.
================================================================================================================
class Animal {
public Animal() {
    System.out.println("A new animal has been created!");
}   
public void sleep() {
    System.out.println("An animal sleeps...");
}
public void eats() {
    System.out.println("An animal eats...");
}
}

class Bird  extends Animal {

public Bird() {
    System.out.println("A new bird has been created!");
}
public void sleep() {
    System.out.println("A bird sleeps...");
}
public void eats() {
    System.out.println("A bird eats...");
}

}

public class E1 {

public static void main(String[] args) {
    Animal animal = new Animal();
    Bird bird = new Bird();
    bird.sleep();
    bird.eats();
    animal.sleep();
    animal.eats();
}
}

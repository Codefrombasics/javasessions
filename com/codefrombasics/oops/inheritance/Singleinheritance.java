package com.codefrombasics.oops.inheritance;
class Animal{
    String name="Mojo";
    void displayAnimalName(){
        System.out.println("name "+name);
    }
}

class Dog extends Animal{
//    String name="Jhonny";
    void displayAnimalName(){
        System.out.println("name "+name.toUpperCase());
    }

}
public class Singleinheritance {
    public static void main(String[] args) {
//        Dog dog=new Dog();
//        dog.displayAnimalName();
        Animal animal=new Animal();
        animal.displayAnimalName();

    }
}

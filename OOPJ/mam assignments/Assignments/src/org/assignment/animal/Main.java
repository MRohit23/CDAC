package org.assignment.animal;

class Animal {
 protected String name;

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

public class Main {
 public static void main(String[] args) {

     Animal animal = new Animal("Generic Animal");
     System.out.println("Animal Object:");
     animal.eat();
     animal.sleep();

     Dog dog = new Dog("Buddy");
     System.out.println("\nDog Object:");
     dog.eat();  
     dog.sleep(); 
     dog.bark();  
 }
}

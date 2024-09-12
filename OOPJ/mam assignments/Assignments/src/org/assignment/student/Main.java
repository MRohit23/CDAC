package org.assignment.student;

class Student {
 
 private String name;
 private int age;
 private String course;
 private String studentID;

 
 public Student(String name, int age, String course, String studentID) {
     this.name = name;
     this.age = age;
     this.course = course;
     this.studentID = studentID;
 }

 public void displayDetails() {
     System.out.println("Student Details:");
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Course: " + course);
     System.out.println("Student ID: " + studentID);
 }
}

public class Main {
 public static void main(String[] args) {
     Student student = new Student("Alice Johnson", 21, "Computer Science", "CS20240123");
     
     student.displayDetails();
 }
}

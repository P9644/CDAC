package assign5.ls;

class Student {
 private String name;
 private int age;
 private String studentID;

 public Student(String name, int age, String studentID) {
     this.name = name;
     this.age = age;
     this.studentID = studentID;
 }

 public void displayDetails() {
     System.out.println("Student Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Student ID: " + studentID);
 }
}

public class Stud {
 public static void main(String[] args) {
     Student student1 = new Student("Mayank", 19, "S23545");

     student1.displayDetails();
 }
}
/*4)	Build a class Student which contains details about the Student and compile and run its
instance.
*/

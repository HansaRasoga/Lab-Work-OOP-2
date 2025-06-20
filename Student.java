import java.util.Scanner;
public class Student
{
// Class variables to hold student details
private String name;
private int age;
private String grade;

public void input()
{
// Create a Scanner object to read input from the console
Scanner sc = new Scanner(System.in);
System.out.print("Enter student name: ");
name = sc.nextLine();
System.out.print("Enter student age: ");
age = sc.nextInt();
sc.nextLine(); // Consume the newline character left by nextInt
System.out.print("Enter student grade: ");
grade = sc.nextLine();
// Close the scanner to prevent resource leaks
sc.close();
}

public void print()
{
System.out.println("Student details:");
System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("Grade: " + grade);
}

public static void main(String[] args)
{
// Create an instance of Student and call input and print methods
Student student = new Student();

student.input();

student.print();   

}
<<<<<<< HEAD
=======

>>>>>>> 82da058ba1fcac0e81c5c61f44e0c5b2540f0cb1
}
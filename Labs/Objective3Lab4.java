import java.util.Scanner;

public class Objective3Lab4 {
  public static void main (String[] args){

    String firstName, lastName;
    int age;

    Scanner keyboard = new Scanner(System.in);


    System.out.print("What is your First Name?");
    firstName = keyboard.next();

    System.out.print("What is your Last Name?");
    lastName = keyboard.next();

    System.out.print("What is your age?");
    age = keyboard.nextInt();


    System.out.println("First Name: " + firstName +", " + "Last Name: " + lastName + ", " + "Age: " + age);

    keyboard.close();
  }
}

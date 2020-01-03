import java.util.Scanner;

public class Objective3Lab3{
  public static void main (String[] args){
    int birthyear, age ,currentyear;


    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter your age: ");
    age = keyboard.nextInt();

    System.out.print("Enter the current year: ");
    currentyear = keyboard.nextInt();

    System.out.println("You are born in " + (currentyear - age) + ".");


    keyboard.close();




  }
}

import java.util.Scanner;

public class ShallowGrandmother{
  public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);

    int age;
    double income,cute;
    boolean allowed, allowed2;

    System.out.print("Enter your age: ");
    age = keyboard.nextInt();

    System.out.print("Enter you income: ");
    income = keyboard.nextDouble();

    System.out.print("Rate your cuteness (0.0 -10.0): ");
    cute = keyboard.nextDouble();

    allowed = (age > 25 && age < 40 && (income >= 50000 || cute >= 8.6) );
    allowed2 = (age >=30 && cute >=7);


    System.out.println("Grandmother Approves : " + allowed);
    System.out.println("Second Grandmother Approves : " + allowed2);
    



  }

}

import java.util.Scanner;

public class Objective3Lab2{
  public static void main(String[] args){

    String name;

    Scanner keyboard = new Scanner(System.in);

    System.out.println("What is your name? ");
    name = keyboard.next();


    System.out.println("Hello "+ name);

    keyboard.close();



  }
}

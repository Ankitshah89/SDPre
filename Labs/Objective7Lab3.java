import static java.lang.System.*;
import java.util.Scanner;

public class Objective7Lab3{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int selection;

    while (true){
      printMenu();
      selection = input.nextInt();
      switch(selection){
        case 1: out.println("Hello Human");
          break;
        case 2: out.println("Apples,Bananas, Coconuts");
          break;
        case 3: out.println("Goodbye!");
          input.close();
          return;
      }


    }
  }

  public static void printMenu() {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();
    }

}

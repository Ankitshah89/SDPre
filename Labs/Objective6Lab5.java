import static java.lang.System.*;
import java.util.Scanner;

public class Objective6Lab5{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int selection;

    while (true){
      out.println("_____Menu_____");
      out.println("1: Say Hello");
      out.println("2: List My favorite foods");
      out.println("3: Exit");
      out.println();

      selection = input.nextInt();

      switch (selection){
        case 1: out.println("Hello Human");
          break;
        case 2: out.println("Apple, Banana, Mango");
          break;
        case 3: out.println("Goodbye!");
          input.close();
          return;

        }
    }
  }
}

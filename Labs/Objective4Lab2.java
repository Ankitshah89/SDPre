import static java.lang.System.*;
import java.util.Scanner;

public class Objective4Lab2{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    out.print("Enter the first word: ");
    String first = input.next();

    out.print("Enter the second word: ");
    String second = input.next();

    if (second.equals(first)){
      out.println(first + " & " + second + " are the same words.");
    }
    else{
      out.println(first + " & " + second + " are not the same words.");

    }
    out.close();
  }
}

import static java.lang.System.*;
import java.util.Scanner;

public class Objective4Lab4{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    out.print("Enter a number: ");
    double num = input.nextDouble();

    if (num % 2 == 0)
        out.println(num + " is an even number.");
    else
        out.println(num + " is an odd number.");
        input.close();
    }

  }

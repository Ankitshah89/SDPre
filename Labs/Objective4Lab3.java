import static java.lang.System.*;
import java.util.Scanner;

public class Objective4Lab3{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    out.print("Enter the number: ");
    double num = input.nextDouble();

    if (num > 0){
      out.println( num + " is greater than zero.");
    }
    else if (num == 0){
      out.println( num + " is equals to zero.");
    }
    else {
      out.println(num + " is less than zero.");
    }
    input.close();
  }
}

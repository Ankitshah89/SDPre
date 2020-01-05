import static java.lang.System.*;
import java.util.Scanner;

public class SafeSquareRoot{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    double x,y;
    String prot1,prot2;

    prot1 = "yes";

    out.println("Give me a number to find the square root! ");
    out.println("(No Negatives please.)");
    out.print("Are you Ready (Yes/No)? ");
    prot2 = input.next();

    while (!prot2.toLowerCase().equals(prot1)){
      out.print("Are you Ready? ");
      prot2 = input.next();

    }
      out.print("Enter the number: ");
      x = input.nextDouble();
      while (x < 0){
        out.println("Please enter a non-negative numbe. ");
        out.print("New number: ");
        x = input.nextDouble();
      }
      y = Math.sqrt(x);
      out.println("The square root for "+ x + " is "+ y+"\n");
      input.close();
  }
}

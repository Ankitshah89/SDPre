import java.util.Scanner;
import static java.lang.System.*;

public class RunningTotal{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int current = 1, total = 0;

    out.print("Type in a bunch of values and I'll add them up! ");
    out.println("I'll stop when you type in a zero. ");

    /*while ( current != 0 ) {
      out.print("Value: ");
      current = input.nextInt();
      int newTotal = current + total;
      total = newTotal;
      if (current!= 0)
        out.println("Your total is: "+ total);

    }
      out.println("Your final total is: "+ total);*/
    do {
      out.print("Value: ");
      current = input.nextInt();
      total += current;
      if (current != 0)
        out.println("The total so far is: " +total );
    }
    while (current != 0);
    out.println("The final total is: "+ total);


  }
}

import static java.lang.System.*;
import java.util.Scanner;

public class HighLow{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int secret,guess;

    secret = 1 + (int)(100*Math.random());
  

    out.println("Try to guess a number (1-100), that I am thinking ");
    out.print("What did you guess? ");
    guess = input.nextInt();

    while (secret != guess){
      if (secret < guess)
        out.println("Your guess is too high.");
      if (secret > guess)
        out.println("Your guess is too low.");
        out.print("Try again.\n");
        out.print(">>> ");
        guess = input.nextInt();
    }
    out.println("AWESOME. You guessed it! What are the odds?!? ");
  }
}

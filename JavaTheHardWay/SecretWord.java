import java.util.Scanner;

public class SecretWord{
  public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);

    String secret = "please", guess;

    System.out.print("Enter the word: ");
    guess = keyboard.next();

    if (guess.equals(secret) || guess.equals("santa")){
      System.out.println("You chose the correct secret word.");
    }
    else{
      System.out.println("Sorry! That is not correct.");
    }
    if (guess == secret){
      System.out.print("This works");
    }
  }
}

import java.util.Scanner;

public class Objective6Lab1{
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);

    int counter;

    System.out.print("Enter a number: ");
    counter = input.nextInt();

    while (counter > 0){
      System.out.println(counter);
      counter -=1;

    }
  }
}

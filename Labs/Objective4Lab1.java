import static java.lang.System.*;
import java.util.Scanner;

public class Objective4Lab1{
  public static void main (String[] args){

    Scanner input = new Scanner(System.in);

    out.print("Enter the 1st number: ");
    double num1 = input.nextDouble();

    out.print("Enter the 2nd number: ");
    double num2 = input.nextDouble();

    if (num1 > num2){
      out.println(num1 + " is greater than " + num2);
    }
    else if (num1 == num2 ){
      out.println (num1 + " equals " + num2);
    }
    else {
      out.println(num2 + " is greater than "+ num1);
    }
    out.close();
    }

  }

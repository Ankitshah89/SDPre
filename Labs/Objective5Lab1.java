import static java.lang.System.*;
import java.util.Scanner;

public class Objective5Lab1{
  public static void main (String[] args){

    Scanner input = new Scanner(System.in);

    out.print("Enter the month (1-12): ");
    int month = input.nextInt();

    switch (month) {
      case 1:
        out.println("January");
        break;
      case 2:
        out.println("February");
        break;
      case 3:
        out.println("March");
        break;
      case 4:
        out.println("April");
        break;
      case 5:
        out.println("May");
        break;
      case 6:
        out.println("June");
        break;
      case 7:
        out.println("July");
        break;
      case 8:
        out.println("August");
        break;
      case 9:
        out.println("September");
        break;
      case 10:
        out.println("October");
        break;
      case 11:
        out.println("November");
        break;
      case 12:
        out.println("December");
        break;
      default:
        out.println("Please enter a valid month");
        break;
    }
    input.close();
  }
}

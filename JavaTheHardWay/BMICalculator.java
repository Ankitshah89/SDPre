import java.util.Scanner;

public class BMICalculator {
  public static void main (String[] args){

    Scanner keyboard = new Scanner(System.in);

    double m, kg, bmi, in,lbs, ft ;

    System.out.print("Your height (feet only) : ");
    ft = keyboard.nextDouble();

    System.out.print("Your height (inches) : ");
    in = keyboard.nextDouble();

    System.out.print("Your weight in pounds : ");
    lbs = keyboard.nextDouble();


    m = (ft * 0.305)+ in * 0.0254;
    kg = lbs * 0.454;

    bmi = kg/(m*m);

    System.out.println("Your BMI is: " + bmi);


  }
}

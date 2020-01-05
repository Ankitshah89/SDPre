import static java.lang.System.*;
import java.util.Scanner;

public class EnterPin{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
      int pin, entry;
      String password,userPassword;

      password = "hello";
      pin = 12345;

      out.println("WElCOME TO THE JAVA BANK ");
      out.print("Please Enter Your Password: ");
      userPassword = input.next();

      while (!password.equals(userPassword)){
        out.println("\nThis is not the correct password. Try Again!");
        out.print("\nPlease Enter Your Password: ");
        userPassword = input.next();
      }
      out.print("Enter your PIN: ");
      entry = input.nextInt();

      while (entry != pin){
        out.println("\nYou entered an incorrect PIN");
        out.print("Enter your PIN: ");
        entry = input.nextInt();
      }
      out.println("\nPIN ACCEPTED, YOUR ACCOUNT BALANCE IS $519.98.\n");
      }
    }

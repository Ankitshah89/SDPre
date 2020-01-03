import java.util.Scanner;

public class RudeQuestions {
    public static void main(String[] args) {
        String name;
        int age;
        double weight, income;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Hello. What is your name?");
        name = keyboard.next();

        System.out.print("Hi, " + name + "! How old are you?");
        age = keyboard.nextInt();

        System.out.print("So you're " + age + ", eh? That's not very old.");
        System.out.print("How much do you weight, " + name + "?");
        weight = keyboard.nextDouble();

        System.out.print(weight + "! Better keep that quiet!!");
        System.out.print("Finally, what's your income, " + name + "?");
        income = keyboard.nextDouble();

        System.out.print("Hopefully that is " + income + " per hour");
        System.out.println(" and not per year!");
        System.out.print("Well, thanks for answering my rude questions, ");
        System.out.println(name + ".");
        // 1. No, it is initialized as a double.
        // 2. No, string can have anything.
        /* 3. A decimal into a variable.
              A string of chars into a variable declared as int or double.
        */


        String response;
        System.out.println("How do you feel?");
        response = keyboard.next();
        System.out.println("Ok, you feel " + response + ". I will not bother you anymore.");

    }
}

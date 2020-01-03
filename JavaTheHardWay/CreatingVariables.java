public class CreatingVariables {
  public static void main (String[] args){
    int x, y, age, z;
    double seconds, e, checking, weight;
    String firstName,lastName, title, favSports, country;

    x = 10;
    y = 400;
    age = 39;
    z = 100;

    seconds = 4.71;
    e = 2.71828183855904523536;
    checking  = 1.89;
    weight = 145.7;

    firstName = "Ankit";
    lastName = "Shah";
    title = "Mr.";
    favSports = "Soccer";
    country = "USA";

    System.out.println("The variable x contains " + x);
    System.out.println("The value " + y + " is stored in the varible y.");
    System.out.println("The experiment took " + seconds);
    System.out.println("A favourite irrational # is Euler's number: "+ e);
    System.out.println("Hopefully you have more than $" + checking + "!");
    System.out.println("My name's " + title + " " + firstName + lastName);
    System.out.println("I weigh " + weight + " lbs" + " and I give " + z + "%" +" when I play " + favSports + " for "+ country);
  }
}

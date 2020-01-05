import static java.lang.System.*;

public class RandomNumbers{
  public static void main(String[] args){
    int a, b, c, d;
    double r, rps;

    rps = Math.random();
    if (rps < 0.33333){ //will be true 1/3 of the time
      out.println("ROCK");
    }
    else if (rps < 0.666667){
      out.println("PAPER");
    }
    else {
      out.println("SCISSORS");
    }
    //pick four random integers, each 1-10
    a = 1 +(int)(10*Math.random());
    b = 1 +(int)(10*Math.random());
    c = 1 +(int)(10*Math.random());
    d = 1 +(int)(10*Math.random());
    out.println("1-10:\t" + a +"\t" + b + "\t" + c +"\t" + d);

    //pick four random integers, each 1-6
    a = 1 +(int)(6*Math.random());
    b = 1 +(int)(6*Math.random());
    c = 1 +(int)(6*Math.random());
    d = 1 +(int)(6*Math.random());
    out.println("1-6:\t" + a +"\t" + b + "\t" + c +"\t" + d);

    //pick a single random integer, 1-100
    a = 1 +(int)(100*Math.random());
    out.println("1-100:\t" + a +"\t" + b + "\t" + c +"\t" + d);

    //pick four random integers, each 1-100
    a = 1 +(int)(100*Math.random());
    b = 1 +(int)(100*Math.random());
    c = 1 +(int)(100*Math.random());
    d = 1 +(int)(100*Math.random());
    out.println("1-100:\t" + a +"\t" + b + "\t" + c +"\t" + d);

    //pick four random integrees, each 0-99
    a = 0 +(int)(99*Math.random());
    b = 0 +(int)(99*Math.random());
    c = (int)(99*Math.random());
    d = (int)(99*Math.random());
    out.println("0-99:\t" + a +"\t" + b + "\t" + c +"\t" + d);

    //pick four random integers, each 10-20
    a = 10 +(int)(11*Math.random());
    b = 10+(int)(11*Math.random());
    c = 10 +(int)(11*Math.random());
    d = 10 +(int)(11*Math.random());
    out.println("10-20:\t" + a +"\t" + b + "\t" + c +"\t" + d);

    //display four random doubles, each 0-1
    out.println("0-1:\t" + Math.random() + "\t" + Math.random());
    out.println("0-1:\t" + Math.random() + "\t" + Math.random());

    r = 10 * Math.random();
    out.println("0-9.99:\t" + r);
    out.println("0-9:\t" +(int)r);
    out.println("1-10:\t" + (1+(int)r));

    //Study Drill
    a = (int)(1+3*Math.random());
    b = (int)(1+3*Math.random());
    c = (int)(1+3*Math.random());
    out.println("Random number (1-3):\t" + a + "\t" + b + "\t" + c);

    a = (int)(5+6*Math.random());
    b = (int)(5+6*Math.random());
    c = (int)(5+6*Math.random());
    out.println("Random number (5-10):\t" + a + "\t" + b + "\t" + c);

  }
}

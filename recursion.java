import java.util.*;

public class recursion {
  public static void main(String args[]) {
    System.out.println(makeAllSums(3));
    System.out.println(makeAllSums(1));
    System.out.println(makeAllSums(0));
  }
  //Functions to calculate square roots
  public static double sqrt(int input) {
    if (input == 0) throw new IllegalArgumentException();
    return sqrtHelper(input, 1);
  }

  public static double sqrtHelper(int input, double guess) {
    if (Math.abs((guess * guess - input) / input) <= 0.00001) return guess;
    guess =  (input / guess + guess) / 2;
    return sqrtHelper(input, guess);
  }

  //Function(s) to calculate all possible sums
  public static ArrayList<Integer> makeAllSums(int n) {
    ArrayList<Integer> output = new ArrayList<Integer>();
    mas(n, 0, output);
    return output;
  }

  public static void mas(int n, int currentSum, ArrayList<Integer> output) {
    if (n <= 0) {
      output.add(currentSum);
    }
    else {
      mas(n - 1, currentSum + n, output);
      mas(n - 1, currentSum, output);
    }
  }

  public static int fib(int n) {
    
  }
}

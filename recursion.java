import java.util.*;

public class recursion {
  //Functions to calculate square roots
  public static double sqrt(double input, double tolerance) {
    if (input == 0) return 0;
    return sqrtHelper(input, tolerance, 1);
  }

  public static double sqrtHelper(double input, double tolerance, double guess) {
    if (Math.abs((guess * guess - input) / input) <= tolerance * input) return guess;
    guess =  (input / guess + guess) / 2;
    return sqrtHelper(input, tolerance, guess);
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
    return fibHelper(n, 0, 0, 1);
  }

  public static int fibHelper(int n, int currentValue, int previous, int preprevious) {
    if (n <= 0) return currentValue;
    return fibHelper(n - 1, previous + preprevious, previous + preprevious, previous);
  }
}

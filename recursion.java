import java.util.*;

public class recursion {
  public static void main(String[] args) {
    System.out.println("sqrt()");
    System.out.println("-----------------------\n");

    System.out.println("sqrt(4, 0.00001)");
    System.out.println("EXPECTED: 2");
    System.out.println(sqrt(4));         // 2

    System.out.println("----");

    System.out.println("sqrt(8, 0.00001)");
    System.out.println("EXPECTED: ~2.8284");
    System.out.println(sqrt(8));         // ~2.8284

    System.out.println("----");

    System.out.println("sqrt(0, 0.00001)");
    System.out.println("EXPECTED: 0");
    System.out.println(sqrt(0));         // 0

    System.out.println("\n");

    System.out.println("fib()");
    System.out.println("-----------------------\n");

    System.out.println("fib(0)");
    System.out.println("EXPECTED: 0");
    System.out.println(fib(0));                   // 0

    System.out.println("----");

    System.out.println("fib(1)");
    System.out.println("EXPECTED: 1");
    System.out.println(fib(1));                   // 1

    System.out.println("----");

    System.out.println("fib(7)");
    System.out.println("EXPECTED: 13");
    System.out.println(fib(7));                   // 13

    System.out.println("makeAllSums()");
    System.out.println("-----------------------\n");

    System.out.println("makeAllSums(0)");
    System.out.println("EXPECTED: [0]");
    System.out.println(makeAllSums(0));           // [0]

    System.out.println("----");

    System.out.println("makeAllSums(1)");
    System.out.println("EXPECTED: [1, 0]");
    System.out.println(makeAllSums(1));           // [1, 0]

    System.out.println("----");

    System.out.println("makeAllSums(3)");
    System.out.println("EXPECTED: [0, 3, 2, 5, 1, 4, 3, 6]");
    System.out.println(makeAllSums(3));           // [0, 3, 2, 5, 1, 4, 3, 6]
  }
  //Functions to calculate square roots
  public static double sqrt(int input) {
    if (input == 0) return 0;
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
    return fibHelper(n, 0, 0, 1);
  }

  public static int fibHelper(int n, int currentValue, int previous, int preprevious) {
    if (n <= 0) return currentValue;
    return fibHelper(n - 1, previous + preprevious, previous + preprevious, previous);
  }
}

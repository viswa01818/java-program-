package JAVAEASYEG;
import java.util.Scanner;

public class FIbonacciSeries {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of terms: ");
    int n = input.nextInt();

    int a = 0, b = 1, c;
    System.out.print(a + " " + b);

    for (int i = 2; i < n; i++) {
      c = a + b;
      System.out.print(" " + c);
      a = b;
      b = c;
    }
    System.out.println();
  }
}

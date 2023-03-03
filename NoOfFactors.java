package JAVAEASYEG;
import java.util.Scanner;

public class NoOfFactors{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    int factors = 0;

    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        factors++;
      }
    }

    System.out.println("The number of factors of " + number + " is: " + factors);
  }
}

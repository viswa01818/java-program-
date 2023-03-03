package JAVAEASYEG;
import java.util.Scanner;

public class SimpleIntrestCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the principal amount: ");
    int principal = sc.nextInt();
    System.out.print("Enter the number of years: ");
    int years = sc.nextInt();
    System.out.print("Are you a senior citizen (yes/no)? ");
    String answer = sc.next();
    double interestRate;
    if (answer.equalsIgnoreCase("yes")) {
      interestRate = 0.12;
    } else {
      interestRate = 0.10;
    }

    double interest = principal * years * interestRate;
    System.out.println("Simple Interest: " + interest);
  }
}


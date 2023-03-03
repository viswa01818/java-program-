package JAVAEASYEG;

import java.util.Scanner;

public class NthOddNoAfterNOddNo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer n: ");
    int n = sc.nextInt();
    int nthOddNum = 2 * n - 1;
    System.out.println("The " + n + "th odd number after " + n + " odd numbers is: " + nthOddNum);
  }
}


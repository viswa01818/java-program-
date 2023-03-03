package JAVAEASYEG;

import java.util.Scanner;

public class LCM_GCD {
  public static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

  public static int lcm(int a, int b) {
    return (a * b) / gcd(a, b);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int result = arr[0];
    for (int i = 1; i < n; i++) {
      result = lcm(result, arr[i]);
    }
    System.out.println("LCM of the elements is: " + result);
    result = arr[0];
    for (int i = 1; i < n; i++) {
      result = gcd(result, arr[i]);
    }
    System.out.println("GCD of the elements is: " + result);
  }
}

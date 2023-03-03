package JAVAEASYEG;
import java.util.Scanner;

public class CharacterPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Character to be printed: ");
    String character = sc.next();
    System.out.print("Max Number of times printed: ");
    int max = sc.nextInt();
    for (int i = 1; i <= max; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(character + " ");
      }
      System.out.println();
    }
  }
}

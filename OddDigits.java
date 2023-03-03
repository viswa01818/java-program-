package JAVAEASYEG;
import java.util.Scanner;

public class OddDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int digit;

        for (int i = 4; i <= 8; i++) {
            digit = (int) (num / Math.pow(10, i - 1)) % 10;
            if (digit % 2 != 0) {
                System.out.println(digit);
            }
        }
    }
}

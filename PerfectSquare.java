package JAVAEASYEG;
	import java.util.Scanner;

	public class PerfectSquare {
	    public static void main(String[] args) {
	        int num = 16;
	        if (Math.sqrt(num) % 1 == 0) {
	            System.out.println(num + " is a perfect square.");
	        } else {
	            System.out.println(num + " is not a perfect square.");
	        }
	    }
	}

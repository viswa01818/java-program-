package JAVAEASYEG;
public class SquarePattern {
	  public static void main(String[] args) {
	    int max = 4,x=1;
	    for (int i = 1; i <= max; i++) {
	      for(int j =1;j<=i;j++) {
	        System.out.print((x * x) + " ");
	        x++;
	      }
	      System.out.println();
	    }
	  }
}



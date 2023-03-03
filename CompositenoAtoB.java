package JAVAEASYEG;
public class CompositenoAtoB{
	  public static void main(String[] args) {
	    int a = 12, b = 19;
	    System.out.println("Composite numbers between " + a + " and " + b + " are:");
	    for (int i = a; i <= b; i++) {
	      int count = 0;
	      for (int j = 2; j <= i / 2; j++) {
	        if (i % j ==0) {
	          count++;
	          break;
	        }
	      }
	      if(count > 0 && i != 2){
	        System.out.print(i + " ");
	      }
	    }
	  }
	}


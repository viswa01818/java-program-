package JAVAEASYEG;
import java.util.Scanner;

public class EvenFibonacciSum {

public static void main(String[] args) {

int  input,i,sum;

System.out.println("Required packages have been imported"); 
Scanner scanner =new Scanner(System.in);

System.out.println("A reader object has been defined ");

System.out.println("Enter the value of N: ");

input =scanner.nextInt(); 
int fibonacci[] = new int[2*input + 1];

fibonacci[0] =0;
fibonacci[1] =1;

sum=0;

for (i=2; i <- 2* input; i++) {

fibonacci[i]= fibonacci[i-1]+ fibonacci[i - 2];

if (i%2==0)
	sum+=fibonacci[i];
}
System.out.printf("Even sum of fibonacci series till number %d is %d", input, sum);
}
}
package JAVAEASYEG;
public class SeniorCitizen {
	    public static void main(String[] args) {
	        double amount = 50000.0;
	        double Rate = 6.0;
	        int time = 3;
	        boolean isSeniorCitizen = true;

	        double totalInterest;
	        if (isSeniorCitizen) {
	            double seniorCitizenInterestRate = Rate + 0.5;
	            totalInterest = amount * seniorCitizenInterestRate * time / 100.0;
	        } else {
	            totalInterest = amount * Rate * time / 100.0;
	        }

	        double totalAmount = amount + totalInterest;

	        System.out.println("Total interest earned: " + totalInterest);
	        System.out.println("Total amount: " + totalAmount);
}
		}
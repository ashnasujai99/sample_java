package interfaceexample;
import java.util.Scanner;

public class Hdfc implements Rbi {
	public double recurringDeposit(double amount, int duration){
		double maturityAmount = amount + (amount * INTEREST_RATE * duration);
        return maturityAmount;	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the deposit amount: $");
        double depositedAmount = sc.nextDouble();

        System.out.print("Enter the deposit duration (in years): ");
        int depositDuration = sc.nextInt();
        
        Hdfc hdfc = new Hdfc(); 
        double maturityAmount=hdfc.recurringDeposit(depositedAmount, depositDuration);
        
        System.out.println("\nCustomer deposited: $" + depositedAmount);
        System.out.println("After " + depositDuration + " years, the maturity amount is: $" + maturityAmount);


	}

}

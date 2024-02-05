package inheritance;
// Class 3
//Find the total salary (basicpay+hra-pf-deduction+bonus) and get the salary slip
//Salary slip should contains :- basic pay, deduction, hra, pf, bonus and total salary by 
//hand.
public class SalarySlip extends SalaryCalculator {
	
	 public void generateSalarySlip() {
	        // Calculate total salary
	        double totalSalary = basicPay + hra - pf - deduction + bonus;

	        // Display salary slip
	        System.out.println("\nSalary Slip:");
	        System.out.println("Basic Pay: " + basicPay);
	        System.out.println("HRA: " + hra);
	        System.out.println("PF: " + pf);
	        System.out.println("Deduction: " + deduction);
	        System.out.println("Bonus: " + bonus);
	        System.out.println("Total Salary: " + totalSalary);
	    }

	public static void main(String[] args) {
		SalarySlip obj=new SalarySlip();
		obj.getInput();
		obj.salaryDetails();
		obj.PercentageCalc();
		obj.generateSalarySlip();
	}

}

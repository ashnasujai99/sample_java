package inheritance;
// Class 2
//Calculate hra (5% of basic pay) and pf (20% of basic pay).
public class SalaryCalculator extends EmployeeDetails{
 double hra;
 double pf;
 
 public void PercentageCalc() {
	  hra = 0.05 * basicPay;

      pf = 0.20 * basicPay;
      
      System.out.println("the hra is " + hra + "and pf is " + pf);
 }

}

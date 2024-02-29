package abstractclass;
import java.util.Scanner;

public class Contractor extends Employee {
	double HourPayment;
	int WorkingHours;
	 double Salary;
	
	public void calculateSalary() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the hourly payment of Contractor:");
		HourPayment= sc.nextDouble();
		System.out.println("Enter the Working hours Contractor:");
		WorkingHours=sc.nextInt();
        Salary=HourPayment*WorkingHours;
   // return Salary;
    System.out.println("The Salary of Contractor is:"+Salary);
	}
	

}
//double paymentPerHour, int workingHours
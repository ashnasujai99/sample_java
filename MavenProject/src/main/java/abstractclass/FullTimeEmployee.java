package abstractclass;
import java.util.Scanner;
public class FullTimeEmployee extends Employee{
	int WorkingHours=8;
	double HourPayment;
	double Salary1;
	
	
	public void calculateSalary() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the hourly payment of FullTimeEmployee:");
		HourPayment= sc.nextDouble();
		Salary1=HourPayment*8;
		System.out.println("The Salary of fulltime employee: " + Salary1);
	    //return Salary1;
	}
	public static void main(String[] args) {
		
		
		Contractor obj= new Contractor();
		obj.calculateSalary(); 
		
        FullTimeEmployee obj1 = new FullTimeEmployee();
        obj1.calculateSalary();
        
       



	}

}
//double salary
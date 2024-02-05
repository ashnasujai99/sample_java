package inheritance;
import java.util.Scanner;

public class EmployeeDetails {

    double basicPay;
    double deduction;
    double bonus;

    public void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Basic Pay: ");
        basicPay = scanner.nextDouble();

        System.out.print("Enter Deduction: ");
        deduction = scanner.nextDouble();

        System.out.print("Enter Bonus: ");
        bonus = scanner.nextDouble();

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    public void salaryDetails() {
        System.out.println("Basic Salary of the person: " + basicPay);
        System.out.println("Deduction from the salary: " + deduction);
        System.out.println("Bonus for the person: " + bonus);
    }
}

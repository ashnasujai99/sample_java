package polymorphism;
import java.util.Scanner;
//Program to calculate discount If customer purchase clothes on Offseason, set discount 15% and on Onseason 
//40% Should use two classes, Onseason and Offseason Use two methods- discount (method name should be same)
public class OffSeason extends OnSeason{
	 public double calculateDiscount(double purchaseAmount) {
	        return purchaseAmount * 0.15; //1000*0.15
	    }
	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the total purchase amount: ");
	        double purchaseAmount = scanner.nextDouble();//1000

	        // Ask the user to select Onseason or Offseason
	        System.out.println("Select season:");
	        System.out.println("1. Onseason");
	        System.out.println("2. Offseason");

	        // Get user choice
	        System.out.print("Enter your choice (1 or 2): ");
	        int choice = scanner.nextInt();//1 or 2

	        // Create an instance based on user's choice
	        double discount = 0;
                    //1 or2
	        switch (choice) {
	            case 1:
	                OnSeason obj = new OnSeason();
	                discount = obj.calculateDiscount(purchaseAmount);//discount=400
	                break;
	            case 2:
	                OffSeason obj1 = new OffSeason();
	                discount = obj1.calculateDiscount(purchaseAmount);//discount=150
	                break;
	            default:
	                break;
	        }

	        // Display the discount
	        System.out.println("Discount: $" + discount);//400/150

	        // Calculate and display the final amount
	        double finalAmount = purchaseAmount - discount;//1000-400=600,1000-150=850
	        System.out.println("Final Amount after discount: $" + finalAmount);

	    }
	}


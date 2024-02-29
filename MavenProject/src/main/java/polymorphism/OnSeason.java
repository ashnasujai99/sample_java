package polymorphism;
import java.util.Scanner;
//Program to calculate discount If customer purchase clothes on Offseason, set discount 15% and on Onseason 
//40% Should use two classes, Onseason and Offseason Use two methods- discount (method name should be same)
public class OnSeason {
	public double calculateDiscount(double purchaseAmount) {
        return purchaseAmount * 0.40; 
    }
}

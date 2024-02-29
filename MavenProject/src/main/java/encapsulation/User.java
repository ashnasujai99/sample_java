package encapsulation;
import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("Please enter your pin");
int pin_num=sc.nextInt();
Bank obj=new Bank();
obj.setPin(pin_num);
obj.getPin();
obj.validatePin();
	}

}

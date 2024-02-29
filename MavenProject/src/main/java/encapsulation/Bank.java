//Program to withdraw amount from an ATM
//Class 1- Bank
//One method to set pin from ,,User" class and validate
//Pin in another method
//[Valid pins - 1001, 1234, 1212]
//Pin number should declared as private
//Class 2 - User
//Get the pin from User
package encapsulation;
public class Bank {
private int pin;

public int getPin() {
	return pin;
}

public void setPin(int pin) {
	this.pin = pin;
}

public void validatePin() {
	if(pin==1001||pin==1234||pin==1212) {
		System.out.println("Your pin is correct and now you can withdraw your amount");
	}
	else {
		System.out.println("Incorrect pin");

	}
}

}

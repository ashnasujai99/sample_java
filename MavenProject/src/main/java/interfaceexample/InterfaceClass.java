package interfaceexample;

public class InterfaceClass implements SampleInterface {
	
	public void display() {
		System.out.println("the maximum value is " + MAX_VALUE);
	}
	
	public void show() {
		System.out.println("welcome to interface");
	}


	public static void main(String[] args) {
		InterfaceClass obj=new InterfaceClass();
		obj.display();
		obj.show();
		System.out.println("value is " + obj.MAX_VALUE);
		}

}

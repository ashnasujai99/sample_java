package interfaceexample;

public class ChildClass implements Parent1,Parent2 {
	public void display1() {
		System.out.println("this is parent1 interface method");
	}
	public void display2() {
		System.out.println("this is parent2 interface method");
	}
	public void show1() {
		System.out.println("this is parent1 interface print method");

	}
	public void show2() {
		System.out.println("this is parent2 interface print method");

	}
	public static void main(String[] args) {
		ChildClass obj=new ChildClass();
		obj.display1();
		obj.display2();
		obj.show1();
		obj.show2();

	}

}

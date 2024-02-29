package polymorphism;

public class Class2 extends Class1 {
	public void sum(int a,int b) {
		super.sum(40, 20);
		int sum=a+b;
		System.out.println("the sum of the 2 numbers of child class is " + sum);	
	}
	public void show1() {
		
		System.out.println("show1(child)");	
	}
	public static void main(String[] args) {
//		Class2 obj=new Class2();
//		obj.sum(20,30);
	Class1 obj1=new Class2();//upcasting method
		obj1.sum(40,30);
		obj1.show();
//		obj1.show1();

	}

}

package polymorphism;

public class Child extends Parent{
	public Child(int a,int b) {
		super(30,40);
		super.print();
		this.display();
		int mult=a*b;
		System.out.println("product of 2 number is(child constructor) " + mult);
		System.out.println(super.a);
		System.out.println(super.b);
	}
	public void display() {
		System.out.println("print both product and sum(child method)");
	}

	public static void main(String[] args) {
		Child obj=new Child(20,30);
	}

}

package polymorphism;

public class Parent {
	int a,b;
	public Parent(int a,int b) {
		this.a=a;
		this.b=b;
		int sum=a+b;
		System.out.println("sum of two num is(parent constructor)" + sum);
	}
		public void print() {
			System.out.println("print sum of 2 numbers(parent method)");
		}
	}


package exceptionexample;

public class ThrowExceptionExample {

public void add(int a,int b) {
	int sum=a+b;
	if(sum>100) {
		throw new ArithmeticException();
		}
	else {
		System.out.println("sum is less than 100");
	}
	}
public static void main(String[] args) {
	ThrowExceptionExample obj=new ThrowExceptionExample();
	obj.add(50,30);
	}

}

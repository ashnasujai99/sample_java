package polymorphism;
//Program to check the addition result is divisible by 10 
//Class 1 
//Return addition result of two numbers 
//Class 2
//Check the addition result is divisible by 10(use super keyword)
public class DivisibleResult extends AdditionResult {
	public DivisibleResult() {
		int result=super.Addition(30,40);
		if(result%10==0) {
			System.out.println("the number is divisible by 10");
		}
		else {
			System.out.println("the number is not divisible by 10");
		}
		
		
	}

	public static void main(String[] args) {
		DivisibleResult obj=new DivisibleResult();

	}

}

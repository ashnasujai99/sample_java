package exceptionexample;

public class ExceptionEg {

	public static void main(String[] args) {
		int a=10;
		double b=2000.00;
		String s="arya";

		try {
			int result=30/0;
			int arr[]=new int[10];
			arr[15]=70;

		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Division error");
//		}
////		catch(ArithmeticException y) {
////			System.out.println(y);
////		}
//		catch(Exception e) {//parent exception
//			System.out.println(e);
//		}
		finally {//parent exception
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code");

	}

}

package aggregation;

public class AccessModifiers {
	protected int a =30;
	protected void number(){
		System.out.println("the value of the number is " + a);		
	}
	public static void main(String[] args) {
		AccessModifiers obj=new AccessModifiers();
		obj.number();
	}

}

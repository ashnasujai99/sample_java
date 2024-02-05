package inheritance;

public class Daughter extends Father {
	public void dtr() {
		System.out.println("this is my granddaughter");
	}
	public static void main(String[] args) {
		Daughter obj=new Daughter();
		obj.dtr();
		obj.fth();
		obj.gf();
	}

}

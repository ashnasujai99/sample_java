package inheritance;

public class Son extends Father {
	public void sn() {
		System.out.println("this is my grandson");
	}
	public static void main(String[] args) {
		Son obj=new Son();
		obj.sn();
		obj.fth();
		obj.gf();

	}

}

package inheritance;

public class Car extends Vehicle {
int limit=30;
public void speedLimit() {
	System.out.println("speed limit of car is 30");
}
	public static void main(String[] args) {
		Car obj=new Car();
		obj.run();
		obj.speedLimit();
		System.out.println(obj.speed);
		System.out.println(obj.limit);

		
	}

}

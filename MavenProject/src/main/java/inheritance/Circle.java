package inheritance;

public class Circle extends Shape{
String shapeName="circle";
public void area() {
	System.out.println("area of the circle is");
}	public static void main(String[] args) {
Circle obj=new Circle();
obj.area();
obj.shapename();
System.out.println(obj.shapeName);
System.out.println(obj.name);
	}

}

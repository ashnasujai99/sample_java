package inheritance;

public class Square extends Shape{
int a=4;
public void areaSq() {
	System.out.println("area of the square is");
}	
public static void main(String[] args) {
Square obj=new Square();
obj.areaSq();
obj.shapename();
Circle obj1=new Circle();
obj1.area();
System.out.println(obj.a);
System.out.println(obj.name);
	}

}

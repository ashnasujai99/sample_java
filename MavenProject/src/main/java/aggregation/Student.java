package aggregation;

public class Student {
	String name;
	int roll_num;
	Address a;
	public Student(String name,int roll_num,Address a) {
		this.name=name;
		this.roll_num=roll_num;
		this.a=a;
	}
	public void display() {
		System.out.println("Student name = " + name);
		System.out.println("Student roll number = " + roll_num);
		System.out.println("Student house number = " + a.house_num);
		System.out.println("Student pincode = " + a.pincode);
		System.out.println("Student house name = " + a.house_name);
		System.out.println("Student city = " + a.city);

	}

	public static void main(String[] args) {
		Address obj=new Address(304,34567,"rose villa","washington");
		Student obj1=new Student("anu",7,obj);
		obj1.display();
	}

}

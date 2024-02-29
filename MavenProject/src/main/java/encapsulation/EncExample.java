package encapsulation;

public class EncExample {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
//	public void setter(String name,int age) {
//		this.name=name;
//		this.age=age;
//	}
//	public void getter() {
//		System.out.println("name is " + name);
//		System.out.println("age is " + age);
//	}
}

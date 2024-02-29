package aggregation;

import encapsulation.EncExample;

public class EncExample1 {

	public static void main(String[] args) {
		EncExample obj=new EncExample();
//		obj.setter("Anu",24);
//		obj.getter();
	obj.setName("Anu");
	obj.setAge(24);
	System.out.println(obj.getName());
	System.out.println(obj.getAge());
	}

}

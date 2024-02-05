package inheritance;

public class BabyDog extends Dog{
public void bark() {
	System.out.println("the baby dog is barking");
}
	public static void main(String[] args) {
		BabyDog obj=new BabyDog();
		System.out.println(obj.name);
		System.out.println(obj.num);
		obj.dog();
		obj.numDogs();
		obj.bark();


	}

}

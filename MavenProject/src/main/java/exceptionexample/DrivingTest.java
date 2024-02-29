package exceptionexample;

public class DrivingTest {
public static void validateage(int age) throws CustomExceptionExample{
	if(age<18) {
		throw new CustomExceptionExample("Licence not approved");//constructor
	}
	else {
		System.out.println("Licence approved");
	}
}
	public static void main(String[] args) {
try {
	DrivingTest.validateage(13);
}
catch(CustomExceptionExample e) {
	System.out.println(e);
}

	}

}

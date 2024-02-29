package exceptionexample;

import java.io.IOException;

public class ThrowsExample {
public static void sum() throws IOException{
	throw new IOException("its a divice error");
}
//	public static void main(String[] args) throws IOException{
public static void main(String[] args) {
try {
		ThrowsExample.sum();
	}
catch(IOException e) {
System.out.println(e);
}
}
}

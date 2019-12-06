package firstPackage;

import org.testng.annotations.Test;

public class ExceptionTest {

	@Test(expectedExceptions=ArithmeticException.class)
	private void arithmeticCalculation() {

		System.out.println(10/0);
	}
	@Test(expectedExceptions=NullPointerException.class)
	private void Null() {
String s=null;
System.out.println(s.length());
	}
}

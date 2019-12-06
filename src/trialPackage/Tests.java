package trialPackage;

import org.openqa.selenium.Alert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tests {

	@Test(groups = "vijay")
	private void test1() {
		System.out.println("vijay");
	}

	@Test(dependsOnMethods = "test99")
	private void test2() {
		System.out.println("TEST2");
	}

	@Test
	private void test3() {
		System.out.println("TEST3");
	}


	@Test
	private void test5() {
		System.out.println("TEST5");
	}
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void test4() {
		System.out.println(10 / 0);
	}

	@Test(enabled = false)
	private void test6() {
		System.out.println("TEST6");
	}

	@Test(groups= {"vikram","ajith"})
	private void test7() {
		System.out.println("vikram");
		
	}
	
	
	@Test
	@Parameters({"username","passowrd"})
	private void testparameter(@Optional("arun")String username , @Optional("16272")String password) {
		System.out.println(username+","+password);
	}
	
	

	@Test
	private void test8() {
		System.out.println("TEST8");
	}

	@Test(priority = 1)
	private void test89() {
		System.out.println("TEST89");
	}

	@Test(groups = "ajith")
	private void test99() {
		System.out.println("ajith");
	}

	@Test(expectedExceptions = ArithmeticException.class)
		private void test41() {
			System.out.println(10 / 0);
		}
}

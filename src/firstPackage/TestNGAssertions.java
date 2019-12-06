package firstPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertions {

	@Test
	private void test1() {
		System.out.println("Validation1 started");
		Assert.assertEquals("a", "A");
		System.out.println("Validation1 done");
	}

	@Test
	private void test2() {
		SoftAssert softAssert=new SoftAssert();
		System.out.println("Validation2 started");
		softAssert.assertEquals("a", "A");
		System.out.println("Validation2 done");
		softAssert.assertAll();
	}
}
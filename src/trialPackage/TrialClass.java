package trialPackage;

import org.testng.annotations.*;

public class TrialClass {

	@BeforeSuite
	private void beforeSuite() {
		System.out.println("before suite");
	}

	@BeforeTest
	private void beforeTest() {
		System.out.println("before test");
	}

	@BeforeClass
	private void beforeClass() {
		System.out.println("before class");

	}

	@BeforeMethod
	private void beforeMethod() {
		System.out.println("BEFOREMethod");
	}

	@Test(groups="test1")
	private void test1() {
		System.out.println("TEST1");
	}

	@Test(dependsOnMethods = "test99")
	private void test2() {
		System.out.println("TEST2");
	}

	@Test (invocationCount = 2)
	private void test3() {
		System.out.println("TEST3");
	}

	@Test(expectedExceptions = ArithmeticException.class)
	private void test4() {
		System.out.println(10 / 0);
	}

	@Test
	private void test5() {
		System.out.println("TEST5");
	}

	@Test(enabled = false)
	private void test6() {
		System.out.println("TEST6");
	}

	@Test(dependsOnGroups="test1")
	private void test7() {
		System.out.println("TEST7");
	}

	@Test(priority = 1)
	private void test8() {
		System.out.println("TEST8");
	}

	@Test
	private void test9() {
		System.out.println("TEST9");
	}
	
	@Test(groups="test99")
	private void test99() {
		System.out.println("TEST99");
	}

	@AfterMethod
	private void afterMethod() {
		System.out.println("AFTER METHOD");
	}

	@AfterClass
	private void afterClass() {
		System.out.println("AFTER CLASS");
	}

	@AfterTest
	private void afterTest() {
		System.out.println("AFTERTEST");
	}

	@AfterSuite
	private void afterSuite() {
		System.out.println("AFTER SUITE");
	}

}

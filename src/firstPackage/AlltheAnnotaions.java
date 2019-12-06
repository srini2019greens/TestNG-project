package firstPackage;

import org.testng.annotations.*;

public class AlltheAnnotaions {
	
	@BeforeSuite
	private void setUp() {
		System.out.println("Set up");
	}
	
	@BeforeTest
	private void browserLaunch() {
		System.out.println("Browser Launch");
	}
	
	@BeforeClass
	private void enterUrl() {
		System.out.println("Enter Url");
	}
	
	@BeforeMethod
	private void login() {
		System.out.println("log in");
	}
	@Test
	private void LaptopSearch() {
		System.out.println("Laptop search");
	}
	
	@Test
	public void mobileSearch() {
		System.out.println("Mobile Search");
	}
	@AfterMethod
	private void Logout() {
		System.out.println("Log out");
	}
	@AfterClass
	private void verifyHomePage() {
		System.out.println("HomePage validated");
	}
	@AfterTest
	private void browserClose() {
		System.out.println("Browser closed");
	}
	@AfterSuite
	private void deleteCookies() {
		System.out.println("cookies deleted");

	}
}

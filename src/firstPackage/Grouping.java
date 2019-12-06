package firstPackage;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Grouping {

	@Test(groups = "selenium test")
	private void sendKeys() {
		System.out.println("Send Keys");
	}

	@Test(groups = "api test")
	private void dbConnect() {
		System.out.println("DBConnect");

	}

	@Test(groups = { "pi test" })
	private void dataCollection() {
		System.out.println("DataCollection");

	}

	@BeforeGroups({ "pi test", "selenium test" })
	private void setup() {
		System.out.println("setup");
	}

	@Test(groups = "api test")
	private void logout() {
		System.out.println("Log out");
	}

}

package firstPackage;

import org.testng.annotations.Test;

public class Dependancy {
	
	@Test
	private void enterUrl() {
		System.out.println("Enter Url");
	}
	
	@Test(groups="login")
	private void login() {
		System.out.println("log in");
	}
	@Test(groups="login")
	 private void mobilesearch() {
		System.out.println("mobile search");
	}
	
	@Test(dependsOnGroups="login")
	private void alogout() {
		System.out.println("Log out");
	}

}

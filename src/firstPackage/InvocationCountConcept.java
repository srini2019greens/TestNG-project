package firstPackage;

import org.testng.annotations.Test;

public class InvocationCountConcept {
	
	@Test
	private void login() {
		System.out.println("log in");
	}
	
	@Test(invocationCount=4)
	public void mobileSearch() {
		System.out.println("Mobile Search");
	}
	

}

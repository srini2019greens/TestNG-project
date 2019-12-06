package firstPackage;

import org.testng.annotations.Test;

public class TimeOutConcept {
	
	@Test(timeOut = 400)
	private void mobileSearch() throws Exception {
		System.out.println("Mobile Search");
		Thread.sleep(1000);
	}
}

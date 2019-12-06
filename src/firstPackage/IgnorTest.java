package firstPackage;

import org.junit.Ignore;
import org.testng.annotations.Test;

public class IgnorTest {

		@Test @Ignore
		private void enterUrl() {
			System.out.println("Enter Url");
		}
		
		@Test
		private void login() {
			System.out.println("log in");
		}
		
		@Test
		private void amobileSearch() {
			System.out.println("Mobile Search");
		}
		
		@Test
		private void logout() {
			System.out.println("Log out");
		}		
	}


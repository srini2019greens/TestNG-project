
	package firstPackage;

	import org.testng.annotations.*;

	public class PriorityTest {

		
		@Test(priority=0)
		private void enterUrl() {
			System.out.println("Enter Url");
		}
		
		@Test(priority=1)
		private void login() {
			System.out.println("log in");
		}
		
		@Test(priority=1)
		public void amobileSearch() {
			System.out.println("Mobile Search");
		}
		
		@Test(priority=3)
		private void logout() {
			System.out.println("Log out");
		}
		
	}



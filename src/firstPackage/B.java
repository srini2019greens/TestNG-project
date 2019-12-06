package firstPackage;
import org.testng.annotations.Test;

public class B {
	

	@Test
	private void testB1() {
		System.out.println("testB1");
	}
	
	@Test(groups="login")
	private void testB2() {
		System.out.println("testB2");
	}

}

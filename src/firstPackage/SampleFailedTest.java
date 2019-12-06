package firstPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleFailedTest {

	@Test
	private void test1() {
		Assert.assertEquals("a", "a");
	}
	
	@Test
	private void test2() {
		Assert.assertEquals("a", "a");
	}
}

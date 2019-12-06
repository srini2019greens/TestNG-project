package secondPackage;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleTest1 {
	
	@Test
	private void sample1() {
		System.out.println("Sample1");
	}
	
	
	@Test
	@Parameters({"user","pass"})
	private void zdatas(@Optional("name")String user, @Optional("word")String pass) {
		System.out.println(user+","+pass);
	}

}

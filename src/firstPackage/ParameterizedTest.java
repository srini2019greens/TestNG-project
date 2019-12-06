package firstPackage;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {

	@Test
	@Parameters({"username", "password","url"})
	private void crdential(@Optional("Arun")String username, @Optional("111111")String password,@Optional ("www.fb.com") String url) {
		System.out.println(username+","+password+","+url);
	}




}
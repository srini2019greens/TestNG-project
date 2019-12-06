package firstPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderConcepts {
	
	@Test(dataProvider="Credential Data.")
	private void crdential(String username, String password ) {
		System.out.println(username+","+password);
	}
	
	@DataProvider(name="Credential Data")
	public Object[][] loginData() {
		return new Object[][] {
								{"aaa","1111"},
								{"bbb","222"},
								{"ccc","333"}
							   };
	}
}

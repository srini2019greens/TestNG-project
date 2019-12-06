package firstPackage;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	int count=0;
	int limit=3;
	
	@Override
	public boolean retry(ITestResult arg0) {
		if (count<=limit) {
			count++;
			return true;
		}
		return false;
	}

}

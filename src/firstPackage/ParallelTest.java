package firstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class ParallelTest {
public static WebDriver driver;
	@Test
	private void browserLaunch1() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cbzsr\\OneDrive\\Desktop\\eclipse\\jdk\\TestNgConcepts\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	private void browserLaunch2() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\cbzsr\\OneDrive\\Desktop\\eclipse\\jdk\\TestNgConcepts\\drivers\\geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.get("https://www.google.com");

	}
	@Test
	private void browserLaunch3() {
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\cbzsr\\OneDrive\\Desktop\\eclipse\\jdk\\TestNgConcepts\\drivers\\IEDriverServer.exe");
		 driver=new InternetExplorerDriver();
		driver.get("https://www.google.com");

	}

}

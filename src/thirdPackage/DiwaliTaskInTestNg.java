package thirdPackage;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.SkipException;
import org.testng.annotations.*;

public class DiwaliTaskInTestNg {
	private static final String timeout = null;
	static WebDriver driver;

	@BeforeSuite
	public static void ChromeLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cbzsr\\OneDrive\\Desktop\\eclipse\\jdk\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@BeforeTest
	private void browserLaunch() {
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		System.out.println("===============before test===================");

	}

	@BeforeClass
	private void beforeClass() {
		System.out.println("==============before class====================");
	}

	@BeforeMethod
	public void Before() throws Throwable {
		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sriniautomation@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("987654321", Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\cbzsr\\OneDrive\\Desktop\\eclipse\\jdk\\Selenium\\screenshots\\junit.png");
		FileUtils.copyFile(source, dest);
		System.out.println("===============before method===================");

	}

	@Test
	public void Test1() {
		System.out.println("========test1 starts=============");
		WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(dresses).perform();
		driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[2]")).click();
		WebElement printedDresses = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		ac.moveToElement(printedDresses).perform();
		driver.findElement(By.xpath("//a[@title='Add to cart']")).click();
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='cgv']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='cheque']")).click();
		System.out.println("Your payment method by Cheque");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		System.out.println("========test1 ends=============");
		
	}

	@Test
	public void test2() {
		System.out.println("=============test2 starts==============");
		driver.findElement(By.xpath("//img[@class='logo img-responsive']")).click();
		driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("dresses", Keys.ENTER);
		Select price = new Select(driver.findElement(By.xpath("//select[@id='selectProductSort']")));
		price.selectByValue("price:desc");

		driver.findElement(By.xpath("//a[@class='product_img_link']")).click();
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();

		WebElement element = driver.findElement(By.xpath("//select[@id='group_1']"));
		Select s = new Select(element);
		s.selectByValue("3");

		driver.findElement(By.xpath("//a[@name='Pink']")).click();
		driver.findElement(By.xpath("//button[@name='Submit']")).click();
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		driver.findElement(By.xpath("//span[text()='In stock']")).getText();
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]")).click();
		driver.findElement(By.xpath("//input[@id='cgv']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='cheque']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("//p[@class='alert alert-success']")).getText();
		driver.findElement(By.xpath("//a[@title='View my customer account']")).click();
		driver.findElement(By.xpath("//a[@title='Orders']")).click();
		System.out.println("=============test2 ends==============");
	}

	@AfterMethod
	public void logout() {
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		System.out.println("===============after method===================");
	}

	@AfterClass
	private void afterclass() {
		System.out.println("==========after class===========");
	}

	@AfterTest
	public static void quit() {
		driver.quit();
		System.out.println("===============after test===================");

	}

	@AfterSuite
	public static void deleteCookies() {
		deleteCookies();
		System.out.println("============after suite===================");

	}
}

package thirdPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	WebDriver driver;
	@Test
	private void sample3() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\cbzsr\\OneDrive\\Desktop\\eclipse\\jdk\\TestNgConcepts\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	Actions ac=new Actions(driver);
	//ac.moveToElement(driver.findElement(By.id("closeBtn"))).click();
	WebElement a = driver.findElement(By.id("fourth"));
	WebElement b = driver.findElement(By.id("amt8"));
	Thread.sleep(2000);
	ac.dragAndDrop(a,b).build().perform();

	WebElement c = driver.findElement(By.id("credit2"));
	WebElement d = driver.findElement(By.id("bank"));
	ac.dragAndDrop(c,d).build().perform();
	
	driver.navigate().to("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
	driver.findElement(By.xpath("//div[contains(text(),'Mobiles, Computers')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'Power Banks')]")).click();	
	}

} 
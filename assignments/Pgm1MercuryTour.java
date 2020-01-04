package assignments;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pgm1MercuryTour {

	static WebDriver driver;

	public static void main(String[] args) {
		mercuryTourDemo();
	}

	public static void mercuryTourDemo() {

		// Launching Chrome Browser
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Launching Url
		driver.get("http://newtours.demoaut.com/");

		// pageLoad Timeout and Implictwait time
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Click Register Link
		driver.findElement(By.linkText("REGISTER")).click();
		try {
			Thread.sleep(30);

			driver.findElement(By.name("firstName")).sendKeys("MAHESH");
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("KUMAR");
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("987654321");
			driver.findElement(By.id("userName")).sendKeys("xyz@gmail.com");
			driver.findElement(By.name("address1")).sendKeys("adress1");
			driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("adress2");
			driver.findElement(By.name("city")).sendKeys("city1");
			driver.findElement(By.name("state")).sendKeys("city1");
			driver.findElement(By.name("postalCode")).sendKeys("542316");

			WebElement ele = driver.findElement(By.xpath("//select[@name='country']"));
			Select s = new Select(ele);
			s.selectByVisibleText("INDIA");
			
			driver.findElement(By.name("email")).sendKeys("amhesh417");
			driver.findElement(By.name("password")).sendKeys("987654321");
			driver.findElement(By.name("confirmPassword")).sendKeys("987654321");
			driver.findElement(By.name("register")).click();
			

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
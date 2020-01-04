package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoOrdinatesXandY {
	
		static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.id("txtUsername"));
		// *********************************************************************************************//
		Point p = e.getLocation();
		System.out.println("X co-ordinate"+"="+p.getX());
		System.out.println("Y co-ordinate"+"="+p.getY());
		// *******************************************************************************************//
		e.sendKeys(Keys.CONTROL + "a");
		e.sendKeys(Keys.DELETE);
		e.sendKeys("admin");
		WebElement e2 = driver.findElement(By.id("txtPassword"));
		e2.sendKeys(Keys.CONTROL + "a");
		e2.sendKeys(Keys.DELETE);
		e2.sendKeys("admin123");
		WebElement e3 = driver.findElement(By.id("btnLogin"));

		// Checking LogIn button is enabled or not
		if (e3.isEnabled()) {
			System.out.println("Login Button is Enabled:");
		} else {
			System.out.println("Login Button is Disabled");
		}

		e3.click();

		WebElement e4 = driver.findElement(By.id("ohrm-small-logo"));
		if (e4.isDisplayed()) {
			System.out.println("Logo is Displayed");
		} else {
			System.out.println("Logo is Not Dispalyed");
		}

	}
}

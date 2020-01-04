package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyingTextOneFieldToAnotherTextFeild {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.id("txtUsername"));
		e.clear();
		e.sendKeys("admin");
		e.sendKeys(Keys.CONTROL + "a");
		e.sendKeys(Keys.CONTROL + "c");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e1) {

			e1.printStackTrace();
		}
		WebElement e2 = driver.findElement(By.id("txtPassword"));
		e2.clear();
		e2.sendKeys(Keys.CONTROL + "v");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
//		driver.close();

	}
}

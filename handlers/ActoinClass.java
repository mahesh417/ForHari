package handlers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActoinClass {
	static  WebDriver driver;

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Add-Ons')]"))).build().perform();

		// WebElement el =
		// driver.findElement(By.xpath("//a[contains(text(),'Add-Ons')]"));
		// act.moveToElement(el).build().perform();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.linkText("SpiceLounge")).click();
	}
}

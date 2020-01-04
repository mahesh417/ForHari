package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	static WebDriver driver;

	public static void main(String[] args) {
		//googleSearch();
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail/");
		driver.findElement(By.xpath("(//div[@class='h-c-header__cta']//a[@class='h-c-header__nav-li-link '])[2]")).click();
		
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("amahesh417@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7842439401AMK");


	}

	// ==================================================================================================================================================================================
	public static void googleSearch() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	

		String title = driver.getTitle(); // getting Title
		System.out.println(title);

		WebElement el = driver.findElement(By.id("lst-ib"));
		el.sendKeys("TESTING");
		try {
			Thread.sleep(3000);
			el.sendKeys(Keys.ARROW_DOWN);
			el.sendKeys(Keys.ARROW_DOWN);

		} catch (InterruptedException e) {
		}
		el.sendKeys(Keys.ENTER);
	}
}
	// ======================================================================================================================================================================================








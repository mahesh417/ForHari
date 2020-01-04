package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	static WebDriver driver;

	public static void main(String[] args) {
		// Scrolling_Down();
		// getTitle();
		// sending_Value();
		// Highlight_Elem();
	}

	public static void Scrolling_Down() {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://scrollmagic.io/");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//a[contains(@title,'alfred')]"));
		// WebElement
		// ele=driver.findElement(By.xpath("//img[@src='img/madewith_alfred.jpg']"));

		jse.executeScript("arguments[0].scrollIntoView(true);", ele);
	}

	// =================================================================================================================================
	public static void getTitle() {


		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://scrollmagic.io/");

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		String title = (String) jse.executeScript("return document.title");
		System.out.println(title);

	}

	// ==================================================================================================================================

	public static void sending_Value() {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.freecrm.com/index.html");

		WebElement username = driver.findElement(By.name("username"));
		// JavascriptExecutor js = (JavascriptExecutor) driver;

		((JavascriptExecutor) driver).executeAsyncScript("arguments[0].value='MAHI417'", username);

		// ((JavascriptExecutor)driver).executeScript("document.getElementByname('username').value='Quality';");

	}

	// ========================================================================================================================================
	public static void m2() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		WebElement ele = driver.findElement(By.name("email"));
		JavascriptExecutor js = (JavascriptExecutor) (driver);
		// js.executeScript("document.getElementByid('email').value='MAHESH';");
		js.executeScript("arguments[0].value='MAHI417'", ele);

	}

	// =========================================================================================================================================
	public static void Highlight_Elem() {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.freecrm.com/index.html");

		WebElement username = driver.findElement(By.name("username"));

		JavascriptExecutor js = (JavascriptExecutor) (driver);
		js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');", username);
		username.sendKeys("MAHESH417");
	}
	// ========================================================================================================================================

}

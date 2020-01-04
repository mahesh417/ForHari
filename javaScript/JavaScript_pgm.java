package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_pgm {

	public static void main(String[] args) {
		// m1();
		// m2();
		Highlight_Elem();
	}

	public static void m1() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.freecrm.com/index.html");

		WebElement username = driver.findElement(By.name("username"));
		// JavascriptExecutor js = (JavascriptExecutor) driver;

		((JavascriptExecutor) driver).executeAsyncScript("arguments[0].value='MAHI417'", username);

		// ((JavascriptExecutor)driver).executeScript("document.getElementByname('username').value='Quality';");
		
	}

	public static void m2() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		WebElement ele = driver.findElement(By.name("email"));
		JavascriptExecutor js = (JavascriptExecutor) (driver);
		// js.executeScript("document.getElementByid('email').value='MAHESH';");
		js.executeScript("arguments[0].value='MAHI417'", ele);

	}

	public static void Highlight_Elem() {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.freecrm.com/index.html");

		WebElement username = driver.findElement(By.name("username"));

		JavascriptExecutor js = (JavascriptExecutor) (driver);
		js.executeScript(
				"arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');", username);
		username.sendKeys("MAHESH417");
	}

}

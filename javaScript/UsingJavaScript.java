package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class UsingJavaScript {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		RemoteWebDriver r= (RemoteWebDriver) driver;
		
		driver.findElement(By.id("u_0_2")).sendKeys(Keys.ENTER);
		r.executeScript("alert('Invalid Username and Password')");
		
	}

}

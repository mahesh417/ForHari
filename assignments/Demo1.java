package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	
	
	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "F:\\Ecllipse_Projects_BKP\\Selenium_Java\\Selenium\\Pdf_Practice\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement username=driver.findElement(By.xpath("//input[@type='email']"));
		username.sendKeys("9493119401");
		
		
	}

}

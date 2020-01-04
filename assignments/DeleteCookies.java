package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookies {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().getCookies();
		driver.get("https://www.facebook.com/");
		WebElement w=driver.findElement(By.id("email"));
		String s=w.getCssValue("font-size");
		System.out.println(s);
		
		
	
	
	
	}

}

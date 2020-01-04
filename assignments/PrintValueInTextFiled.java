package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintValueInTextFiled {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.id("txtUsername"));
		String s=e.getAttribute("placeholder");
		System.out.println(s);
		e.clear();
		e.sendKeys("mahesh");
//		driver.close();
		
		
		
		
		

	}

}

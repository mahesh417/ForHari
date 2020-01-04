package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ToolTip {

	
	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");

		WebElement username=driver.findElement(By.xpath("//*[@type='text']"));
		username.clear();
		username.sendKeys("mahesh1432");
		WebElement pwd= driver.findElement(By.xpath("//*[@type='password']"));
		pwd.clear();
		pwd.sendKeys("9493119401");
		
		
		
		JavascriptExecutor jse=(JavascriptExecutor)(driver);
		WebElement login=driver.findElement(By.xpath("//*[@type='submit']"));
		jse.executeScript("arguments[0].click();",login);
		
		
		driver.switchTo().frame("mainpanel");
		WebElement contacts=driver.findElement(By.linkText("CONTACTS"));
		Actions act=new Actions(driver);
		act.moveToElement(contacts).build().perform();
		
		String tooltip=contacts.getText();
		System.out.println(tooltip);
		
		
		
		
	}

}

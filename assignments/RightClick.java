package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClick {
	
	static WebDriver driver;
	static WebElement element;
	@Test
	public static void right_click() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		element=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
	}
	

}

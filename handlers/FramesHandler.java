package handlers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesHandler {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("mahesh1432");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("9493119401");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//input[@type='submit']
		Thread.sleep(5000);
		driver.switchTo().frame("mainpanel");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[4]/a"))).build().perform();
		driver.findElement(By.linkText("Full Search Form")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[text()='Timeline']")).click();

	}
}
		
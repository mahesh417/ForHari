package handlers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropAndDrag2 {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com/");
		driver.findElement(By.xpath("//span[@class='red-arrow-btn']")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		driver.findElement(By.xpath("//div[@class='right1']//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[text()=' Delhi (DEL)']")).click();
		
		

	}

}

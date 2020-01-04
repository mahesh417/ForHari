package handlers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropAndDrag {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");

		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		act.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")))
				.moveToElement(driver.findElement(By.xpath("//div[@id='droppable']")))
				.release().build().perform();

	}

}

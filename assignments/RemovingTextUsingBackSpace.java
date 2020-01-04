package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemovingTextUsingBackSpace {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.id("txtUsername"));
		String s = e.getAttribute("value");
//		System.out.println(s);
		int total=s.length();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for(int i=1;i<=total;i++) {
		e.sendKeys(Keys.BACK_SPACE);
		}
		e.sendKeys("mahesh");
		driver.close();
	}
}

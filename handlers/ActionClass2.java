package handlers;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass2 {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		List<WebElement> logo = driver.findElements(By.xpath("//*[@alt='HDFC Bank logo']"));

		if (logo.size() > 0) {
			System.out.println("Application was Launhed Successfully");
		} else {
			System.out.println("Application was not lauched");
		}

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement HdfcProducts = driver.findElement(By.linkText("Products"));
		Actions act = new Actions(driver);
		act.moveToElement(HdfcProducts).build().perform();
		WebElement Cards = driver.findElement(By.linkText("Cards"));
		act.moveToElement(Cards).build().perform();
		driver.findElement(By.linkText("Credit Cards")).click();

		List<WebElement> allradios = driver.findElements(By.xpath("//input[@type='radio']"));

		System.out.println(allradios.size());

		String s="Premium";
		for (WebElement e1 : allradios) {
			String s1=e1.getTagName();
			String s2=e1.getText();
			System.out.println(s1);
			if(s2.equalsIgnoreCase(s)) {
				e1.click();
				System.out.println("Scucess");
			}
			else {
				System.out.println("invalid");
			}

		}

	}
}

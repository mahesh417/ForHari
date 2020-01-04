package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {
	static WebDriver driver;

	public static void main(String[] args) {
		locators_using();
	}

	public static void locators_using() {
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/accounts/create?form");
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("JPetStore Demo")) {
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("mahesh123");
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.name("repeatedPassword")).sendKeys("123456");
			driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("mahesh");
			driver.findElement(By.id("lastName")).sendKeys("kumar");
			driver.findElement(By.id("email")).sendKeys("abc123@gmail.com");
			driver.findElement(By.id("phone")).sendKeys("123456789");
			driver.findElement(By.name("address1")).sendKeys("adreess");
			driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("adress234");
			driver.findElement(By.id("city")).sendKeys("city");
			driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("state");
			driver.findElement(By.xpath("//*[@id=\"zip\"]")).sendKeys("1234566");
			driver.findElement(By.id("country")).sendKeys("India");
			Select s=new Select(driver.findElement(By.id("languagePreference")));
			s.selectByVisibleText("Japanese");
			
			Select s1=new Select(driver.findElement(By.id("favouriteCategoryId")));
			s1.selectByVisibleText("BIRDS");
			driver.findElement(By.xpath("//*[@id=\"listOption1\"]")).click();
			driver.findElement(By.id("bannerOption1")).click();
			driver.findElement(By.xpath("//*[@id=\"save\"]")).click();
			

		}
	}

}

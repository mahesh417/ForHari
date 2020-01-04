package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayChallenge {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");

		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println("alllinks:"+alllinks.size());

		WebElement footerlinks = driver.findElement(By.xpath("//div[@id='hlGlobalFooter']"));
		System.out.println(footerlinks.findElements(By.tagName("a")).size());
	}

}

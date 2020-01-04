package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fire_Launch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.spicejet.com/");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		links.add(driver.findElement(By.tagName("img")));
		System.out.println(links.size());
		
		List<WebElement>active=new ArrayList<>();
		for(int i=0;i<links.size();i++) {
			if(links.get(i).getAttribute("href")!=null);
			active.add(links.get(i));
			
		}
		
		

	}

}

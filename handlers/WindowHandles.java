package handlers;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		
	/*
		driver.findElement(By.linkText("click")).click();
		String mainwindow = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		for (String all : allwindow) {
			driver.switchTo().window(all);
			String title = driver.getTitle();
			System.out.println(title);
			if (title.contains("Sakinalium")) {
				driver.switchTo().window(all);
				driver.findElement(By.linkText("Java")).click();
				driver.close();
				driver.switchTo().window(mainwindow);
			}
		}
*/
	}

}

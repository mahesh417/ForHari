package assignments;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class CopyScreenshot {
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException  {
		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.youtube.com");
		driver.navigate().to("https://www.facebook.com/");
		
		EventFiringWebDriver e = new EventFiringWebDriver(driver);
		File srcfile = e.getScreenshotAs(OutputType.FILE);
		File destfile = new File("D:/photo1.jpg");
		FileUtils.copyFile(srcfile, destfile);
		Thread.sleep(60);
		driver.close();
	}
}
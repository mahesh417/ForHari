package assignments;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		EventFiringWebDriver EFW=new EventFiringWebDriver(driver);
		File Src=EFW.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\img.png");
		FileUtils.copyFile(Src, dest);	
		driver.close();
	}
	
	
}

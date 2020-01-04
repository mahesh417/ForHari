package assignments;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakingScreenShot {
	
	

	static WebDriver driver;

	@Test
	public void ScreenShot() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		DateFormat df = new SimpleDateFormat("yyyy-MMM-dd hh/mm-ss");
		Date d = new Date();
		String time = df.format(d);

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("Test_Data//Pictures//" + time + "img.png"));
		} catch (IOException e) {
		}

	}
}

	// ============================================================================================================================
	
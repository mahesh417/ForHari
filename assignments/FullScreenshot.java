package assignments;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullScreenshot {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		try {
			Thread.sleep(2000);
			Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
					.takeScreenshot(driver);
			ImageIO.write(fpScreenshot.getImage(), "PNG",
					new File("G:\\Bgl Institute\\Ecllipse ,JAVA SELENIUM\\JARS\\screenshots\\FullPageScreenshot.png"));

		} catch (InterruptedException | IOException e1) {
			e1.printStackTrace();
		}

		driver.quit();
	}

}

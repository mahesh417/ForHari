package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDiasbleExtensions {
	static WebDriver driver;
	public static void main(String[] args) {

		// diasbaleExtension();
		noticatioins_Chrome();
	}

	public static void diasbaleExtension() {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		
		ChromeOptions op = new ChromeOptions();
		driver = new ChromeDriver(op);
		op.addArguments("--disable-extensions");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

	public static void noticatioins_Chrome() {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--start-maximized","--disable-extensions","--diasable-infobar","--dns-prefetch-disable");
		
		driver = new ChromeDriver(op);
//		HashMap<String, Object> pref = new HashMap<String, Object>();
//		op.setExperimentalOption("pref", pref);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9493119401");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("9493119401amk");
		driver.findElement(By.xpath("//input[@type='submit']")).click();


	}

}

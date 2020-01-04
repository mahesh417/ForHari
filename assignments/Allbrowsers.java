package assignments;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Allbrowsers {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException  {
		ifusing();
		// switch1();
	}

	public static void ifusing() throws InterruptedException  {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Browser Name:CH/FF/EG");
		String br = sc.next();
		if (br.equalsIgnoreCase("CH")) {
			
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
			ChromeOptions op = new ChromeOptions();
			op.addArguments("--start-maximized");
			op.addArguments("--disable-infobars");
			
			driver = new ChromeDriver(op);
		
		} else if (br.equalsIgnoreCase("FF")) {
			System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.edge.driver", "Drivers/MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		sc.close();
		Thread.sleep(60);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.close();
	}

	public static void switch1() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser name: CH/FF/EG");
		String br = sc.next();

		switch (br.toUpperCase()) {
		case "CH":
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "FF":
			System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		default:

			System.out.println("Try Again");
			break;

		}

		sc.close();

	}
}
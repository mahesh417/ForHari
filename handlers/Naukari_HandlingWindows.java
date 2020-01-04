package handlers;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari_HandlingWindows {

	static WebDriver driver;

	public static void main(String[] args) {

		 //method();
		method3();

	}

	public static void method() {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String ParentWindow = driver.getTitle();
		System.out.println("title:" + ParentWindow);
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows.size());

		for (String all : allwindows) {
			System.out.println(all);

			driver.switchTo().window(all);
			if (all.contains("Genpact")) {
				driver.close();
			}

		}

		
		/*
		 * Iterator<String>it=allwindows.iterator(); 
		 * String ParentIt=it.next();
		 * System.out.println(ParentIt); 
		 * String child2=it.next();
		 * driver.switchTo().window(child2);
		 * System.out.println("Child2::"+driver.getTitle());
		 * System.out.println("Child2:"+child2); driver.close();
		 * driver.switchTo().window(ParentIt);
		 * System.out.println("amk:"+driver.getTitle());
		 */
	}

	public static void method3() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String parentWindow = driver.getWindowHandle();
		System.out.println("ParentWindow:" + parentWindow);
		Set<String> allwindows = driver.getWindowHandles();

		System.out.println("TotalWindows:" + allwindows.size());
		for (String all : allwindows) {

			driver.switchTo().window(all);
			String alltitles = driver.getTitle();
			System.out.println(alltitles);

			if (alltitles.contains("LnT")) {
				driver.switchTo().window(all);
				driver.manage().window().maximize();
				driver.close();
			}

		}
		driver.switchTo().window(parentWindow);
		driver.findElement(By.linkText("MORE")).click();
	}

}

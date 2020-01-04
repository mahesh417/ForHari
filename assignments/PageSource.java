package assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://learn-automation.com/selenium-webdriver-tutorial-for-beginners/");
		String ps=driver.getPageSource();
		System.out.println(ps);
		
		
		
		
		
	}

}

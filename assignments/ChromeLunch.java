package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		String str=driver.findElement(By.xpath("//a[text()='Gmail']")).getText();
		if(str.equals("Gmail")) {
			System.out.println("matched");
			System.out.println(str);
		}else {
			System.out.println("not matching");
			System.out.println(str);
		}
		System.out.println(driver.manage().window().getSize());
		
		System.out.println(driver.manage().window().getSize().getHeight());
		System.out.println(driver.manage().window().getSize().getWidth());
		System.out.println(driver.manage().window().getPosition());
	}

}

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingTitlePage {
	static WebDriver d;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		
		d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		String title=d.getTitle();
		System.out.println(title);
		
		if(title.equals("Facebook – log in or sign up")) {
			System.out.println("title matched with:"+title);
		}
		else {
			System.out.println("title doesn't matched with:"+title);
		}
		
		d.findElement(By.cssSelector("#email")).sendKeys("mahesh");
		
		
		
		
	}

}

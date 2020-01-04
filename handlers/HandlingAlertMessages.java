package handlers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertMessages {

	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		try {

			Alert al = driver.switchTo().alert();
			String st = al.getText();
			System.out.println(st);
			Thread.sleep(5000);
			if (st.equals("Please enter a valid user name")) {
				al.accept();
			} else {
				System.out.println("title doesn't matched with:" + st);
			}
		} catch (InterruptedException e) {

		}

	}

}

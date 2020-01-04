package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Executor {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		// Enable javascript on automation browser
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		// Enter text into editbox
		js.executeScript("document.getElementById('u_0_j').value='Arjun'");
		js.executeScript("document.getElementById('u_0_l').value='vijay'");
		js.executeScript("document.getElementById('u_0_o').value='krishan@gmail.com'");

		// Dropdown option to select[Under dropdown use option tag value property]
		js.executeScript("document.getElementById('day').value='7'");
		js.executeScript("document.getElementById('month').value='8'");
		js.executeScript("document.getElementById('year').value='1990'");

		// Click button
		WebElement Btn = driver.findElement(By.xpath("//button[@name='websubmit']"));
		js.executeScript("arguments[0].click()", Btn);

	}

}

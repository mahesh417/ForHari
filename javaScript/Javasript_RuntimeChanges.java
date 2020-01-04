package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Javasript_RuntimeChanges {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://content.icicidirect.com/idirectcontent/Home/Home.aspx");
		driver.manage().window().maximize();

		// Select Dropdown
		WebElement Open_account = driver.findElement(By.id("open_account"));
		// Use New Selector to get single option
		new Select(Open_account).selectByVisibleText("Corporate Account");

		// Target Webelement
		WebElement Open_my_account_btn = driver.findElement(By.xpath("//input[@value='Open my Account']"));
		Open_my_account_btn.click();
		Thread.sleep(5000);

		// Expected [State] and [Others-editbox] should be disabled
		WebElement Others_editbox = driver.findElement(By.id("FML_USR_ADDRSS_CTY_OTHERS"));

		// Write javascript on automation browser
		((JavascriptExecutor) driver).executeScript("arguments[0].disabled=false", Others_editbox);

		Thread.sleep(3000);
		// Type text into editbox using javascript
		((JavascriptExecutor) driver).executeScript("arguments[0].value='HYD'", Others_editbox);

		Thread.sleep(3000);
		// HIde Element using javascript
		((JavascriptExecutor) driver).executeScript("arguments[0].style.visibility='hidden'", Others_editbox);

		Thread.sleep(3000);
		// get Element visible using javascript
		((JavascriptExecutor) driver).executeScript("arguments[0].style.visibility='visible'", Others_editbox);

		WebElement Email_editbox = driver.findElement(By.id("txtEmail"));
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('readonly','readonly')", Email_editbox);

	}

}

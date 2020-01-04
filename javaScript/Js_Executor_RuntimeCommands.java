package javaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_Executor_RuntimeCommands {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		// Create Interface for JsExecutor
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		String pagetitle = js.executeScript("return document.title").toString();
		System.out.println(pagetitle);

		String pageurl = js.executeScript("return window.location.href").toString();
		System.out.println(pageurl);
/*
		js.executeScript("return alert('Execution Completed')");
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
*/
	}

}

package assignments;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	static WebDriver driver;

	public static void main(String[] args) {
		// table1();
		// table2();

		try {
			Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
			Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");
			Runtime.getRuntime().exec("taskkill /F /IM iexplore.exe");
			Runtime.getRuntime().exec("taskkill /F /IM microsoftedge.exe");
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
			Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe");
			Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
			Runtime.getRuntime().exec("taskkill /F /IM edgedriver.exe");
		} catch (IOException e) {

			System.out.println("Exception while closing the browsers.");
		}

		// table3();
	}

	public static void table1() {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		List<WebElement> allrows = driver.findElements(By.xpath("//table/thead/tr/th"));
		System.out.println("rows:" + allrows.size());

		List<WebElement> allRows = driver.findElements(By.xpath("//tbody/tr"));
		System.out.println("rows:" + allRows.size());

		List<WebElement> allcolumns = driver.findElements(By.xpath(""));
		System.out.println("columns:" + allcolumns.size());

	}

	public static void table2() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/travels/srs-travels-srs.aspx");
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.id("txtOnwardCalendar"));
		jse.executeScript("arguments[0].click();", ele);

		WebElement table = driver.findElement(By.xpath("//table[@class='timetable']"));

		List<WebElement> allrows = table.findElements(By.tagName("tr"));
		System.out.println("allrows:" + allrows.size());
		List<WebElement> allcolums = driver.findElements(By.xpath("//table[@class='timetable']//th"));
		System.out.println("Allcoulmns:" + allcolums.size());

		for (int i = 0; i < allrows.size(); i++) {

			List<WebElement> columns = allrows.get(i).findElements(By.tagName("td"));
			int count = columns.size();
			for (int j = 0; j < count; j++) {
				String str = columns.get(j).getText();
				System.out.print(str + " ");
				// System.out.println("");
			}
		}

	}

	public static void table3() {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		/*
		 * JavascriptExecutor jse = (JavascriptExecutor) driver; WebElement ele =
		 * driver.findElement(By.id("txtOnwardCalendar"));
		 * jse.executeScript("arguments[0].click();", ele);
		 */

		WebElement table = driver.findElement(By.xpath("//table[@id='customers']/tbody"));

		List<WebElement> allrows = table.findElements(By.tagName("tr"));
		System.out.println("allrows:" + allrows.size());

		List<WebElement> allcolums = table.findElements(By.xpath("//tr/th"));
		System.out.println("Allcoulmns:" + allcolums.size());

		for (int i = 0; i < allrows.size(); i++) {

			List<WebElement> columns = allrows.get(i).findElements(By.tagName("td"));
			int count = columns.size();
			for (int j = 0; j < count; j++) {
				String str = columns.get(j).getText();
				System.out.print(str + " ");
			}
		}

	}

}

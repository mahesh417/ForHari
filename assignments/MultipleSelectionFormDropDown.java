package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleSelectionFormDropDown {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// demo1();
		// demo2();
		//demo3();
		demo4();
	}

	public static void demo1() {

		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");

		driver.findElement(By.xpath("//img[@id='ControlOptionsTopHolder_lbSelectionMode_B-1Img']")).click();
		driver.findElement(By.xpath("//*[@id='ControlOptionsTopHolder_lbSelectionMode_DDD_L_LBI1T0']")).click();

		Actions act = new Actions(driver);

		WebElement ele = driver.findElement(By.xpath("//*[@id='ContentHolder_lbFeatures_D']"));

		List<WebElement> options = ele.findElements(By.tagName("td"));

		System.out.println("TotalOptions=:" + options.size());

		act.keyDown(Keys.CONTROL).click(options.get(6)).click(options.get(1)).click(options.get(5)).build().perform();

		/*
		 * Action multi= act.keyDown(Keys.CONTROL) .click(options.get(6))
		 * .click(options.get(1)) .click(options.get(5)) .build(); multi.perform();
		 */
	}
	// ==========================================================================================================================

	public static void demo2() {

		driver.get("https://jqueryui.com/selectable/");
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		WebElement ele = driver.findElement(By.xpath("//*[@id='selectable']"));
		List<WebElement> options = ele.findElements(By.tagName("li"));
		System.out.println("Total Options:" + options.size());
		Actions items = new Actions(driver);
		items.keyDown(Keys.CONTROL).click(options.get(1)).click(options.get(3)).click(options.get(5)).build().perform();

	}

	// =========================================================================================================================
	public static void demo3() {
		driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

		WebElement ele = driver.findElement(By.xpath("//select[@id='multi-select']"));
		List<WebElement> options = ele.findElements(By.tagName("option"));
		System.out.println("Total options:" + options.size());
		Actions opt = new Actions(driver);
		opt.keyDown(Keys.CONTROL).click(options.get(1)).click(options.get(3)).build().perform();

	}

	public static void demo4() {

		driver.get("http://dotansimha.github.io/angularjs-dropdown-multiselect/docs/#/main");

		driver.findElement(By.xpath("//span[text()='Basic Settings Example']")).click();
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("javascript:window.scrollBy(250,350)");
			
		WebElement ele=driver.findElement(By.xpath("//*[@id='accordiongroup-8-9701-panel']/div/div[2]/div[1]/div/div/div/div/div/button"));
		ele.click();

		List<WebElement> options = ele.findElements(By.tagName("a"));
		System.out.println("Total options:" + options.size());
	}

}

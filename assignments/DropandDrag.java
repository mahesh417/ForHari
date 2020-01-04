package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropandDrag {

	static WebDriver driver;

	public static void main(String[] args) {

		DragAndDrop();
		// resizable();
		// right_click();
		//using_slider();
	}

	public static void DragAndDrop() {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		WebElement iframe = driver
				.findElement(By.xpath("//iframe[@src='../../demoSite/practice/droppable/photo-manager.html']"));
		driver.switchTo().frame(iframe);

		WebElement drag = driver.findElement(				
				By.xpath("//h5[contains(text(),'High Tatras 2')]/../img"));
				//By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'][1]"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='trash']"));
		System.out.println("csc");
		Actions act = new Actions(driver);
		// Thread.sleep(3000);
		
		
		// act.clickAndHold(drag).moveToElement(drop).release().build().perform();
		act.dragAndDrop(drag, drop).perform();

	}

	// ==============================================================================================================================================================
	public static void resizable() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");

		// driver.switchTo().frame();

		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);

		WebElement drag = driver.findElement(
				By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		Actions a = new Actions(driver);
		a.clickAndHold(drag).moveByOffset(70, 80).release(drag).build().perform();

	}

	// =============================================================================================================================================================

	public static void right_click() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		WebElement ele = driver.findElement(By.linkText("Sortable"));
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();

	}

	// ==============================================================================================================================================================
	public static void using_slider() {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.switchTo().frame(0);
		WebElement el = driver.findElement(By.xpath("//div[@id='red']/span"));
		Actions a = new Actions(driver);
		a.clickAndHold(el).moveByOffset(-80, 0).release(el).build().perform();

	}

}

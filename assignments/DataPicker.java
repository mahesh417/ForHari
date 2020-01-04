package assignments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataPicker {

	static WebDriver driver;

	public static void main(String[] args) {
		pgm1();
	}
	
	public static void pgm1() {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://www.globalsqa.com/demo-site/datepicker/#Icon%20Trigger");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		WebElement link = driver.findElement(By.xpath("//li[contains(text(),'Icon Trigger')]"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", link);

		WebElement iframe2 = driver.findElement(By.xpath("//div[@rel-title='Icon Trigger']//descendant::iframe"));
		driver.switchTo().frame(iframe2);

		driver.findElement(By.xpath("//*[@class='ui-datepicker-trigger' and @title='Select date']")).click();

		
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']//preceding-sibling::input")).sendKeys();

		//String from="15/12/2018";
		
	}
	public static  String gettimestamp() {
		Date dt = new Date();		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss:SSS");		
		String date = sdf.format(dt);
		date = date.replaceAll("[/: ]", "");
		
		return date;
		
	}
	
	public void selectDate(String date){
		 try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date fromDate = sdf.parse(date);
			Calendar calender = Calendar.getInstance();
			calender.setTime(fromDate);
			
			//int day = 	calender.get(Calendar.DAY_OF_MONTH);
			//int month = calender.get(calender.MONTH);
			//int expYear = calender.get(calender.YEAR);
			//String monthName = calender.getDisplayName(calender.MONTH, Calendar.LONG, Locale.ENGLISH);

		} catch (ParseException e) {
		
			e.printStackTrace();
		}
		
		

}
}

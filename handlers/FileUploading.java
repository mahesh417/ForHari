package handlers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploading {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://tus.io/demo.html");
		WebElement ele =driver.findElement(By.xpath("//input[@type='file']"));
		ele.sendKeys("C://Users//MAHI//Desktop//39814293_2192066307692279_4045777803201740800_n.jpg");
		Thread.sleep(3000);
		System.out.println("File SuccessFully Uploaded");
		
	
}
}
       

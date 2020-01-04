package assignments;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksandImages {

	public static void main(String[] args){

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwaretestingmaterial.com/requirements-traceability-matrix/");

		List<WebElement>links=driver.findElements(By.tagName("a"));
		links.addAll(driver.findElements(By.tagName("img")));
		List<WebElement>alllinks=new ArrayList<>();
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++) {
			if(links.get(i).getAttribute("href")!=null) {
				alllinks.add(links.get(i));
				
			}
		}
		int count=0;
		for(int j=0;j<alllinks.size();j++) {
			try {
				
				HttpURLConnection con= (HttpURLConnection)new URL(alllinks.get(j).getAttribute("href")).openConnection();
				con.connect();
				//String response=con.getResponseMessage();
				int code=con.getResponseCode();
				if(code>=400) {
					System.out.println("broken links:"+alllinks.get(j).getAttribute("href")+code);
				}
				else {
					System.out.println("Active links:"+alllinks.get(j).getAttribute("href")+code);
					count++;
					
				}
				
				con.disconnect();
				//System.out.println("Active links after:"+alllinks.get(j).getAttribute("href")+"--------------------->"+response+"---->"+code);
			} catch (IOException e) {
				
			}
		}
		System.out.println("Total Active Count:"+count);
		
		
		System.out.println("Final links:"+alllinks.size());
	}

}

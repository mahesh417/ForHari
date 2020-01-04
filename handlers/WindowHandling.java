package handlers;


import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	static WebDriver driver;

	public static void main(String[] args) {
		// Dynamic_Handling();
		// m2();
		
	}

	public static void m1() {
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com/");
		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow + "main window");
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows + "set list");

		Iterator<String> itr = allwindows.iterator();
		while (itr.hasNext()) {
			String childWindow = itr.next();
			if (!mainWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println(driver.switchTo().window(childWindow).getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);
		// driver.findElement(By.linkText("Click Here")).click();

	}

	public static void Dynamic_Handling() {

		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com/");

		Set<String> ele = driver.getWindowHandles();
		System.out.println(ele);

		Object handle[] = ele.toArray();

		driver.switchTo().window(handle[0].toString());
		System.out.println("1st:" + driver.getTitle());

		driver.switchTo().window(handle[1].toString());
		System.out.println("2nd:" + driver.getTitle());

		driver.switchTo().window(handle[2].toString());
		System.out.println("3rd:" + driver.getTitle());

		driver.switchTo().window(handle[3].toString());
		System.out.println("4th:" + driver.getTitle());

	}

	
}

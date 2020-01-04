package assignments;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerLaunch {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.ie.driver", "Drivers/IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		driver.navigate().to("https://www.facebook.com/");
	}

}

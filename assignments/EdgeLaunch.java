package assignments;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "Drivers/MicrosoftWebDriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
	}

}

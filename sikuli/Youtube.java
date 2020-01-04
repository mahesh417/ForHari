package sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Youtube {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=MGpB7Np7lJM");
		
		Screen s=new Screen();
		//Pattern pauseImg=new Pattern("D:\\Sikuli Images\\pause.png");
		try {
			/*s.wait(pauseImg,2000);
			s.click();
			s.click();
			Pattern playIcon=new Pattern("D:\\Sikuli Images\\play.png");
			s.wait(playIcon,2000);
			s.click();
			//s.click(); 
*/			Pattern Settings=new Pattern("D:\\Sikuli Images\\HDsettings.png");
			s.wait(Settings,1000);
			s.click();
			Pattern autoImg=new Pattern("D:\\Sikuli Images\\Quality Auto.png");
			s.wait(autoImg,2000);
			s.click();
			Pattern changePixel=new Pattern("D:\\Sikuli Images\\480pix.png");
			s.wait(changePixel,2000);
			s.click();
			
			
			
		} catch (FindFailed e) {
			e.printStackTrace();
		}
		
		}

}

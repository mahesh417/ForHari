package sikuli;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class WindowOperation {

	public static void main(String[] args) {
		
		Screen sc=new Screen();		
		Pattern icon=new Pattern("D:\\New folder\\WifiIcon.PNG");
		
		try {
			sc.click(icon);
			sc.wait(icon,10);
			Pattern wifi1=new Pattern("D:\\New folder\\satwa.png");
			sc.click(wifi1);
			
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}


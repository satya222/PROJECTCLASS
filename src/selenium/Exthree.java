package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Exthree {

	public static void main(String[] args) {
		// for Internet explorer browser		
					System.setProperty("webdriver.ie.driver", "C:\\course\\dri\\IEDriverServer.exe");
					
					WebDriver ie = new InternetExplorerDriver();
					ie.get("https://www.facebook.com");
					
					String url3 = ie.getCurrentUrl();
					System.out.println( url3 );
					ie.quit();
					
	
}
}

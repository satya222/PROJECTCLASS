package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampleone {
	public static void main(String[] args) {
		//configure the driver
			System.setProperty("webdriver.chrome.driver", "C:\\course\\dri\\chromedriver.exe");
			//                 (driver you want to use   (this should be the location path of the    
			//                 should be in same naming    driver you want to use)
			//                 convention) 
						
			// Launching browser 
			WebDriver cr = new ChromeDriver();
			
			// entering the url
			cr.get("https://www.facebook.com");
			
			// getting the entered ulr and to check if it is same as mentioned.
			// we are using string data type since the return type is string
			// getCurrentUrl is a default method available in WebDriver.
			String url = cr.getCurrentUrl();
			System.out.println( url );
			
			// quit.  it is also a predefined function use to terminate the program after
			// completion of execution of above program. it will close the browser.
			cr.quit();
			
			// for firefox browser
		//	System.setProperty("webdriver.gecko.driver", "C:\\course\\dri\\geckodriver.exe");
	
			//WebDriver ff = new FirefoxDriver();
			//String url2 = ff.getCurrentUrl();
			
			// for Internet Explorer 
			
			//System.setProperty("webdriver.ie.driver", "C:\\course\\dri\\IEDriverServer.exe");
			
			//WebDriver ie = new InternetExplorerDriver();
			//String url3 = ie.getCurrentUrl();
			
	}
}
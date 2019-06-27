package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exampletwo {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\course\\dri\\chromedriver.exe");
			WebDriver cr = new ChromeDriver();
			cr.get("https://mail.google.com");
			
			//to
			cr.navigate().to("https://mail.google.com");
			
			//back
			cr.navigate().back();
			
			//forward
			cr.navigate().forward();
			
			//refresh
			cr.navigate().refresh();
			cr.quit();
 }
}

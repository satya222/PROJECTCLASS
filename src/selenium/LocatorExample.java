package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExample {

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "C:\\course\\dri\\chromedriver.exe");
	WebDriver cr = new ChromeDriver();

	cr.get("https://www.facebook.com");
	//find the location of users name

	WebElement txtusername = cr.findElement(By.id("email"));
	        //  (user defined)  

	txtusername.sendKeys("JAVA");

	//find the location of password

	WebElement txtpassword = cr.findElement(By.id("pass"));

	//insert the value of password

	txtpassword.sendKeys("Hello");
	//cr.quit();
	}
	
}

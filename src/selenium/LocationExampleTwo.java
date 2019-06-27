package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationExampleTwo {

	
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "C:\\course\\dri\\chromedriver.exe");
	WebDriver cr = new ChromeDriver();

	cr.get("https://www.amazon.com/");
	//find the location of users name

	WebElement search = cr.findElement(By.id("twotabsearchtextbox"));
	        //  (user defined)  

	search.sendKeys("Samsung Galaxy Note9");

	//find the location of password

	//WebElement txtpassword = cr.findElement(By.id("pass"));

	//insert the value of password

	//txtpassword.sendKeys("Hello");
	cr.quit();
	}
	
}

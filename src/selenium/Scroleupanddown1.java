package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroleupanddown1 {
	
	public static void main (String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\course\\selenium\\dri\\chromedriver.exe");
		WebDriver cr = new ChromeDriver();
		cr.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver");
		Thread.sleep(1000);
		WebElement reader = cr.findElement(By.xpath("//a[text()='Subscribe in a reader']"));
		 JavascriptExecutor js = (JavascriptExecutor) cr;
		 js.executeScript("arguments[0].scrollIntoView(true)", reader);
		 
	}
}

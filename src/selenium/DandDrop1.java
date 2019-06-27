package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DandDrop1 {
	
			
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\course\\selenium\\dri\\chromedriver.exe");
		
		WebDriver cr = new ChromeDriver();
		cr.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(3000);
		WebElement s = cr.findElement(By.id("credit2"));
		WebElement d = cr.findElement(By.id("bank"));
		Actions act = new Actions(cr);
		act.dragAndDrop(s, d).perform();
		Thread.sleep(1000);
		//cr.quit();
	}	
	}
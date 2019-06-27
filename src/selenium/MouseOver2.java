package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\course\\dri\\chromedriver.exe");
		WebDriver cr = new ChromeDriver();
		cr.get("https://www.amazon.in/");
		Thread.sleep(3000);
		WebElement category1 = cr.findElement(By.xpath("//span[@class=\"nav-icon nav-arrow\"]"));
		Actions act = new Actions(cr);
		act.moveToElement(category1).perform();
		WebElement subcategory = cr.findElement(By.xpath("//span[text()='Mobiles, Computers']")); 
		act.moveToElement(subcategory).perform();
		
		WebElement wanted = cr.findElement(By.xpath("//span[text()='Power Banks']"));
		wanted.click();
	
	}
}

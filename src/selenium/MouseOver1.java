package selenium;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver1 {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\course\\dri\\chromedriver.exe");
	WebDriver cr = new ChromeDriver();
	cr.get("http://www.greenstechnologys.com/");
	//button[@class="close"]
	Thread.sleep(3000);
	//WebElement popupclose = cr.findElement(By.xpath("//button[@class=\"close\"]"));
   // popupclose.click();
	WebElement buttoncourse = cr.findElement(By.xpath("//a[text() = 'COURSES']"));   
	Actions act = new Actions(cr);
	act.moveToElement( buttoncourse).perform();
	
	WebElement coursecategory = cr.findElement(By.xpath("//span[text() = 'Oracle Training']"));
	act.moveToElement(coursecategory).perform();
	
	WebElement selectedcourse = cr.findElement(By.xpath("//span[text()='Oracle DBA Training']"));
	selectedcourse.click();
	
	}

}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver4 {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\course\\selenium\\dri\\chromedriver.exe");
	WebDriver cr = new ChromeDriver();
	cr.get("http://www.greenstechnologys.com");
	//button[@class="close"]
	Thread.sleep(3000);
	//WebElement popupclose = cr.findElement(By.xpath("//button[@class=\"close\"]"));
    //popupclose.click();
   // Thread.sleep(1000);
	WebElement buttoncourse = cr.findElement(By.xpath("//a[text() = 'COURSES']"));   
	Actions act = new Actions(cr);
	act.moveToElement( buttoncourse).perform();
	
	WebElement coursecategory = cr.findElement(By.xpath("//span[text() = 'SAP Training']"));
	act.moveToElement(coursecategory).perform();
	Thread.sleep(500);
	WebElement selectedcourse = cr.findElement(By.xpath("//span[text() = 'SAP MM Training']"));
	//font[text() = 'GREENS TECHNOLOGY']
	selectedcourse.click();
	Thread.sleep(1000);
	WebElement para = cr.findElement(By.xpath("//p[contains(text(),'leading Training')]"));
	//p[contains(text(),'leading Training')]
	//p[contains(text(),'ADYAR offers best software')]
	String text = para.getText();
	System.out.println(text);
	

	}
	
}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver3 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\course\\selenium\\dri\\chromedriver.exe");
		WebDriver cr = new ChromeDriver();
		cr.get("https://www.shopclues.com/wholesale.html");
		Thread.sleep(2000);
		WebElement category = cr.findElement(By.xpath("//li[@id=\"nav_45\"]"));
		Actions act = new Actions(cr);
		Thread.sleep(3000);
		act.moveToElement(category).perform();
		
		WebElement subcategory = cr.findElement(By.xpath("//a[text()='Weight Gainers']"));
		subcategory.click();
		Thread.sleep(2000);
//cr.quit();
		String currenturl = cr.getCurrentUrl();
		System.out.println(currenturl);
		cr.get("https://www.shopclues.com/weight-gainers.html?sort_by=bestsellers&sort_order=desc");
		//https://www.shopclues.com/weight-gainers.html?sort_by=bestsellers&sort_order=desc
		WebElement wanted = cr.findElement(By.xpath("//h2[text()=\"SZ  MSL PUMP 4LBs\"]"));
		wanted.click();
		Thread.sleep(2000);
		
		cr.get("https://www.shopclues.com/sz-and-msl-pump-4lbs-123145991.html?ref=m_ads_cat&icode=D|N|1|123145991|Weight%20Gainers");

		WebElement addingcart = cr.findElement(By.id("add_cart"));
		//WebElement addingcart =cr.findElement(By.xpath("//button[@class=\"btn orange-white btn_effect\"]"));
		addingcart.click();
		Thread.sleep(2000);
		//cr.quit();
 	}
}
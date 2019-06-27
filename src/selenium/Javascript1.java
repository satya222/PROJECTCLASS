package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\course\\selenium\\dri\\chromedriver.exe");
		WebDriver cr = new ChromeDriver();
		cr.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement username = cr.findElement(By.xpath("//input[@type='email']"));
		WebElement password = cr.findElement(By.xpath("//input[@type='password']"));
		//input[@type='password']
		//input[@value='Log In']
		WebElement login = cr.findElement(By.xpath("//input[@value ='Log In']"));
		// typr casting
		
		JavascriptExecutor js = (JavascriptExecutor) cr;
		js.executeScript("arguments[0].setAttribute('value','9490253756')",username);
		js.executeScript("arguments[0].setAttribute('value','ilovebindhu')",password);
		js.executeScript("arguments[0].click()",login);
		cr.quit();
	}
}


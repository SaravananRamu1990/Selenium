package firstpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AmazonMobileAddToCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumtut\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.name("field-keywords")).sendKeys("mobiles");
		   driver.findElement(By.className("nav-search-submit-button")).click();
		   driver.findElement(By.xpath("//*[@type='submit']")).click();
		 //  Actions actions = new Actions(driver);
		   //Action sendPageDown= actions.sendKeys(Keys.PAGE_DOWN).build();
		   //sendPageDown.perform();
		
	}

}

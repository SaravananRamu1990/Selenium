package seleniumtutor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProduct {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver", "D:\\seleniumtut\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		String window1=driver.getWindowHandle();
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("mobile phones");
		
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		searchButton.click();

		List<WebElement> priceElements = driver.findElements(By.className("a-price-whole"));
		Map<WebElement, Integer> map = new HashMap<WebElement, Integer>();
		for (int i = 0; i < priceElements.size(); i++) {
			try {

			if (priceElements.get(i).getText() != "") {
				map.put(priceElements.get(i), Integer.parseInt(priceElements.get(i).getText().replaceAll(",", "")));
			}
			}catch(Exception e) {
				System.out.println(" num");
			}
		}
		List<Entry<WebElement, Integer>> le = new ArrayList<Map.Entry<WebElement, Integer>>(map.entrySet());
		le.sort(Entry.comparingByValue());
		for (Entry e : le) {
			System.out.println(e.getValue());

		}
		le.get(0).getKey().click();	
		Set<String> window2=driver.getWindowHandles();
		for(String NewWindows:window2)
		{
			driver.switchTo().window(NewWindows);
		}
		WebElement AddtocartButton = driver.findElement(By.id("add-to-cart-button"));
			Actions actions=new Actions(driver);	
		actions.click(AddtocartButton).build().perform();

	}
	
}

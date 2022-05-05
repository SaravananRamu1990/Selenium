package seleniumtutor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Multiset.Entry;

public class AmazonGitHub {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement serchBox = driver.findElement(By.id("twotabsearchtextbox"));
	serchBox.sendKeys("Mobile Phones");
	
	WebElement serchButton = driver.findElement(By.id("nav-search-submit-button"));
	serchButton.click();
	List<WebElement> prices = driver.findElements(By.cssSelector("[class='a-price-whole']"));
	
	Map<WebElement,Integer> map = new HashMap<WebElement, Integer>();
	for(int i=0;i<prices.size();i++){
	if(prices.get(i).getText() !="") {
	map.put(prices.get(i),Integer.parseInt(prices.get(i).getText().replaceAll("[^0-9]", "")));
	
	}
	
	}
	}
}
	




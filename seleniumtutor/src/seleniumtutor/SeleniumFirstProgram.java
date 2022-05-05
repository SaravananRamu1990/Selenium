package seleniumtutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstProgram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumtut\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");

	}

}

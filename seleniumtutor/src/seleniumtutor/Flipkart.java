package seleniumtutor;
        import java.util.HashMap;
		import java.util.List;
		import java.util.Map;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Flipkart {

		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\seleniumtut\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();

		/* WebElement  Email = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		Email.sendKeys("1234567890");

		WebElement  Password = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
		Password.sendKeys("12345");

		WebElement  Login = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button"));
		Login.click(); */

		WebElement Searchbox = driver.findElement(By.name("q"));
		Searchbox.sendKeys("Iphone");

		WebElement SearchButton = driver.findElement(By.xpath("//*[@id=\'container\']/div/div[1]/div[1]/div[2]/div[2]/form/div/button"));
		SearchButton.click();

		List<WebElement> Price = driver.findElements(By.cssSelector("[class=\'_30jeq3 _1_WHN1\']"));
		Map<WebElement, Integer> map = new HashMap<WebElement, Integer>();
		for (int i=0;i<Price.size();i++)
		{
		System.out.println(Price.get(i).getText());
		}

		}
		}

	



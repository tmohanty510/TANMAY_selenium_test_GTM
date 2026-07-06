package selenium.test_GTM;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ebay {

	public static void main(String[] args) throws InterruptedException {
		// Automate this: On the below website https://www.ebay.com/ Search any product and click on 1st one. Click on Add to cart Click on Checkout 1 Item Click on Continue with Google[That's it]	
		//FirefoxDriver driver = new FirefoxDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.id("gh-ac"));
		
		e1.sendKeys("book");
		e1.sendKeys(Keys.ENTER);	Thread.sleep(3000);
		
		WebElement e2 = driver.findElement(By.xpath("//span[text()='Powers Volume 3: Little Deaths (Powers (Hardcover) New/Sealed']"));
		e2.click();			Thread.sleep(2000);
		
		WebElement e3 = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		e3.click();			Thread.sleep(2000);
		
		WebElement e4 = driver.findElement(By.xpath("//span[text()='Checkout 1 item']"));
		e4.click();			Thread.sleep(2000);
		
		WebElement e5 = driver.findElement(By.xpath("//span[text()='Continue with Google']"));
		e5.click();			Thread.sleep(3500);
		
		driver.quit();

	}

}

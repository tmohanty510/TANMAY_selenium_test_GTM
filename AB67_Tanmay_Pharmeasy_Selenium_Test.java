package selenium.test_GTM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pharmeasy_Automation_Test {

	public static void main(String[] args) throws InterruptedException {
		
		/*1. Launch https://pharmeasy.in/
		2. Search PCM
		3. Click on 3rd option
		4. From the list of search result click on 3rd product
		5. Select the quantity as 2
		6. Click on View cart
		*/
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://pharmeasy.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.xpath("//div[@class='typeahead-lib-Typeahead-module_placeholderContent__8HePU']"));
		search.click();
		
		WebElement searchb = driver.findElement(By.xpath("//input[@placeholder='Search medicines/Healthcare products']"));
		searchb.sendKeys("PCM"+Keys.ENTER);
		
		Thread.sleep(2000);
		
		WebElement Third = driver.findElement(By.xpath("//div[@class='Search_content__PhFON Content_withoutBreadcrumb__5AX38 Content_container__LATrD']/descendant::h1[text()='Pcm 125Mg Mix Fruit Flavour Bottle Of 60Ml Suspension']"));
		Third.click();
		
		Thread.sleep(2000);
		
		WebElement addtocart = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
		addtocart.click();
		
		Thread.sleep(2000);
		
		WebElement quantity = driver.findElement(By.xpath("//div[@role='option' and normalize-space()='2']"));
		quantity.click();

		WebElement viewcart = driver.findElement(By.linkText("View Cart"));
		viewcart.click();							
															
		Thread.sleep(8000);
		
		driver.quit();

	}

}

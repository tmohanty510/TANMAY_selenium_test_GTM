package selenium.test_GTM;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay_Ekta_Correct_Code {

	public static void main(String[] args) throws InterruptedException {
		// 
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.ebay.com/");
        Thread.sleep(3000);
        WebElement e1 = driver.findElement(By.xpath("//input[@aria-label='Search for anything']"));
        e1.sendKeys("toys");
        WebElement e2 = driver.findElement(By.xpath("//span[@class='gh-search-button__label']"));
        e2.click();
        Thread.sleep(3000);
        WebElement e3 = driver.findElement(By.xpath("(//span[@class='su-styled-text primary default'])[3]"));
        e3.click();
        Thread.sleep(3000);
        Set<String> wh = driver.getWindowHandles();
        Iterator<String> a = wh.iterator();
        String parent = a.next();
        String child = a.next();
        driver.switchTo().window(child);
        WebElement e4 = driver.findElement(By.xpath("//a[@id='atcBtn_btn_1']"));
        e4.click();
        Thread.sleep(3000);
        WebElement e5 = driver.findElement(By.xpath("(//span[@class='ux-call-to-action__cell'])[7]"));
        e5.click();
        Thread.sleep(3000);
        //Continue to Google is not appearing as it is asking to verify whether we are Human and this cannot be automated

	}

}

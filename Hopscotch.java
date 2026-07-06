package selenium.test_GTM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Hopscotch {
	public static void main(String[] args) throws InterruptedException {
		// Automate below Scenerio 1. Launch https://www.hopscotch.in/ 2. Click on Account 3. Click on Sign in 4. Click on Join us 5. Enter Full name, Email id and Mobile No 6. Click on Send OTP After automating upload your java file here
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hopscotch.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);		
		driver.findElement(By.linkText("Account")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='SIGN IN']")).click();
		Thread.sleep(4000);
		
		WebElement join = driver.findElement(By.xpath("//a[@class='css-1tg3gbc']"));
		join.click();
		Thread.sleep(2000);
		
		WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
		name.sendKeys("Tanmay Mohanty");	
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("iamtmohanty@gmail.com");
		
		WebElement number = driver.findElement(By.xpath("//input[@type='number']"));
		number.sendKeys("987654321");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Send otp']")).click();
		Thread.sleep(6000);
		
		driver.quit();

	}

}

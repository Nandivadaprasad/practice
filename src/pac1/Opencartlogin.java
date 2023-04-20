package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import freemarker.cache.WebappTemplateLoader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Opencartlogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.opencart.com/index.php?route=cms/demo");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class='box-overlay'])[2]")).click();
		
		driver.switchTo().frame(0);
		
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='input-group']/input[@name='username']")).sendKeys("prasad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='input-group']/input[@name='password']")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
        
		driver.close();
	}

}

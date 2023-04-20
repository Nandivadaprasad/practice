package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Opencart {

 	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.opencart.com/index.php?route=cms/demo");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']")).click();
		
		/*driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']")).click();
		for(String windowhandle:driver.getWindowHandles()) {
			driver.switchTo().window(windowhandle);
		}*/
		WebElement ele=driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		System.out.println(driver.getPageSource());
		


	}

}

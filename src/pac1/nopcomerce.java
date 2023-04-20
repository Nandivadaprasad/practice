package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nopcomerce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.nopcommerce.com/en/register?returnUrl=%2Fen%2Fget-started");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='navigation-top-menu-label navigation-top-menu-label-arrow'])[1]")).click();
		System.out.println("click to product");
		//driver.findElement(By.xpath("(//span[@class='navigation-top-menu-label navigation-top-menu-label-arrow'])[6]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("prasad");
		
		
	}

}

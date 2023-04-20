package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.com/intl/en-GB/gmail/about/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
	driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("8977678891");
	driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]")).click();
		//driver.quit();

	}

}

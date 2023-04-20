package pac1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		driver.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
		System.out.println(driver.getTitle());
		
		
		WebElement ele=driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(ele);
	
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("prasad");
		driver.findElement(By.xpath("//*[@id=\"pageBody\"]/div[1]/form/div[3]/div/div/div[2]/div[2]/div[2]/div[2]/a")).click();
		driver.findElement(By.linkText("Forgot Password / IPIN")).click();
		driver.findElement(By.xpath("/html/body/p[2]/a[1]")).click();

		String parentwin= driver.getWindowHandle();
		Set<String> WindowHandle = driver.getWindowHandles();
		
		for (String handle : WindowHandle) {
			
			
			driver.switchTo().window(handle);
			
			
			//driver.close();
		}
		driver.switchTo().window(parentwin);
		
			
		driver.findElement(By.xpath("/html/body/form/center/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td/a/img")).click();
				System.out.println(driver.switchTo().alert().getText());
				
		
	}

}

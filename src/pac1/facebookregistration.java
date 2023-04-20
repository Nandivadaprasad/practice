package pac1;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
public class facebookregistration {

	public static <WebElement> void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"reg_box\"]/div[1]"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("varaprasad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("nandivada");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8977678891");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("prasad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("28");
		driver.findElement(By.xpath("//*[@id=\"month\"]/option[8]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("2022");
		Thread.sleep(3000);
	   
		driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		

	}

}


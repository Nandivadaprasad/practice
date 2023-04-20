package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart1 {

	
	private static WebElement Travel;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement Travel=driver.findElement(By.xpath("(//div[@class='eFQ30H'])[7]"));
		
		Actions obj=new Actions(driver);
		Thread.sleep(2000);
		obj.moveToElement(Travel).build().perform();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement mobile=driver.findElement(By.xpath("(//div[@class='eFQ30H'])[2]"));
		Thread.sleep(2000);
		Actions obj1=new Actions(driver);
		Thread.sleep(2000);
		obj1.moveToElement(mobile).build().perform();
		Thread.sleep(2000);
		driver.navigate().refresh();
		obj.sendKeys(mobile,Keys.ENTER).build().perform();
		System.out.println("mobile option clicked");
		
		Thread.sleep(2000);
		obj.contextClick().build().perform();
		driver.close();
		

	}

}

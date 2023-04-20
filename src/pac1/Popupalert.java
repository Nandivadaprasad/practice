package pac1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupalert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://demo.guru99.com/V4/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	
	
	driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("prasad@123");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345");
     driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	
     

		Thread.sleep(3000);
		Alert ball= driver.switchTo().alert();
		ball.accept();
		System.out.println(ball.getText());
		
		Thread.sleep(3000);
		Alert ball1= driver.switchTo().alert();
		ball1.accept();
		driver.close();
		
	
	}

}

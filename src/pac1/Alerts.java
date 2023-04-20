package pac1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		System.out.println(driver.getTitle());
		
		
		 
			
		
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

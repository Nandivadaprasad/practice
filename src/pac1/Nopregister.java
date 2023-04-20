package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nopregister {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.navigate().to("'");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.findElement(By.className("ico-register")).click();
		
		
		
		
		
		WebElement radio= driver.findElement(By.id("gender-male"));
		
		radio.click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("prasad");
	    driver.findElement(By.id("LastName")).sendKeys("v");
	    Select dropdown =new Select(driver.findElement(By.name("DateOfBirthDay")));
	    dropdown.selectByValue("1");
	    Select dropdown1 =new Select(driver.findElement(By.name("DateOfBirthMonth")));
	    dropdown1.selectByValue("5");
	    Select dropdown2 =new Select(driver.findElement(By.name("DateOfBirthYear")));
	    dropdown2.selectByVisibleText("1915");
	    driver.findElement(By.id("Email")).sendKeys("abcd@gmail.com");
	    driver.findElement(By.id("Company")).sendKeys("t master");
	    
	    WebElement checkbox = driver.findElement(By.name("Newsletter"));
	    
	    
	    checkbox.click();
	    checkbox.click();
	    
	    driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("abcdef");
	    driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("abcdef");
		
	    
	    driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
		
	   // driver.close();
		
		
	    
		

	}

}

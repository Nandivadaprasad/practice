package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover {
	
	public void demo() {
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.nopcommerce.com/");
		System.out.println(driver.getTitle());
		
		
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		System.out.println(driver.getPageSource());
		
		Thread.sleep(2000);
		WebElement other =driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/ul/li[3]/a"));
		action.moveToElement(other).perform();
		Thread.sleep(3000);
		other.click();
		System.out.println(driver.getTitle());
		driver.close();

	}

}

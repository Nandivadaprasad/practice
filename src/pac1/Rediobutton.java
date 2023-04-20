package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.nopcommerce.com/");
		System.out.println(driver.getTitle());
       
		
		driver.findElement(By.xpath("//*[@class='ico-register']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"gender\"]/span[1]")).click();

	}

}

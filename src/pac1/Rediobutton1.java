package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediobutton1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.nopcommerce.com/");
		System.out.println(driver.getTitle());

		WebElement ele = driver.findElement(By.xpath("//*[@class='ico-register']"));
		ele.click();
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
		if (ele1.isDisplayed()) {
			ele1.click();
			System.out.println("ele1 is displayed");
		} else {
			System.out.println("ele1 is not displayed");
		}

		/*
		 * System.out.println(ele1.);
		 * 
		 * 
		 * Actions obj = new Actions(driver);
		 * 
		 * 
		 * obj.click(ele1).build().perform();
		 */

		driver.quit();
	}

}

package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keerthi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.keerthigifts.com/");
		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.xpath("//a[@class='nav-link ng-star-inserted active']")).click();
		driver.findElement(By.xpath("(//div[@class='collection-filter-block'])[1]")).click();
	   driver.close();

	}

}

package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.youtube.com/");
		System.out.println(driver.getTitle());
	
		driver.findElement(By.xpath("//*[@name='search_query']")).sendKeys("comedy");
		driver.findElement(By.xpath("//*[@id='search-icon-legacy']")).click();
		
		Thread.sleep(3000);
		
		String suresh=driver.getWindowHandle();
		
		for (String windowhandle:driver.getWindowHandles()) {
			
			System.out.println(driver.getWindowHandles());
			if (!suresh.equalsIgnoreCase(windowhandle)) {
				driver.findElement(By.xpath("//*[@name='search_query']"));
				driver.findElement(By.xpath("//*[@id='search-icon-legacy']")).click();
				driver.close();
				
			}
			
			
			
		}


	}

}

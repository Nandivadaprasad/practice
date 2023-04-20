package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.name("search_query")).sendKeys("prasad");
//		driver.findElement(By.xpath("//*[@id='search-icon-legacy']/yt-icon")).click();
		driver.findElement(By.xpath("//*[@id='video-title-link']")).click();	

	}

}

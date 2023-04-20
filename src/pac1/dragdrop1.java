package pac1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
Thread.sleep(3000);
		WebElement prasad=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[2]/a"));
		WebElement prasad1=driver.findElement(By.xpath("//*[@id=\"amt7\"]"));
		System.out.println(prasad1.getText());
		Thread.sleep(3000);
		Actions obj=new Actions(driver); 
		obj.dragAndDrop(prasad, prasad1).perform();
		System.out.println("drop=" + prasad1.getText());
		System.out.println(prasad.getText());
		driver.close();


	}

}

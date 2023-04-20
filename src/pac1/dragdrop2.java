package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		
		
		
		
		WebElement ele=	driver.findElement(By.xpath("//*[@id=\'post-2669\']/div[2]/div/div/div[1]/p/iframe"));
driver.switchTo().frame(ele);
		Thread.sleep(3000);
		WebElement exp=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[4]/img"));
		
	
		WebElement exp1=driver.findElement(By.xpath("//*[@id=\"trash\"]"));
		//System.out.println(exp1.getText());
		Actions obj=new Actions(driver);
		Thread.sleep(3000);
		
		obj.dragAndDrop(exp, exp1);
		
		Thread.sleep(3000);
		obj.build().perform();
		//driver.close();
		
		
		
		
	}

}

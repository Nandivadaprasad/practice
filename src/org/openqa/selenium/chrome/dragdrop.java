package org.openqa.selenium.chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	private static TimeUnit timeunits;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		
		WebElement ele=driver.findElement(By.xpath("//div[@id='post-2669']/div[2]/div/div/div[1]/p/iframe"));
		driver.switchTo().frame(ele);
		Thread.sleep(2000);
		WebElement exp=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[4]"));
		
		WebElement exp1=driver.findElement(By.xpath("//*[@id=\"trash\"]"));
		Actions obj=new Actions(driver);
		Thread.sleep(2000);
		obj.dragAndDrop(exp, exp1);
		Thread.sleep(2000);
		obj.build().perform();
		

	}

}

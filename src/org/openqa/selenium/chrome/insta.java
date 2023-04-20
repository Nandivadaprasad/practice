package org.openqa.selenium.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class insta {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL 3501\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.instagram.com/?hl=en");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("nagaveni");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("
		Thread.sleep(2000);
        System.out.println(driver.getTitle());
	}

}

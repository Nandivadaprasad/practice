package org.openqa.selenium.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		 
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form")).click();
	 //   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		//System.out.println("Admin");
        //driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("txtUsername")).sendKeys("Admin");
		System.out.println("Admin");

		driver.findElement(By.xpath("txtPassword")).sendKeys("admin123");
		System.out.println("admin123");

		driver.findElement(By.xpath("Submit")).click();
		
	}

}

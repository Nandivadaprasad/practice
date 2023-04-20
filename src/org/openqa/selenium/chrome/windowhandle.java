package org.openqa.selenium.chrome;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class windowhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL 3501\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://flexatobpuat.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("(//a[@href='javascript:void(0)'])[3]")).click();
		
		driver.findElement(By.xpath("(//a[@href='javascript:void(0)'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@href='javascript:void(0)'])[5]")).click();
		

		Iterable<String> ids=driver.getWindowHandles();
		
		System.out.println(ids);
		Iterator<String> it=ids.iterator();
		String w1=it.next();
		String w2=it. next();
		String w3=it.next();
		String w4=it.next();
		
		driver.switchTo().window(w4);
		System.out.println(driver.getTitle());
		driver.switchTo().window(w3);
		driver.switchTo().window(w2);
		driver.switchTo().window(w1);
		
		driver.switchTo().window(w4).close();
		driver.switchTo().window(w3).close();
		Thread.sleep(2000);
		driver.switchTo().window(w1).close();
		
		

		
	}
}
		
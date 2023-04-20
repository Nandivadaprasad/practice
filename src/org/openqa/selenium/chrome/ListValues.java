package org.openqa.selenium.chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ListValues {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e=driver.findElement(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']"));
		Actions act=new Actions(driver);
		act.moveToElement(e).click().build().perform();
		Thread.sleep(3000);
		List<WebElement> prices=driver.findElements(By.xpath("//p[@class=' todayPrice']"));
		System.out.println(prices.size());
		int size=prices.size();
//		for(int i=0;i<=size;i++)
//		{
//			String pricesValues=prices.get(i).getText();
//			System.out.println(pricesValues);
//		}
		
		for(WebElement value:prices)
		{
			System.out.println(value.getText());
		}
		
		

	}

}


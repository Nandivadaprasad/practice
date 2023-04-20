package pac1;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://flexatobpuat.hdfcbank.com/netbanking/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	driver.switchTo().frame(0);
	
	
	Thread.sleep(3000);
	
driver.findElement(By.xpath("//a[.='Credit Card only? Login here']")).click();
Thread.sleep(3000);

driver.findElement(By.xpath("//a[.='Prepaid Card only ? Login here']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[.='Retail Loan only? Login here']")).click();


	
	Thread.sleep(3000); 
	
	Iterable<String> ids=driver.getWindowHandles();
	
	System.out.println(ids);
	Iterator<String> it=ids.iterator();
	String w1=it.next();
	String w2=it. next();
	String w3=it.next();
	String w4=it.next();
System.out.println(driver.getTitle());
driver.switchTo().window(w3);
System.out.println(driver.getTitle());

	driver.switchTo().window(w4);
	driver.getTitle();
	System.out.println(driver.getTitle());
//driver.quit();
	driver.switchTo().window(w2);
	System.out.println(driver.getTitle());
//driver.quit();
	driver.switchTo().window(w1);
	driver.getTitle();
	System.out.println(driver.getTitle());
driver.switchTo().window(w2).close();
driver.switchTo().window(w4).close();
	



	
}
}
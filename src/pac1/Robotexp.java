package pac1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Robotexp {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		System.out.println("Admin");

		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		System.out.println("admin123");

		driver.findElement(By.name("Submit")).click();
		
		driver.findElement(By.xpath("//*[@id=\"menu_pim_viewMyDetails\"]/b")).click();
		driver.findElement(By.id("btnAddAttachment")).click();
		
		Thread.sleep(3000);
		
		WebElement els=driver.findElement(By.xpath("//*[@id=\"ufile\"]"));
		Actions obj=new Actions(driver);
		obj.moveToElement(els);
		obj.click().build().perform();
		Thread.sleep(3000);
		//Runtime.getRuntime().exec("C:\\Users\\DELL 3501\\Desktop\\upload.exe");
		Thread.sleep(10000);
		String file="C:\\Users\\DELL 3501\\Desktop\\Book1.xlsx";
		StringSelection selection=new StringSelection(file);
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection,selection);
		
		
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyPress(KeyEvent.VK_CONTROL);
		
		
		
		driver.close();
		
		

	}

}

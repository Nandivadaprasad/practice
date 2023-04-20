package pac1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("");
		System.out.println(driver.getTitle());

		
		 
		 
		  TakesScreenshot src1 = (TakesScreenshot) driver;
		  
		  File v = src1.getScreenshotAs(OutputType.FILE);
		 
		  File des = new
		  File("C:\\Users\\DELL 3501\\eclipse-workspace\\sel1\\Screenshots\\Prasad.png"
		  );
		  
		  FileUtils.copyFile(v, des);
		  
		  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		  System.out.println("Admin");
		  
		  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		  System.out.println("admin123");
		  
		  driver.findElement(By.name("Submit")).click();
		  
		  File src2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src2,new File(
		  "C:\\Users\\DELL 3501\\eclipse-workspace\\sel1\\Screenshots\\Prasad1.png"));
		  
		  
		 

		driver.findElement(By.xpath("//*[@id=\"menu_pim_viewMyDetails\"]/b")).click();

		 File src3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		File des5=new File("C:\\Users\\DEL3501\\eclipse-workspace\\sel1\\Screenshots\\prasad3.png");
		FileUtils.copyFile(src3, des5);

		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();

		FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),
				new File("C:\\Users\\DELL 3501\\eclipse-workspace\\sel1\\Screenshots\\prasad3.png"));

		driver.close();
	}

}

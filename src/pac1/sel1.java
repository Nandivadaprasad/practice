package pac1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");

//		driver.findElement(By.id("login-username")).sendKeys("abcdef");
//		driver.findElement(By.name("signin")).click();
		
		File src= driver.getScreenshotAs(OutputType.FILE);
	    File dest=new File("C:\\Users\\DELL 3501\\eclipse-workspace\\sel1\\Screenshots\\Img.Png");
		FileUtils.copyFile(src, dest);
		System.out.println("screenshot saved successfully");
		
		
		
	}

}

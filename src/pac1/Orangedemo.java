package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.orangehrm.com/hris-hr-software-demo/");
		driver.manage().window().maximize();
		System.out.println("driver.getTitle()");
		
		

	}

}

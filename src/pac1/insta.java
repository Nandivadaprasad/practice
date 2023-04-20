package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class insta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL 3501\\eclipse-workspace\\sel1\\driver1\\chromedriver.exe");
	
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	//driver.manage().window().maximize();
	driver.get("https://www.instagram.com/accounts/login/");
	System.out.println(driver.getTitle());
   }
}

	

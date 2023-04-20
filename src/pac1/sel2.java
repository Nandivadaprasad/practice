package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Yahoo")) {
			System.out.println("app open successfully");
		} else {
			System.out.println("app is not open sucessfully");
		}
		driver.findElement(By.id("login-username")).sendKeys("abcdef");
		boolean d = driver.findElement(By.id("login-signin")).isDisplayed();

		if (d == true) {
			System.out.println("next botton is displayed");
			boolean e = driver.findElement(By.id("login-signin")).isEnabled();
			if (e == false) {
				System.out.println("next botton is enabled");
				driver.findElement(By.id("login-signin")).click();
			} else {
				System.out.println("next botton is not enabled");
				
			}
			
		}
		driver.close();
	}
	
}

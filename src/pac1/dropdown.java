package pac1;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class dropdown {

	public static void main(String[] args) throws InterruptedException {
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

		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
		 
		
		
	
		
		WebElement ele= driver.findElement(By.xpath("//*[@id=\"personal_cmbNation\"]"));
		
	Select select=new Select(ele);
		
		
		
		Thread.sleep(5000);
		select.selectByIndex(194);
		
		
		Thread.sleep(5000);
		select.selectByValue("11");
		
		
		
		Thread.sleep(5000);
		select.selectByVisibleText("British");
		Thread.sleep(5000);
		System.out.println(ele.toString());
		driver.quit();
		
	}

}

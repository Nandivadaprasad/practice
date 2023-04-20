package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contactdetails {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		System.out.println("Admin");

		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		System.out.println("admin123");

		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_pim_viewMyDetails\"]/b")).click();

		driver.findElement(By.xpath("//*[@id=\"sidenav\"]/li[2]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
		
		driver.findElement(By.name("contact[street1]")).clear();
		driver.findElement(By.name("contact[street1]")).sendKeys("pragati nagar");
		driver.findElement(By.name("contact[street2]")).clear();
		driver.findElement(By.name("contact[street2]")).sendKeys("addagutta");
		driver.findElement(By.name("contact[city]")).clear();
		driver.findElement(By.name("contact[city]")).sendKeys("hydarabhad");
		driver.findElement(By.name("contact[province]")).clear();
		driver.findElement(By.name("contact[province]")).sendKeys("medhak");
		driver.findElement(By.name("contact[emp_zipcode]")).clear();
		driver.findElement(By.name("contact[emp_zipcode]")).sendKeys("533105");
		
	
		
		driver. findElement(By.xpath(""
				+ "]")).click();
		driver. findElement(By.xpath("//*[@id=\"contact_country\"]/option[14]")).click();
	    
		
		driver.findElement(By.id("contact_emp_hm_telephone")).clear();
		driver.findElement(By.id("contact_emp_hm_telephone")).sendKeys("2929");
		driver.findElement(By.id("contact_emp_mobile")).clear();
		driver.findElement(By.id("contact_emp_mobile")).sendKeys("888999");
		
		
		driver.findElement(By.name("contact[emp_work_telephone]")).clear();
		driver.findElement(By.name("contact[emp_work_telephone]")).sendKeys("01432");
		driver.findElement(By.name("contact[emp_work_email]")).clear();
		driver.findElement(By.name("contact[emp_work_email]")).sendKeys("prasad@gmail.com");
		driver.findElement(By.name("contact[emp_oth_email]")).clear();
		driver.findElement(By.name("contact[emp_oth_email]")).sendKeys("jaya@gmail.com");
		
		driver.close();
		
		

	}

	

}

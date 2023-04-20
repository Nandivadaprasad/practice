package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRM2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());

		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		System.out.println("Admin");

		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		System.out.println("admin123");

		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_pim_viewMyDetails\"]/b")).click();

		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();

		driver.findElement(By.name("personal[txtEmpFirstName]")).clear();
		driver.findElement(By.name("personal[txtEmpFirstName]")).sendKeys("vara");

		driver.findElement(By.name("personal[txtEmpMiddleName]")).clear();
		driver.findElement(By.name("personal[txtEmpMiddleName]")).sendKeys("prasad");

		driver.findElement(By.name("personal[txtEmpLastName]")).clear();
		driver.findElement(By.name("personal[txtEmpLastName]")).sendKeys("nandivada");

		driver.findElement(By.id("personal_txtEmployeeId")).clear();
		driver.findElement(By.id("personal_txtEmployeeId")).sendKeys("6117");

		driver.findElement(By.id("personal_txtOtherID")).clear();
		driver.findElement(By.id("personal_txtOtherID")).sendKeys("1234");

		driver.findElement(By.id("personal_txtLicenNo")).clear();
		driver.findElement(By.id("personal_txtLicenNo")).sendKeys("123456");

		driver.findElement(By.xpath("//*[@id=\"frmEmpPersonalDetails\"]/fieldset/ol[2]/li[4]/img")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")).click();

		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]/option[4]"));
		act.moveToElement(ele).click();

		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")).click();

		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]/option[6]"));
		act.moveToElement(ele1).click();

		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[6]/a")).click();

		
		driver.findElement(By.id("personal_txtNICNo")).clear();
		driver.findElement(By.id("personal_txtNICNo")).sendKeys("11111111");
		driver.findElement(By.id("personal_txtSINNo")).clear();
		driver.findElement(By.id("personal_txtSINNo")).sendKeys("8977");

		WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"personal_optGender_2\"]"));
		ele2.click();

		driver.findElement(By.xpath("//*[@id=\"personal_cmbMarital\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"personal_cmbMarital\"]/option[2]")).click();
		
		

		driver.findElement(By.xpath("//*[@id=\"personal_cmbNation\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"personal_cmbNation\"]/option[84]")).click();
		
		
		
		driver.findElement(By.xpath("//*[@id=\"frmEmpPersonalDetails\"]/fieldset/ol[3]/li[4]/img")).click();	
		
		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")).click();
		WebElement ele5 = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]/option[5]"));
		act.moveToElement(ele5).click();

		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")).click();

		WebElement ele6 = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]/option[8]"));
		act.moveToElement(ele6).click();

		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[6]/a")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"personal_txtEmpNickName\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"personal_txtEmpNickName\"]")).sendKeys("prasad");
		driver.findElement(By.xpath("//*[@id=\"personal_chkSmokeFlag\"]")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"personal_txtMilitarySer\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"personal_txtMilitarySer\"]")).sendKeys("no");
		
		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
		

		//driver.close();

	}

}

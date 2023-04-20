package pac1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Talentzing {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.talentzing.com/");
		
		System.out.println(driver.getTitle());
		
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//span[.='Register']"));
		act.moveToElement(ele).build().perform();
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[6]/div/ul[2]/li[3]/a")).click();
	Set<String> Window=driver.getWindowHandles();
	System.out.println(Window);
	System.out.println(driver.getTitle());
	List<String> win=new ArrayList<>(Window);
	driver.switchTo().window(win.get(1));
	System.out.println(driver.getTitle());
	
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder2_txtfirstname\"]")).sendKeys("prasad");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("8977");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("prasad@gmail");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8978467665");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("01432");
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder2_txtpwd\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder2_txtconfirmpwd\"]")).sendKeys("123456");
		
		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder2_ddlFresherLocation\"]"));
		act.moveToElement(ele1).click();
Thread.sleep(3000);
		Select dp=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder2_ddlFresherLocation']")));
		dp.selectByVisibleText("Alappuzha");
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder2_rdoGender_0\"]")).click();
		
		WebElement ele3=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder2_txtdateOfBirth\"]"));
		ele3.click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")).click();
		 driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[1]/a")).click();
       
		
		

		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder2_ddlEducation\"]")).sendKeys("b com");
driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder2$txtCollegeName']")).sendKeys("pragati");
driver.findElement(By.xpath("//select[@name='ctl00$ContentPlaceHolder2$ddlyop']")).sendKeys("1996");
 WebElement ele5= driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder2$txtkeywords']"));

 
 ele5.sendKeys("testing");
 ele5.submit();
 
 
Thread.sleep(5000);

WebElement ele6=driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder2$flUpdResume']"));
Actions obj=new Actions(driver);
obj.moveToElement(ele6);
obj.click().build().perform();

Thread.sleep(5000);
String file="C:\\Users\\DELL 3501\\Desktop\\prasad.docx";
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

Thread.sleep(5000);
 WebElement ele7 =driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder2$flUpdPhoto']"));

obj.moveToElement(ele7);
obj.click().build().perform();


String file1="C:\\Users\\DELL 3501\\Desktop\\I.png";
StringSelection selection1=new StringSelection(file1);
Clipboard clipboard1=Toolkit.getDefaultToolkit().getSystemClipboard();
clipboard1.setContents(selection1,selection1);
Thread.sleep(3000);

robo.keyPress(KeyEvent.VK_CONTROL);
robo.keyPress(KeyEvent.VK_V);
robo.keyRelease(KeyEvent.VK_V);
robo.keyRelease(KeyEvent.VK_CONTROL);
Thread.sleep(3000);
robo.keyPress(KeyEvent.VK_ENTER);
robo.keyPress(KeyEvent.VK_CONTROL);


driver.findElement(By.xpath("(//input)[43]")).click();

Thread.sleep(3000);

driver.findElement(By.xpath("//input[@type='submit']")).click();
Thread.sleep(3000);
	}



}
	

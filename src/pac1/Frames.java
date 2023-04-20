package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public abstract class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Home"));
	Thread.sleep(3000);
	WebElement ele=	driver.findElement(By.xpath("//*[@id=\"post-2632\"]/div[2]/div[1]/div/div[3]/p/iframe"));
	driver.switchTo().frame(ele);
	System.out.println(ele);
	Thread.sleep(3000);
	
	
	
    Actions action=new Actions(driver);
    
    WebElement ele1=driver.findElement(By.xpath("//*[@id=\"current_filter\"]"));
    
   action.moveToElement(ele1);
    action.moveToElement(driver.findElement(By.xpath("//*[@id=\"filter_list\"]/li[3]/div")));
    action.click().perform();

	
		
		driver.close();
		
		
	}

	
	}



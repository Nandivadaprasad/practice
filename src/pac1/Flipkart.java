package pac1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		

		driver.navigate().to("https://www.flipkart.com/?ef_id=b40d8074f78812b61c65e2ea306d6985:G:s&s_kwcid=AL!739!10!76347481385552!76347697061927&semcmpid=sem_F1167BY7_Brand_adcenter");
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		act.moveToElement(ele).click().build().perform();

		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("apple");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
		
		driver.navigate().forward();
		driver.navigate().refresh();
		List<WebElement>items=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
        int size=items.size();
        System.out.println(size);
        for(int i=0;i<size;i++)
        {
        	String s=items.get(i).getText();
        	System.out.println(s);
        	
        	List<WebElement>price=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
            int count=price.size();
            System.out.println(count);
            for(int i1=0;i1<size;i1++)
            {
            	String s1=items.get(i).getText();
            	System.out.println(s1);
            	
            }
        	
        }
	}

}

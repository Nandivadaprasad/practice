
package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL 3501\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://crossbrowsertesting.github.io/drag-and-drop");
		System.out.println(driver.getTitle());
		
WebElement mahi=driver.findElement(By.xpath("//*[@id='draggable']"));

WebElement mahi1=driver.findElement(By.xpath("//*[@id='droppable']"));
Actions ob=new Actions(driver);
ob.dragAndDrop(mahi, mahi1).build().perform();


	}

}

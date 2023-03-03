import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
public class keyBoardTest 
{
	private static final String KeyEVENT = null;
	private Object keyEVENT;

	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ourhome\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("Incognito");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
			driver.get("https://www.amazon.in");
		WebElement mobiles=	driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Actions a =new Actions(driver);
		a.contextClick(mobiles).build().perform();
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		driver.close();
		
		

	}

}

package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class NykaTest 
{

	public static void main(String[] args) throws AWTException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ourhome\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("Incognito");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
			driver.get("https://www.nykaa.com/");
			WebElement mom= driver.findElement(By.xpath("//a[text()='mom & baby']"));
			Actions a =new Actions(driver);
			a.contextClick(mom).build().perform();
			Robot r= new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			WebElement baby=driver.findElement(By.xpath("//a[text()='Baby Powder']"));
			Actions b =new Actions(driver);
			a.contextClick(baby).build().perform();
			Robot r1= new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			WebElement himalaya=driver.findElement(By.xpath("//img[@alt='Himalaya Baby Powder']"));
			Actions c =new Actions(driver);
			a.contextClick(himalaya).build().perform();
			Robot r2= new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			
	}

}

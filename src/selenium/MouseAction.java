package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseAction 
{

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Ourhome\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
ChromeOptions ch=new ChromeOptions();
ch.addArguments("Incognito");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	WebElement miniTv =	driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
	Actions a= new Actions(driver);
	//a.click(miniTv).build().perform();
	//a.contextClick(miniTv).build().perform();
	WebElement signin=driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
	WebElement orders= driver.findElement(By.xpath("//span[text()='Your Orders']")); 
	a.moveToElement(signin).build().perform();
	Thread.sleep(5000);
	a.click(orders).build().perform();
	driver.navigate().to("https://demoqa.com/droppable/");
	Thread.sleep(3000);
	WebElement source=driver.findElement(By.xpath("//div[text()='Drag me']"));
		Thread.sleep(3000);
	WebElement dest=driver.findElement(By.xpath("(//p[text()='Drop here'])[1]"));
	Thread.sleep(3000);
	a.dragAndDrop(source, dest).build().perform();
	
	
	
	}

}

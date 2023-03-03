package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class ScreenshotTest {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ourhome\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login.php/");
	driver.findElement(By.xpath("//input[@placeholder='Email or phone number']")).sendKeys("abc.com");
	WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
password.sendKeys("wert");
driver.findElement(By.xpath("//button[@type='submit']")).click();
TakesScreenshot ts= (TakesScreenshot) driver;
File source=ts.getScreenshotAs(OutputType.FILE);
File destination =new File("C:\\Users\\Ourhome\\eclipse-workspace\\selenium\\screenShot\\scr1.png");
	FileHandler.copy(source,destination);
	driver.file
	}

}

package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ourhome\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login/");
	
	//System.out.println(driver.getTitle());
	//System.out.println(driver.getCurrentUrl());
	//driver.close();
	
	//Navigation method
	//driver.navigate().to("https://www.amazon.com/sign/s?k=sign+in");
	//Thread.sleep(10000);
	//driver.navigate().back(); //facebook
	//driver.navigate().forward();//amazon
	//Thread.sleep(5000);
	//driver.navigate().refresh();//
	
	
	
	
	
	
	
	
	
	
	}
	} 
		


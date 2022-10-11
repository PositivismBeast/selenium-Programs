package Org.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLogin {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/");
	Thread.sleep(2000);
	WebElement txtUser = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
	txtUser.sendKeys("asddkkcc");
	
	
	
	
	
	
	
}
}

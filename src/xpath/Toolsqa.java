package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toolsqa {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Prabha");
	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Karan");
	driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("prabha123@gmail.com");
//	driver.findElement(By.xpath("//*[@id='gender-radio-1']")).click();
	driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("0987654321");
	driver.findElement(By.xpath("//div[@id='dateOfBirth']")).click();

	
	
	
	
	
	
	
	
	
	
	
}
}

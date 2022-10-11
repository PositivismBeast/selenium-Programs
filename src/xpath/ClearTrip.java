package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.cleartrip.com/trains");
	driver.findElement(By.xpath("//input[@id='from_station']")).sendKeys("chennai");
	driver.findElement(By.xpath("//input[@id='to_station']")).sendKeys("madurai");
	WebElement txtClass = driver.findElement(By.xpath("//select[@id='trainClass']"));
	txtClass.click();
	driver.findElement(By.xpath("//option[@value='1A']")).click();
	driver.findElement(By.xpath("//input[@value='dd/mm/yyyy']")).sendKeys("01/09/2022");
	driver.findElement(By.xpath("//select[@id='train_adults']")).click();
	driver.findElement(By.xpath("//option[@value='2']")).click();
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	
	
	
	
	
	
	
	
	
}
}

package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13 pro max");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

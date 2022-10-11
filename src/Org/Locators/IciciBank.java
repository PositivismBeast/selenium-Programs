package Org.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBank {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		WebElement txtUser = driver.findElement(By.xpath("//img[@onclick='goUserId();']"));
		txtUser.click();
		WebElement txtName = driver.findElement(By.xpath("//input[@name='AuthenticationFG.USER_PRINCIPAL']"));
		txtName.sendKeys("ABCDEF");
		WebElement txtPass = driver.findElement(By.xpath("//input[@name='AuthenticationFG.ACCESS_CODE']"));
		txtPass.sendKeys("12345");
		
		
		
		
		
		
		
	}

}

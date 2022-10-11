package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='sign-in-icon-down']")).click();
		driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']")).click();
		driver.findElement(By.xpath("//input[@id='mobileNoInp']")).sendKeys("9876543210");
//		driver.findElement(By.xpath("//*[@id='mobileNoInp']")).sendKeys("9876543210");
	}

}

package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Prabha");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("prabham812@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("prabha123mm");
		driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
		
		
		
	}

}

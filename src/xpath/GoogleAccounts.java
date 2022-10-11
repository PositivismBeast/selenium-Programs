package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAccounts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Prabhakaran");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Muthu");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("prabhakaranm812");
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("prabha123!");
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("prabha123!");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		
		
	}

}

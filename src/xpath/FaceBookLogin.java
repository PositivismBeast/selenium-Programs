package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtUserName = driver.findElement(By.xpath("//input[@id='email']"));
		txtUserName.sendKeys("Prabha123@gmail.com");
		WebElement txtPassWord = driver.findElement(By.xpath("//input[@id='pass']"));
		txtPassWord.sendKeys("abcdef");
		driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
		
	}

}

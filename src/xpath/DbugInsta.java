package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DbugInsta {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("emailOrPhone")).sendKeys("ghfhgdgh");
	}
}

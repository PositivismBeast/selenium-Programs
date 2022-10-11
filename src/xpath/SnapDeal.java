package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(signIn).perform();
		driver.findElement(By.xpath("//span[text()='Register']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("9876543210");
		
		driver.findElement(By.xpath("//button[@id='checkUser']")).click();

	}
}

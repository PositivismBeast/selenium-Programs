package dragDrop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		Thread.sleep(5000);
//		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement lnkMore = driver.findElement(By.xpath("//div[text()='More']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(lnkMore).perform();
		driver.findElement(By.xpath("//div[text()='24x7 Customer Care']")).click();
//		Thread.sleep(3000);
		WebElement text = driver.findElement(By.xpath("//p[contains(text(),'resolution')]"));
		String text2 = text.getText();
		System.out.println(text2);

//		driver.quit();

	}
}

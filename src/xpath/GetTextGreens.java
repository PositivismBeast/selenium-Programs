package xpath;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;
public class GetTextGreens {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/careers.html");
		driver.findElement(By.xpath("//span[text()='Overview']")).click();
		Thread.sleep(5000);
		WebElement text2 = driver.findElement(By.xpath("//p[contains(text(),'expert in')]"));
			String text = text2.getText();
			System.out.println(text);
			driver.quit();	
			
		
	}

}

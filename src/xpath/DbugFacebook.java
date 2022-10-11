package xpath;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DbugFacebook {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(4000);

		driver.findElement(By.name("firstname")).sendKeys("prabhakaran");
		TakesScreenshot sc = (TakesScreenshot) driver;
		File screenshotAs = sc.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		File fil = new File("C:\\Users\\admin\\eclipse-workspace\\Selenium\\Sshot/img2.png");
		FileUtils.copyFile(screenshotAs, fil);
		System.out.println(fil);

	}
}

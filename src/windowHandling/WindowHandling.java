package windowHandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 128 GB)']")).click();
		String par = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		for (String child1 : all) {
			if (!par.equals(child1)) {
				driver.switchTo().window(child1);
				System.out.println("child1 follows");

			}
		}
		WebElement textChild1 = driver.findElement(By.xpath("(//div[@class='_1AtVbE col-12-12'])[6]"));
		String text1 = textChild1.getText();
		System.out.println(text1);
		WebElement text2 = driver.findElement(By.xpath("//a[text()='About Us']"));
		String text3 = text2.getText();
		System.out.println(text3);
		text2.click();
		driver.switchTo().window(par);
		System.out.println("parent folows");
		// JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement ip = driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Black, 64 GB)']"));
		// js.executeScript("arguments[0].scrollIntoView(true)",ip);
		// js.executeScript("arguments[0].click()",ip);
		String c = ip.getText();
		ip.click();
		System.out.println("Parentoutput" + c);

		for (String child1 : all) {
			if (!par.equals(child1)) {
				driver.switchTo().window(child1);
				System.out.println("child1 follows for each");
			}

		}
		WebElement a = driver.findElement(By.xpath("//a[text()='Careers']"));
		String b = a.getText();
		System.out.println(b);
		a.click();

		// driver.switchTo().window(child1);
		// driver.quit();
		System.out.println("set method");
		// String parId = driver.getWindowHandle();
		Set<String> alltabs = driver.getWindowHandles();
		System.out.println(alltabs);
		List<String> li = new ArrayList<>();
		boolean addAll = li.addAll(alltabs);
		int size = li.size();
		System.out.println(size);
		System.out.println(addAll);
		System.out.println(li);
		// li.get(0);
		driver.switchTo().window(li.get(0));
		
		Thread.sleep(4000);
		driver.switchTo().window(li.get(1));
		driver.findElement(By.xpath("(//a[text()='Candidate Login'])[1]")).click();
		Thread.sleep(4000);
		driver.switchTo().window(li.get(2));
//		Thread.sleep(4000);
//		driver.switchTo().window(li.get(3));

	}
}

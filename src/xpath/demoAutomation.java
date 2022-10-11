package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoAutomation {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Prabha");
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("muthu");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("ghbhbhbhjbjkbkjdjhub,27ndhh.087665.");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("hhuigf@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("0998706655");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		driver.findElement(By.xpath("//input[@value='Movies']")).click();
		driver.findElement(By.xpath("//input[@value='Hockey']")).click();
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		driver.findElement(By.xpath("//a[text()='English']")).click();
		driver.findElement(By.xpath("//a[text()='Hindi']")).click();
		driver.findElement(By.xpath("//label[text()='Skills']")).click();
		driver.findElement(By.xpath("//select[@id='Skills']")).click();
		driver.findElement(By.xpath("//option[@value='Java']")).click();
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		driver.findElement(By.xpath("//option[@value='India']")).click();
		driver.findElement(By.xpath("//select[@id='yearbox']")).click();
		driver.findElement(By.xpath("//option[@value='1992']")).click();
		driver.findElement(By.xpath("//select[@ng-model='monthbox']")).click();
		driver.findElement(By.xpath("//option[@value='December']")).click();
		driver.findElement(By.xpath("//select[@ng-model='daybox']")).click();
		driver.findElement(By.xpath("//option[@value='8']")).click();
		WebElement txtPass = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		txtPass.sendKeys("12345");
		WebElement txtpass1 = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		txtpass1.sendKeys("12345");
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();

		driver.findElement(By.id("submitbtn")).click();

	}
}

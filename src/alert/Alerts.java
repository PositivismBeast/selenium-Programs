package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");	
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Prabhakaran");
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		WebElement txtName = driver.findElement(By.xpath("//p[@id='demo1']"));
		String text2 = txtName.getText();
		System.out.println(text2);
		
		
		
//		driver.switchTo().alert().sendKeys("Ok");
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		
		
		
		
	

	}

}

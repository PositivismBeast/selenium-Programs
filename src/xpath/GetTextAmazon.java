package xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetTextAmazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in/");
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		findElement.click();
		WebElement txt = driver.findElement(By.xpath("//p[@class='lead']"));
		String text = txt.getText();
		System.out.println(text);
		driver.quit();
	}
}

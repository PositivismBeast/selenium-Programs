package dragDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import BaseClass.BaseClassPrabhaKaranM;

public class DragAndDrop extends BaseClassPrabhaKaranM {
	public static void main(String[] args) throws Exception {

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		// WebDriver driver=new ChromeDriver();
		// driver.get("https://www.demo.guru99.com/test/drag_drop.html");
		// driver.manage().window().maximize();
		// WebElement a = driver.findElement(By.id("credit2"));
		// WebElement b = driver.findElement(By.xpath("//ol[@id='bank']"));
		// WebElement c = driver.findElement(By.xpath("//li[@id='fourth'][1]"));
		// WebElement d = driver.findElement(By.id("amt7"));
		// WebElement e = driver.findElement(By.id("credit1"));
		// WebElement f = driver.findElement(By.xpath("//ol[@id='loan']"));
		// WebElement g = driver.findElement(By.xpath("//li[@id='fourth'][2]"));
		// WebElement h = driver.findElement(By.id("amt8"));
		// Actions actions =new Actions(driver);
		// actions.dragAndDrop(a, b).perform();
		// actions.dragAndDrop(c, d).perform();
		// actions.dragAndDrop(e, f).perform();
		// actions.dragAndDrop(g, h).perform();

		DragAndDrop a = new DragAndDrop();
		a.openChrome();
		a.getUrl("https://www.demo.guru99.com/test/drag_drop.html");
		a.maximizeWindow();
		WebElement flu = a.fluentWaitByElementReturnElement(10, 1, a.locateById("credit2"));
	a.sendKeys(a.locateById("credit2"), "ihghjf");
		
//		WebElement b = a.locateById("credit2");
		WebElement c = a.locateByXpath("//ol[@id='bank']");
		String text=flu.getText();
		System.out.println(text);
		a.implicityWait(5);
		a.dragAndDrop(flu, c);

	}

}

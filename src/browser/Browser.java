package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__"
				+ "=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
//		String title = driver.getTitle();
//		System.out.println(title);
		driver.findElement(By.id("user-id-goahead")).click();
		driver.findElement(By.className("login-input mode-select-userid")).sendKeys("Greens Technology");
		WebElement txtPassWord = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		txtPassWord.sendKeys("Greens Technology");
//		driver.quit();
		
		
		
	}

}

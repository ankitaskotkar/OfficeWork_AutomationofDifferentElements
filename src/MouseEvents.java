

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akotkar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		
		WebElement linkHome= driver.findElement(By.linkText("Home"));
		
		Actions builder = new Actions(driver);
		Action mouseoverHome= builder.moveToElement(linkHome).build();
		
		mouseoverHome.perform();
		
		
	}

}

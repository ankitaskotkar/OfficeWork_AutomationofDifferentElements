import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementVSWebElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akotkar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		 driver.get("http://demo.guru99.com/test/ajax.html");
         //Element
		 
		 System.out.println("Radio Button Text by Element:"+driver.findElement(By.name("name")).getAttribute("Value"));
		 
		 // WebElements
		 
		List<WebElement> elements = driver.findElements(By.name("name"));
		
		for(int i=0;i<elements.size();i++) {
			System.out.println("Radio button Text ByElements:"+elements.get(i).getAttribute("value"));
		}
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\akotkar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://demo.guru99.com/test/upload/");
     WebElement uploadFile=driver.findElement(By.id("uploadfile_0"));
     uploadFile.sendKeys("D:\\ActivityLogsRapidPRoductionTask1964220.xlsx");
     
     driver.findElement(By.xpath(".//*[@id='terms']")).click();
     driver.findElement(By.xpath(".//*[@id='submitbutton']")).click();
     
 
}
}

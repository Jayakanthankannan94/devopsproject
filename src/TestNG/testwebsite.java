package TestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testwebsite {
  @Test
  public void webtest() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");   
		ChromeDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://35.226.14.214:32787");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("About Us")).click();
			  
  }
}

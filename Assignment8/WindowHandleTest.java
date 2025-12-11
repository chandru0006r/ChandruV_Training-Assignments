package Assignment8;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandleTest {
  @Test
  public void MulWindowTest() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  String parent = driver.getWindowHandle();
	  
	  driver.findElement(By.id("openwindow")).click();
	  driver.findElement(By.id("opentab")).click();
	  
	  Set<String> wins = driver.getWindowHandles();
	  
	  for(String win : wins) {
		  System.out.println("Current page is: " + win);
		  driver.switchTo().window(win);
		  System.out.println(win + " title is " + driver.getTitle());
		  
		  if( (!win.equals(parent))) {
			  driver.close();
		  }
	  }
	  
	  
	  
  }
}

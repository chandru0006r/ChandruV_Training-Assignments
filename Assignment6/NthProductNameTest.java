package Assignment6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NthProductNameTest {
  @Test
  public void flipTest() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com/");
	  
	  driver.findElement(By.name("q")).sendKeys("laptop",Keys.ENTER);
	  
	  List<WebElement> list = driver.findElements(By.className("RG5Slk"));
	  
	  System.out.println("\n\n\n ----------------------------------");
	  for(WebElement li:list) {
		  System.out.println(li.getText());
	  }
	  
	  System.out.println("\nTotal = " + list.size() + "\n7th Laptop name is = " + list.get(6).getText() + "\n");

	  Thread.sleep(1000);
	  
	  driver.navigate().back();
      driver.findElement(By.name("q")).sendKeys("TV",Keys.ENTER);
      driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[14]/div/div/div")).click();
      System.out.println(driver.getTitle());
      driver.navigate().back();
      driver.findElement(By.name("q")).sendKeys("Smart Phones",Keys.ENTER);
      driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[3]/div/div/div")).click();
      System.out.println(driver.getTitle());

	  Thread.sleep(2000);
	  driver.quit();
  }
}

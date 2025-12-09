package Assignment5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioBtnTest {
  @Test
  public void RadioTest() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@value='radio1']")).click();

	  Thread.sleep(2000);
	  driver.findElement(By.id("checkBoxOption1")).click();
	  driver.findElement(By.id("checkBoxOption3")).click();

	  Thread.sleep(6000);
	  driver.quit();
  }
}
















//
//WebDriver driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//driver.findElement(By.xpath("//input[@value='radio2']")).click();
//System.out.println("Radio Button 2 selected");
//Thread.sleep(2000);
//
//driver.findElement(By.id("checkBoxOption1")).click();
//System.out.println("Checkbox Option1 selected");
//
//Thread.sleep(1000);
//
//driver.findElement(By.id("checkBoxOption3")).click();
//System.out.println("Checkbox Option3 selected");
//
//Thread.sleep(2000);
//
//driver.quit();

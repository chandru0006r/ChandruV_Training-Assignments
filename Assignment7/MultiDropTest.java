package Assignment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MultiDropTest {

    @Test
    public void MultipleDropTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.get("https://demo.mobiscroll.com/jquery/select/multiple-select");
//        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#multiple-select-context > label > span.mbsc-ios.mbsc-ltr.mbsc-textfield-inner.mbsc-textfield-inner-outline.mbsc-textfield-inner-stacked.mbsc-textarea-inner.mbsc-textfield-tags-inner > span.mbsc-textfield-tags.mbsc-ios.mbsc-ltr.mbsc-textfield.mbsc-textfield-outline.mbsc-select.mbsc-textfield-stacked.mbsc-textfield-outline-stacked.mbsc-textarea > span")).click();
//        Thread.sleep(5000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//        wait.until(ExpectedConditions.elementToBeClickable(
//        	    By.xpath("//div[contains(text(),'Books') and contains(@style,'rotateX(-') and not(contains(@style,'rotateX(-160')) and not(contains(@style,'rotateX(-180'))]"))
//        	).click();

        
//        wait.until(ExpectedConditions.elementToBeClickable(
//                By.cssSelector("div.mbsc-scroller-items-3d > div:nth-child(11)")
//        )).click();
////        
        wait.until(ExpectedConditions.elementToBeClickable(
        	    By.xpath("//div[@role='option' and text()='Books']/span")
        	)).click();
        
        wait.until(ExpectedConditions.elementToBeClickable(
        	    By.xpath("//div[@role='option' and text()='Movies, Music & Games']/span")
        	)).click();
        
        wait.until(ExpectedConditions.elementToBeClickable(
        	    By.xpath("//div[@role='option' and text()='Electronics & Computers']/span")
        	)).click();
        
//        wait.until(ExpectedConditions.elementToBeClickable(
//        	    By.xpath("//div[@role='option' and text()='Movies, Music & Games']")
//        	)).click();
//        wait.until(ExpectedConditions.elementToBeClickable(
//        	    By.xpath("//div[@role='option' and text()='Books']")
//        	)).click();

//        wait.until(ExpectedConditions.elementToBeClickable(
//        	    By.xpath("//div[@role='option' and contains(normalize-space(.), 'Electronics & Computers')]")
//        	)).click();


//        wait.until(ExpectedConditions.elementToBeClickable(
//                By.xpath("//div[contains(@class,'mbsc-scroller-wheel-item') and text()='Clothing & Jewelry']")
//        )).click();

//        driver.findElement(By.xpath("//button[text()='Set']")).click();

//        Thread.sleep(10000);
//        driver.findElement(By.id("multiple-select-input")).sendKeys(Keys.ENTER);
//        Select s1 = new Select(driver.findElement(By.id("multiple-select-select")));
//        s1.selectByValue("2");
//        s1.selectByValue("4");
//        s1.selectByContainsVisibleText("Clothing & Jewelry");
//        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(20))
//                .pollingEvery(Duration.ofSeconds(2))
//                .ignoring(NoSuchElementException.class)
//                .ignoring(StaleElementReferenceException.class);
//        
//        fluentWait.until(driverRef ->
//                driverRef.findElement(By.id("multiple-select-input")).isDisplayed()
//        );
//        Thread.sleep(5000);
//        driver.findElement(By.id("multiple-select-input")).click();

        // You can continue selecting items here, example:
        // driver.findElement(By.xpath("//div[text()='BMW']")).click();

//        driver.quit();
    }
}


//<div aria-hidden="true" class="mbsc-scroller-wheel-item mbsc-ios mbsc-ltr mbsc-wheel-item-checkmark mbsc-scroller-wheel-item-3d mbsc-wheel-item-multi" role="option" style="height: 34px; line-height: 34px; transform: rotateX(140deg) translateZ(85px);"><span class=" mbsc-ios mbsc-ltr mbsc-wheel-checkmark"></span></div>
//<div aria-hidden="true" class="mbsc-scroller-wheel-item mbsc-ios mbsc-ltr mbsc-wheel-item-checkmark mbsc-scroller-wheel-item-3d mbsc-wheel-item-multi" role="option" style="height: 34px; line-height: 34px; transform: rotateX(-40deg) translateZ(85px);"><span class=" mbsc-ios mbsc-ltr mbsc-wheel-checkmark"></span>Electronics &amp; Computers</div>
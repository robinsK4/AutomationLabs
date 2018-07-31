package seleniumPra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

  public static void main(String[] args) throws InterruptedException {
    // TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "D:\\Auto\\New\\Driver\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("https://www.socioboard.com/Index/SignIn");
    driver.manage().deleteAllCookies();
        driver.findElement(By.id("logUserName")).sendKeys("lisassprings@gmail.com");
        driver.findElement(By.id("logPassword")).sendKeys("889709Ash@");
        driver.findElement(By.id("logPassword")).submit();
        Thread.sleep(30000);
        driver.navigate().to("https://www.socioboard.com/home/index#/twitteranalytics");
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[@class='waves-effect waves-block waves-light dropdown-button']//i[@class='icon-earphones-alt grey-text text-darken-4']"))).build().perform();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@class='waves-effect waves-orange  white-text']//span[@class='groupslist']//i[@class='icon-basket']")).click();
        
  }

}

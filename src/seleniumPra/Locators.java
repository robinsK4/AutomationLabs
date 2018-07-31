package seleniumPra;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
  public static void main(String [] args){
    System.setProperty("webdriver.chrome.driver", "D:\\Auto\\New\\Driver\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.get("http://www.socioboard.com");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    //4. classname
      driver.findElement(By.className("modal-trigger")).click();
    //1. id
    driver.findElement(By.id("FirstName")).sendKeys("Lisa");
    //2. xpath
    driver.findElement(By.xpath("//*[@id='LastName']")).sendKeys("srings");
    //3. name
    driver.findElement(By.name("EmailId")).sendKeys("lisassprings@gmail.com");
    
    //5. cssselector (# for id) , (. for class) by id use #
    driver.findElement(By.cssSelector("#Password")).sendKeys("889709Ash@");
    //6.cssselector ( by class use .)
    //driver.findElement(By.cssSelector(".validate")).click();
    driver.findElement(By.xpath("//input[@id='CnfPassword' and @type='password']")).sendKeys("889709Ash@");
    //7. partial link text
    //driver.findElement(By.linkText("Verify")).click();
    driver.findElement(By.xpath("//a[@id='submitPromoButton' and @class='btn blue']")).click();
    
    
  }

}

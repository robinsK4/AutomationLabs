package seleniumPra;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","D:\\Auto\\New\\Driver\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
    driver.get("https://socioboard.com");
        //driver.findElement(By.xpath("//a[contains(@class,'waves-effect waves-light btn modal-trigger  grey darken-4 ')]")).click();
        //driver.findElement(By.xpath("//a[starts-with(@class,'waves-effect')]")).click();
        driver.findElement(By.xpath("//a[ends-with(@class,'-trigger  grey darken-4')]")).click();
  }

}
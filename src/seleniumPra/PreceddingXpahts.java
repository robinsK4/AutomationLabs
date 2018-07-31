package seleniumPra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PreceddingXpahts {

  public static void main(String[] args) throws InterruptedException {
    // TODO Auto-generated method stub
    // TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","D:\\Auto\\New\\Driver\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
    driver.get("https://www.socioboard.com");
    driver.findElement(By.xpath("//a[@class='waves-effect waves-light btn modal-trigger  grey darken-4 ']")).click();
    driver.findElement(By.id("logUserName")).sendKeys("lisassprings@gmail.com");
        driver.findElement(By.id("logPassword")).sendKeys("889709Ash@");
        driver.findElement(By.id("logPassword")).submit();
        Thread.sleep(15000);
        driver.findElement(By.xpath("//i[@class='large mdi-editor-mode-edit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@title='Test Just 3']//preceding-sibling::input[@class='subcheckbox']")).click();

  }

}

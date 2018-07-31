package seleniumPra;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

  public static void main(String[] args) throws IOException, InterruptedException {
    // TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "D:\\Auto\\New\\Driver\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.get("http://www.socioboard.com");
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//a[@class='waves-effect waves-light btn modal-trigger  grey darken-4 ']")).click();
    driver.findElement(By.id("logUserName")).sendKeys("lisassprings@gmail.com");
        driver.findElement(By.id("logPassword")).sendKeys("889709Ash@");
        driver.findElement(By.id("logPassword")).submit();
        driver.findElement(By.xpath("//a[@class='btn btn_style red btn_style btn_round right']")).click();
        Thread.sleep(5000);
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File ("D://sel//sel1.png"));
        driver.close();
  }

}

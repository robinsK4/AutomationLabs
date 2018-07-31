package TestNGBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class GoogleTitleTest {
ChromeDriver driver;
  
  @BeforeMethod
  public void launchBrowser(){
    System.setProperty("webdriver.chrome.driver", "D:\\Auto\\New\\Driver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("http://www.google.com");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  
    
  }
  
  @Test
  public void opengoogle(){
    String title = driver.getTitle();
      System.out.println(title);
      Assert.assertEquals(title, "Gmail");
  }
  
  @Test
  public void Googllogo(){
    Boolean b =driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
    System.out.println(b);
    Assert.assertTrue(b);
  }
  
  @Test
  public void Link(){
    Boolean b = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isDisplayed();
    System.out.println(b);
    Assert.assertEquals(b, "Gmael");
  }
  
  @AfterMethod
  public void After(){
    driver.manage().deleteAllCookies();
    driver.quit();
  }
}

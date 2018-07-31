package TestNGBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

  ChromeDriver driver;
  
  @BeforeMethod
  public void launchBrowser(){
    System.setProperty("webdriver.chrome.driver", "D:\\Auto\\New\\Driver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("http://www.google.com");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  
    
  }
  
  @Test(priority=3,groups = "1")
  public void opengoogle(){
    String title = driver.getTitle();
      System.out.println(title);
  }
  
  @Test(priority=2, groups = "1")
  public void Googllogo(){
    Boolean b =driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
    System.out.println(b);
  }
  
  @Test(priority=1,groups = "2")
  public void Link(){
    Boolean b = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isDisplayed();
    System.out.println(b);
  }
  
  @AfterMethod
  public void After(){
    driver.manage().deleteAllCookies();
    driver.quit();
  }
}

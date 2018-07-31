package seleniumPra;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup {

  public static void main(String[] args) throws InterruptedException {
    // TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "D:\\Auto\\New\\Driver\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("http://app.poweradspy.com");
    driver.findElement(By.id("amember-login")).sendKeys("rahul2017");
    driver.findElement(By.id("amember-pass")).sendKeys("rahul2017");
    driver.findElement(By.id("amember-pass")).submit();
    Thread.sleep(10000);
    driver.findElement(By.xpath("//i[@class='ion-social-twitter-outline']")).click();
    Thread.sleep(2000);
    
    Set <String> handler = driver.getWindowHandles();
    Iterator <String> it = handler.iterator();
    
    String ParentWindowId = it.next();
    System.out.println("Parent Window Id = "+ParentWindowId);
    
    String ChildWindowId = it.next();
    System.out.println("Child Window Id = "+ChildWindowId);
 
    
  driver.switchTo().window(ChildWindowId);
  Thread.sleep(2000);
  System.out.println(driver.getCurrentUrl());
    Thread.sleep(2000);
    driver.close();
    Thread.sleep(2000);
    driver.switchTo().window(ParentWindowId);
    Thread.sleep(2000);
    System.out.println(driver.getCurrentUrl());
    
    
    
    
    

  }

}

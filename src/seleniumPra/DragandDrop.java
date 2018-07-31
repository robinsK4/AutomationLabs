package seleniumPra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

  public static void main(String[] args) throws InterruptedException {
    // TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "D:\\Auto\\New\\Driver\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("http://jqueryui.com/droppable/");
    Actions action = new Actions(driver);
    Thread.sleep(5000);
    action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']"))).
    moveToElement(driver.findElement(By.xpath("//*[@id='droppable']"))).
    release().
    build().
    perform();
    

  }

}

    
    
  
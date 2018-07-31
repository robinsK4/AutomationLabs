package seleniumPra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlywaitConcept {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "D:\\Auto\\New\\Driver\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("http://www.socioboard.com");
    
        clickOn(driver, driver.findElement(By.xpath("//ul[@class='right hide-on-med-and-down']//a[@class='waves-effect waves-light btn modal-trigger  grey darken-4 ']")), 20);
        clickOn(driver, driver.findElement(By.id("logUserName")),20);
        
  }
  
  
  public static void clickOn(ChromeDriver driver , WebElement locator, int timeout){
    new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
    locator.click();
    
  }

}

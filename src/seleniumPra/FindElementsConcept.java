package seleniumPra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","D:\\Auto\\New\\Driver\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
    driver.get("https://facebook.com");
    
      List <WebElement> LinkLists = driver.findElementsByTagName("a");
      System.out.println(LinkLists.size());
      for(int i=0 ; i<LinkLists.size(); i++){
        String LinkText = LinkLists.get(i).getText();
        System.out.println(LinkText);
      }

  }

}

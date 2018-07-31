package seleniumPra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchText {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","D:\\Auto\\New\\Driver\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
    driver.get("https://www.google.com/");
    driver.findElement(By.id("lst-ib")).sendKeys("Testing");
    List <WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
    System.out.println("Total number of suggestions : "+ list.size());
    
    for (int i=0; i<list.size(); i++){
      System.out.println(list.get(i).getText());
      if(list.get(i).getText().equals("testing tools")){
      list.get(i).click();
      break;
      
    }
  }
  }
}

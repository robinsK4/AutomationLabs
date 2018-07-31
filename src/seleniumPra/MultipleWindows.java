package seleniumPra;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

  @SuppressWarnings("unused")
public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "D:\\Auto\\New\\Driver\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.get("http://www.socioboard.com");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    System.out.println("Before changing url " +driver.getCurrentUrl());
    String Parent = driver.getWindowHandle();
    driver.findElement(By.xpath("//a[@class='dropdown-button active']")).click();
    driver.findElement(By.linkText("Wiki")).click();
    Set<String>s1=driver.getWindowHandles();
    

  }

}


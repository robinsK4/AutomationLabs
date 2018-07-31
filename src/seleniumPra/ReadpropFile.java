package seleniumPra;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadpropFile {
    static WebDriver driver;
  public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub

    Properties prop = new Properties();
    FileInputStream fis = new FileInputStream("C:/workspace/Selpra/src/pra/config.properties");
    prop.load(fis);
    
    String url = prop.getProperty("socioboard");
    System.out.println(url);
    System.setProperty("webdriver.chrome.driver","D:\\Auto\\New\\Driver\\chromedriver.exe");
      driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(url);
        driver.findElement(By.xpath(prop.getProperty("signin_xpath"))).click();
        driver.findElement(By.id(prop.getProperty("email_id"))).sendKeys(prop.getProperty("username"));
        driver.findElement(By.id(prop.getProperty("password_id"))).sendKeys(prop.getProperty("password"));
        driver.findElement(By.id(prop.getProperty("password_id"))).submit();
  }

}

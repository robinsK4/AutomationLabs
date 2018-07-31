package seleniumPra;

import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
  public static void main(String [] args) throws IOException{
    System.setProperty("webdriver.chrome.driver", "D:\\Auto\\New\\Driver\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.get("http://www.socioboard.com");
    driver.manage().window().maximize();
    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(src, new File("d://sel//pra.png"));
    driver.close();
  }

}

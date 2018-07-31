package seleniumPra;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopup {
  public static void main(String [] args) throws InterruptedException{
    System.setProperty("webdriver.chrome.driver","D:\\Auto\\New\\Driver\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://html.com/input-type-file/");
    driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\GLB-133\\Downloads\\630f0ef3f6f3126ca11f19f4a9b85243--dachshund-puppies-weenie-dogs.jpg");
  }


}

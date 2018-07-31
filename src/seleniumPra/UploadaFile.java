package seleniumPra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadaFile {

  public static void main(String[] args) throws InterruptedException {
    // TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "D:\\Auto\\New\\Driver\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.navigate().to("https://www.socioboard.com/Index/Careers");
    Thread.sleep(5000);
    WebElement frame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
    driver.switchTo().frame(frame);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[@class='jobdetail']")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@class='tooltips']//input[@id='zr-detail-view-applybtn' and @class='tem1_applyBut']")).click();
    Thread.sleep(5000);
    driver.switchTo().frame("webformframe85078000002431257");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id='theFile_link(Attach resume)']")).sendKeys("C:\\Users\\GLB-133\\Downloads\\630f0ef3f6f3126ca11f19f4a9b85243--dachshund-puppies-weenie-dogs.jpg");
    

  }

}

package seleniumPra;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.NoSuchElementException;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class CalendarSelectTest {

	  public static void main(String[] args) throws InterruptedException {
	    // TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver", "D:\\Auto\\New\\Driver\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("http://www.socioboard.com");
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[@class='waves-effect waves-light btn modal-trigger  grey darken-4 ']")).click();
	    driver.findElement(By.id("logUserName")).sendKeys("lisassprings@gmail.com");
	        driver.findElement(By.id("logPassword")).sendKeys("889709Ash@");
	        driver.findElement(By.id("logPassword")).submit();
	        Thread.sleep(30000);
	        driver.navigate().to("https://www.socioboard.com/home/index#/twitteranalytics");
	        Thread.sleep(5000);
	        driver.navigate().back();
	        Thread.sleep(5000);
	        Actions action = new Actions(driver);
	        action.moveToElement(driver.findElement(By.xpath("//img[@class='circle profile-nav-pic ']"))).build().perform();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//span[@class='groupslist']//i[@class='icon-user']")).click();
	        driver.navigate().refresh();
	        Thread.sleep(20000);
	        driver.findElement(By.xpath("//input[@class='datepicker picker__input ng-untouched ng-valid ng-not-empty ng-dirty ng-valid-parse']")).click();
	        String date = "7-September-1994";
	        String dateArr[]= date.split("-");
	        String day = dateArr[0];
	        String month = dateArr[1];
	        String Year = dateArr[2];
	        
	        Select select = new Select(driver.findElement(By.xpath("//select[@class='picker__select--month browser-default']")));
	        select.selectByVisibleText(month);
	        Thread.sleep(2000);
	        Select select1 = new Select(driver.findElement(By.xpath("//select[@class='picker__select--year browser-default']")));
	        select1.selectByVisibleText(Year);
	        Thread.sleep(2000);
	        
	        
	        String beforexpath = "//*[@id='P923314597_table']/tbody/tr[";
	        String afterxpath = "]/td[";
	       
	        
	       final int totalWeekDays = 7;
	       boolean flag = false;
	       String dayval = null;
	       
	       for(int rowNum=1; rowNum<=6 ;rowNum++){
	         for(int colNum=1; colNum<=totalWeekDays; colNum++){
	           try{
	           dayval = driver.findElement(By.xpath(beforexpath+rowNum+afterxpath+colNum+"]/div")).getText();
	           }catch (NoSuchElementException e){
	             System.out.println("Please enter a correct data value");
	             flag = false;
	             break;
	             
	           }
	           System.out.println(dayval);
	           if(dayval.equals(day)){
	             driver.findElement(By.xpath(dayval)).click();
	             flag = true;
	             break;
	           }
	         }
	         if (flag){
	           break;
	         }
	       }
	        

	  }

	}


package TestNGBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
  
  
  @BeforeSuite
  public void SetUpSystemProperty(){
    System.out.println("SetUpSystemProperty");
  }
  
  @BeforeTest
  public void Openbroswer(){
    System.out.println("OpenBroswer");
  }
    @BeforeClass
    public void Enterurl(){
      System.out.println("EnterUrl");
      
    }
    
    @BeforeMethod
    public void login(){
      System.out.println("Login");
    }
    
    @Test
    public void googleTitleText(){
      System.out.println("GoogleTitleText");
    }
    
    @Test
    public void YahooTitleText(){
      System.out.println("YahooTitleText");
    }
    
    @AfterMethod
    public void logout(){
      System.out.println("Logout");
    }
    
    @AfterClass
    public void Closebrowser(){
      System.out.println("CloseBrowser");
    }
    @AfterTest
    public void deleteAllCookies(){
      System.out.println("DeleteallCookies");
    }
  }

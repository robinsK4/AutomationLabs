package TestNGBasics;

import org.testng.annotations.Test;

public class TestNGFeatures1 {
  
  @Test
  public void Login(){
    System.out.println("Login");
    int i = 9/0;
    System.out.println(i);
  }
  
  @Test(dependsOnMethods="Login")
  public void Logout(){
    System.out.println("Logout");
  }
}

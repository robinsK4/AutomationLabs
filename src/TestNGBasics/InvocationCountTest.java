package TestNGBasics;

import org.testng.annotations.Test;

public class InvocationCountTest {

  
  @Test(invocationCount=10)
  public void Total(){
    int i=10;
    int j=20;
    int k= i+j;
    System.out.println(k);
  }
}

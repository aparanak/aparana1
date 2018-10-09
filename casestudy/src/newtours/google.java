package newtours;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class google {
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method google");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method google");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class google");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class google");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test google");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test google");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite google");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite google");
  }

}

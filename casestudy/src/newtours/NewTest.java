package newtours;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.name("userName")).sendKeys("mercury");
	  driver.findElement(By.name("password")).sendKeys("mercury");
	  driver.findElement(By.name("login")).click();
	  driver.findElement(By.cssSelector("input[value='oneway']")).click();
	  Select pass = new Select(driver.findElement(By.name("passCount")));
	  pass.selectByIndex(2);
	  Select from= new Select(driver.findElement(By.name("fromPort")));
	  from.selectByValue("London");
	  Select frommon = new Select(driver.findElement(By.name("fromMonth")));
	  frommon.selectByValue("February");
	  Select fromdate = new Select(driver.findElement(By.name("fromDay")));
	  fromdate.selectByValue("27");
	  Select to= new Select(driver.findElement(By.name("toPort")));
	  to.selectByValue("Portland");
	  Select tomon = new Select(driver.findElement(By.name("toMonth")));
	  tomon.selectByValue("");
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selium 3.0\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://newtours.demoaut.com");
  }

  @AfterTest
  public void afterTest() {
  }

}

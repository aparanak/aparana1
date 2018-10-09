package newtours;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class case1 {
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver.findElement(By.linkText("REGISTER")).click();
	  driver.findElement(By.name("firstName")).sendKeys("ram");
	  driver.findElement(By.name("lastName")).sendKeys("kumar");
	  driver.findElement(By.name("phone")).sendKeys("9500876548");
	  driver.findElement(By.id("userName")).sendKeys("rtyy@gmail.com");
	  driver.findElement(By.name("address1")).sendKeys("aaa");
	  driver.findElement(By.xpath("//input[@name='city']")).sendKeys("chennai");
	  driver.findElement(By.name("state")).sendKeys("aaa");
	  driver.findElement(By.name("postalCode")).sendKeys("643456");
	  Select country= new Select(driver.findElement(By.name("country")));
	  country.selectByVisibleText("AUSTRALIA");
	  driver.findElement(By.id("email")).sendKeys("ram");
	  driver.findElement(By.name("password")).sendKeys("12345");
	  driver.findElement(By.name("confirmPassword")).sendKeys("12345");
	 Assert.assertEquals(driver.getTitle(),"Register: Mercury Tours");
	  driver.findElement(By.name("register")).click();
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

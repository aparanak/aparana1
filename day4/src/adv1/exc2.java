package adv1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class exc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selium 3.0\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.allstate.com");
        WebElement a= driver.findElement(By.linkText("Contact Us"));
        Actions act= new Actions(driver);
        act.clickAndHold(a).release(a);
        act.build().perform();
       
	}

}

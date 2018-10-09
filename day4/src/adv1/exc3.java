package adv1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class exc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selium 3.0\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement main= driver.findElement(By.linkText("Amazon Music"));
       Actions act= new Actions(driver);
       act.moveToElement(main).build().perform();;
       //WebElement sub=driver.findElement(By.linkText("Lenovo"));
      //act.click(sub).build().perform();
       
       
        

	}

}

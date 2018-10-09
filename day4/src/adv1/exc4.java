package adv1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selium 3.0\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.allstate.com");
	    
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String sText =  js.executeScript("return document.title;").toString();
		System.out.println(sText);

		//WebElement contact_icon = driver.findElement(By.linkText("Contact Us"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",  driver.findElement(By.linkText("Contact Us")) );
	
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("alert('hello world');", driver.findElement(By.xpath(".//*[@id='s_Text']")));
	}
}

package adv1;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exc5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selium 3.0\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");
        Cookie coo=new Cookie("username","password");
        driver.manage().addCookie(coo);
        Set<Cookie> cookie_set=driver.manage().getCookies();
        for(Cookie temp_cookie :cookie_set)
        {
        	System.out.println("name of th cookie:"+temp_cookie.getName()+ "and its value"+temp_cookie.getValue()+"get domain"+temp_cookie.getDomain()+"get path"+temp_cookie.getPath()+"get expiry date"+temp_cookie.getExpiry()+"is secure"+temp_cookie.isSecure());
        	
        }
        
        driver.manage().deleteCookie(coo);
	}

}

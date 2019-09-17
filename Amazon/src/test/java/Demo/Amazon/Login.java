package Demo.Amazon;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Resources.base;
import pageObject.LoginWindow;

public class Login extends base{
	
	    @Test
		public void typelog() throws IOException {
			
		
	    driver = initialiseDriver();
		
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
		
		LoginWindow l = new LoginWindow(driver);
		
		l.typeloginbutton();
		l.typeusername();
		l.typepassword();
		l.typelogin();
		
		}
	    
	    @Test
	    
	    public void zas() {
	    	
	    	driver.findElement(By.xpath("//*[@id=\'qsb-keyskill-sugg\']")).sendKeys("java");
	    	
	    	
	    }

}

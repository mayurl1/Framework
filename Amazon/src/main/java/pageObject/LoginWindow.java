package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginWindow {
	
	public WebDriver driver;
	
	By loginbutton = By.id("login_Layer");
	
	By username = By.id("eLoginNew");
	By password = By.id("pLogin");
	By login = By.xpath("//*[@id='lgnFrmNew']/div[9]/button");
	
	public LoginWindow(WebDriver driver) {
		this.driver = driver;
	}
	
	public void typeloginbutton() {
		driver.findElement(loginbutton).click();;
	}
	
	public void typeusername() {
		driver.findElement(username).sendKeys("mayurlokhande25@gmail.com");;
	}
	public void typepassword() {
		driver.findElement(password).sendKeys("mayur@1434");
	}
	public void typelogin() {
		driver.findElement(login).click();
	}
	

}

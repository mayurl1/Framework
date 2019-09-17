package Resources;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initialiseDriver() throws IOException{
		
	prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\Mayur\\eclipse-workspace\\Amazon\\src\\main\\java\\Resources\\data.properties");
	prop.load(fis);
	
	String browsername = prop.getProperty("browser");
	
	if(browsername.equals("chrome")) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayur\\Desktop\\chromedriver.exe");
			
		 driver = new ChromeDriver();
	}
	
	else if (browsername.equals("firefox")) {
		
		 driver = new FirefoxDriver();
		
	}
	else if(browsername.equals("internet explorer")) {
		
		 driver = new InternetExplorerDriver();
		
	}
	return driver;
	
	}
	

}

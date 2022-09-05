package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException, InterruptedException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\KonaTask\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browserName.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Selenium drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		else 
		{
			System.setProperty("webdriver.ie.driver", "C:\\Selenium drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		Thread.sleep(10000);
		
		
		return driver;
		
		
	}
	
}

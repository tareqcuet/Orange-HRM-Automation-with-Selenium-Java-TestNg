package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import resources.Base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DashboardPage {
	
	WebDriver driver;
	
	@FindBy(id="menu_directory_viewDirectory")
	@CacheLookup
	WebElement directoryLink;
	
	@FindBy(id="menu_dashboard_index")
	@CacheLookup
	WebElement dashboardLink;
	
	@FindBy(id="menu_admin_viewAdminModule")
	@CacheLookup
	WebElement adminLink;
	
	@FindBy(id="welcome")
	@CacheLookup
	WebElement welcomeGreet;
	
	@FindBy(linkText="Logout")
	@CacheLookup
	WebElement logout;
	

	public DashboardPage(WebDriver rdriver) {
		// TODO Auto-generated constructor stub
		
		driver=rdriver;
		PageFactory.initElements(rdriver, this);		
		
	}
	

	public void NavigateToDirectoryPage() throws InterruptedException
    {		
	
		Thread.sleep(10000);
      //Click on Directory
        
		directoryLink.click();
    	
    }
	
	
	public void LogoutFromSystem() throws InterruptedException
    {		
	
		Thread.sleep(5000);
      //Click on Directory
		welcomeGreet.click();
		
		Thread.sleep(2000);
        
		logout.click();
    	
    }
	
	public void NavigateToAdminPage() throws InterruptedException
    {		
	
		Thread.sleep(10000);
      //Click on Directory
        
		adminLink.click();
    	
    }

}

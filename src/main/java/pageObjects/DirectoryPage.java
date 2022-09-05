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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import resources.Base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DirectoryPage {
	
	WebDriver driver;
	
	@FindBy(name="searchDirectory[emp_name][empName]")
	@CacheLookup
	WebElement namePosition;
	
	@FindBy(id="searchDirectory_location")
	@CacheLookup
	WebElement locationPosition;
	
	
	@FindBy(id="searchBtn")
	@CacheLookup
	WebElement searchBtn;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/ul[1]/li[1]/b[1]")
	@CacheLookup
	WebElement firstUserPosition;
	
	//@FindBy(linkText="resourcesLink")
	//@CacheLookup
	//WebElement sitesLink;
	
	//@FindBy(linkText="Dashboard")
	//@CacheLookup
	//WebElement requestAccessBtn;
	
	

	public DirectoryPage(WebDriver rdriver) {
		// TODO Auto-generated constructor stub
		
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	

	public String SearchUserOnDirectory() throws InterruptedException
    {		
        
	    Thread.sleep(5000);
      //Click on make a Submission button
        
		namePosition.sendKeys("ch");
		
		Select dropdown= new Select(locationPosition);
		
	    dropdown.selectByVisibleText("United States");

		searchBtn.click();
		
		Thread.sleep(5000);
		
	    String displayedUserName = firstUserPosition.getText();
	    
	    System.out.println(displayedUserName);
	    
	    return displayedUserName;
		
    	
    }
	

}

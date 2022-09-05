package pageObjects;
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



public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(id="txtUsername")
	@CacheLookup
	WebElement userName;
	
	@FindBy(id="txtPassword")
	@CacheLookup
	WebElement password;
	
	@FindBy(id="btnLogin")
	@CacheLookup
	WebElement loginBtn;

	@FindBy(linkText ="Forgot your password?")
	@CacheLookup
	WebElement forgotPassword;
	
	@FindBy(id ="rememberMe")
	@CacheLookup
	WebElement rememberMe;
	


	public LoginPage(WebDriver rdriver) {
		
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	
	}
	

	public void validLogin(String UserName, String Password)
    {
		
		//userName.clear();		
	
    	userName.sendKeys(UserName);
    	
    	password.sendKeys(Password);
    	
    	loginBtn.click();
    	
    }
	
	/*
	public void invalidLogin(String UserName, String Password) throws InterruptedException
    {
        
    	userName.sendKeys(UserName);
    	
    	password.sendKeys(Password);
    	
    	signInBtn.click();
    	
	    Thread.sleep(10000);
	    
	    driver.navigate().back();
	    
	    Thread.sleep(10000);
	    
	    driver.navigate().refresh();
	    
	    Thread.sleep(10000);
    	
    }
*/

}

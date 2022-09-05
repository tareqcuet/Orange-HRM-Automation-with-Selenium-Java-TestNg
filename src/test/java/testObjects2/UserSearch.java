package testObjects2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import pageObjects.DirectoryPage;
import resources.Base;

public class UserSearch extends Base{

	
	public LoginPage loginPage;
	
	public DashboardPage dashboardPage;
	
	public DirectoryPage directoryPage;
		
	
	@BeforeClass	
    public void LoginWithValidUsernamePassword() throws IOException, InterruptedException
    {			
		driver = initializeDriver();
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\KonaTask\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		
		loginPage = new LoginPage(driver);
		
		String userName = prop.getProperty("userName");
		
		String password = prop.getProperty("password");
			
	    loginPage.validLogin(userName, password);
	    
    }
	

	@Test
	public void UserValidationFromDirectory() throws InterruptedException
	{	
		dashboardPage = new DashboardPage(driver);
	    
	    directoryPage = new DirectoryPage(driver);
		
    	dashboardPage.NavigateToDirectoryPage();
		
		String userNameInSearchResult = directoryPage.SearchUserOnDirectory();
				
		Assert.assertTrue(userNameInSearchResult.contains("Charlie Carter") );
		
	}

@AfterClass
	public void logout() throws InterruptedException
	{	
	
		dashboardPage = new DashboardPage(driver);
		
		dashboardPage.LogoutFromSystem();
		
		
	}
	
	
}

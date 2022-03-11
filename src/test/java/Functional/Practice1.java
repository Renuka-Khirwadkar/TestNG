package Functional;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice1 {
	@BeforeTest
	public void openDBConnection() {
		System.out.println("DB is started");
		
	}
	@AfterTest
  public void closeDBConnection() {
	  
	  
	  System.out.println("DB is terminated");
  }
	@BeforeMethod
	public void LaunchBrowser()
	
	{
		
		System.out.println("Brwoser is launched sucessfully");
	}
	
	@Test
	
	public void login() {
		
		
		System.out.println("User is logged in successfully");
	}
	@Test
	public void navigateToexpense() {
		
		System.out.println("Navigate to expense page");
	}
	@AfterMethod
	public void CloseBrowser() {
		
		System.out.println("Browser is closed");
	}
	

}

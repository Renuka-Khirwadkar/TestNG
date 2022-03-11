package Functional;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice3 {
	@Test
	public void reg() {
		
		System.out.println("User registration");
		
	}	
	@Test
	public void driver() {
		
		System.out.println("Intialize driver");
	}

	@Test(dependsOnMethods={"driver","reg"})
	public void login() {
		
		System.out.println("User is logged in");
	}

}

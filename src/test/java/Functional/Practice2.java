package Functional;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Practice2 {
	
	@Test
   public void validateTitle() {
	   
	   String actual_title="gmail.com";
	   String expected_title="gmail.com";
	   //Hard Assertion
	   /*Assert.assertEquals(actual_title, expected_title);
	   
	   Assert.assertTrue(true);
	   
	   Assert.fail("Test is failed");
	   
	   Assert.assertTrue(true);*/
	   
	   //Soft Assertion
	   
	   SoftAssert sa=new SoftAssert();
	   
       sa.assertEquals(actual_title, expected_title);
	   
	   sa.assertTrue(true);
	   
	   //sa.fail("Test is failed");
	   
	   sa.assertTrue(true);
	   sa.assertAll();
	   
	   
   }

}

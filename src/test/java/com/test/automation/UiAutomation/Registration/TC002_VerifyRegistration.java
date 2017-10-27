package com.test.automation.UiAutomation.Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.automation.UiAutomation.UiActions.HomePage;
import com.test.automation.UiAutomation.UiActions.User;
import com.test.automation.UiAutomation.testBase.TestBase;

import junit.framework.Assert;

public class TC002_VerifyRegistration extends TestBase {
	
	HomePage hompage, hompage1;
	
	String emailadd="love19@malinator.com";
	String firstname1="love";
	String lname1 ="arora";
	String Passwd1="test123";
	String Address1="mumbai";
	String city1="ub";
	String id_state="California";
	String zip1="94089";
	String phone1="9810098100";
	String alias1="love";
	
	
	
	
	
	@BeforeClass
	public void setup() {
		init();
		
	}
	
	@Test
	public void testlogin() {
		hompage= new HomePage(driver);
		User user2 = User.getUser();
		hompage.registerUser(emailadd, firstname1, lname1, Passwd1, Address1, city1, id_state, zip1, phone1, alias1);
		//hompage.registerUser("nacy@gmai.com", firstname1, lname1, Passwd1, Address1, city1, id_state, zip1, phone1, alias1);
		//hompage1= new HomePage(driver);
		hompage.successregister();
		//Assert.assertEquals(user2.getFirstname1(), );
	    Assert.assertEquals(false, hompage.myaccount());
		
		
	}
	
	
	@AfterClass
	public void endtest() {
	//driver.close();
		
		
	}
	

}

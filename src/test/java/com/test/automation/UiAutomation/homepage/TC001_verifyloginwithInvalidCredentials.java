package com.test.automation.UiAutomation.homepage;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver; we dont need this as this is in testbase class
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.UiAutomation.UiActions.HomePage;
import com.test.automation.UiAutomation.testBase.TestBase;

import junit.framework.Assert;
// testbase is the parent class so we are going to extend that class here
public class TC001_verifyloginwithInvalidCredentials extends TestBase {
	
	public static final Logger log = Logger.getLogger(TC001_verifyloginwithInvalidCredentials.class.getName());
	
	//WebDriver driver; // I will make the reference of WebDriver. WebDriver is interface so i am making the 
	                  // referncec of interface as we cant create an object for interface
	/* Note :- after extenting the testbase class as we are using the inheritence so we dont need this bceaseu in 
	the testbase class we have already made the reference*/
	
	HomePage homepage; // make a reference here homepage
	
	@BeforeTest
	public void setup() {
		init();

		
		
		//for mac OS
		//System.setProperty("webdriver.gecko.marionetter",System.getProperty("user.dir") + "/Users/ankurgupta/Desktop/geckodriver");
		    /*user.dir - it will give you the location of the project irrespective of project. 
		    whether it is in c drive d or anywhere but it wil give your the location*/
		/*System.setProperty( key, value) - set the property of gecko driver in mac*/
		
		//--------------------****************----------------------------
		//ReferTestbase.java - created method to avoid this
		/*System.setProperty("webdriver.gecko.driver","/Users/ankurgupta/Desktop/drivers1/geckodriver");
		driver= new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		*/
		
	}
	
	@Test
	public void verifyloginwithInvalidCredentials() {
		
		/*driver.findElement(By.xpath("html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/input")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/span/input")).sendKeys("test123");
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button")).click();
	   // Assert.assertEquals(driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div[1]/ol/li")).getText(), "Authentication failed");
	    //Assert.assertEquals("Authentication failed", "Authentication failed");
	     String text = driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div[1]/ol/li")).getText(); 
		  Assert.assertEquals(text, "Authentication failed.");// Assert equals to verify the actual and exepected text 
*/	
		
	//--------------------------------------------------*************-----------------------
	/*after creating the homepage and method there in main/java we dont we need the above script commented 
	as we are converting this to a framework*/
		
		/*homepage = new HomePage(driver);// create an object of HomePage class in verifytestcase
		Why we are supplying driver here beascue if you go to the homepage class, 
		this homepage has a constructor which takes an argument Webdriver=driver. 
		In the pagefactory approach you need to initialize the webelement on the 
		runtime. initElements in page factory will intialize all your web element by supplying 
		the driver object and this - this is nothing but current class object*/
     
		
		
		log.info("starting test with invalid credential");
		homepage = new HomePage(driver);// create an object of HomePage class
		homepage.logintoapp("test@gmail.com", "test123");
        //String text = driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div[1]/ol/li")).getText(); // this script is still hardcoded so we will crete a method of this in HomePage
	   	//Assert.assertEquals(text, "Authentication failed.");// Assert equals to verify the actual and exepected text 
	      //insted of above 2 line i will use the method getinvalidlogintext
		Assert.assertEquals(homepage.getInvalidLoginText(), "Authentication failed.");
		log.info("ending test with invalid credential");
	}
	

	@AfterTest
	public void endtest() {
		driver.close();
		
		
	}
}

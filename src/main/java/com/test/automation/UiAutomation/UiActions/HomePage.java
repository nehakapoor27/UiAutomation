package com.test.automation.UiAutomation.UiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.test.automation.UiAutomation.homepage.TC001_verifyloginwithInvalidCredentials;

public class HomePage {
	public static final Logger log = Logger.getLogger(HomePage.class.getName());
	
	WebDriver driver;
	
	@FindBy(xpath="html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a")
	WebElement signIn;
	
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/input")
	WebElement loginEmailAddress;
	
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/span/input")
	WebElement Password;
	
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button")
	WebElement submitbtn;
	
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div[1]/ol/li")
	WebElement authenticationfailed;
	// now all the objects are ready
	
	//*****************************************TC002VerifyRegistration***************
	
 
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/div[1]/form/div/div[2]/input")
	WebElement webElemEmail;
	
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/div[1]/form/div/div[3]/button")
	WebElement Webcreate;
	
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[2]/input")
	WebElement firstname;
	
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[3]/input")
	WebElement lname;
	
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[5]/input")
	WebElement Passwd;
	
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[4]/input")
	WebElement Address;
	
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[6]/input")
	WebElement city;
	
	@FindBy(id="id_state")
	WebElement state;
	
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[8]/input")
	WebElement zip;
	
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[13]/input")
	WebElement mble;
	
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[14]/input")
	WebElement alias;
	
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/form/div[4]/button")
	WebElement register;
	
	@FindBy(xpath="html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a/span")
	WebElement success;
	
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[1]/span[2]")
	WebElement myaccount;
	
	
	
	
	
	
	
	
	

	
	/*1. since this is pagefactory we need to create constructor of the class, 
	this construction will take an argument called "WebDriver driver and 
	2. WebElement is the return type of findelement by() so we need to intialise this by PageFactory.initElements(driver, this)
       the second argument we provide "this" beacuse it refer to the current class object
*/	
	public HomePage(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver1, this);
		
	}
	
	 

	public void logintoapp(String emailaddress, String password) // parameterised method
	{
		signIn.click();
		/*Call the method of webelement so "password", "signin" is 
		also a webelement so we can all the method of webelement with signin*/
		
		log.info("clicked on signin and object is" + signIn.toString()); 
		/*//signIn.toString() means it will print the object also on runtime, on which 
		object youare clicking*/
		
		log.info("entered email address"+ emailaddress +"object is" +loginEmailAddress.toString() );
		
	
		loginEmailAddress.sendKeys(emailaddress);
		
		log.info("entered password" + password + "objec is" + Password.toString());
		Password.sendKeys(password);
		
		submitbtn.click();
		//we should not write any assertions in (page action) here in actions, it will not work for negetive/ positive scenario
		//assertions we will put in the test script
		log.info("clicksubmitbtn" + submitbtn.toString());
		
}
	
	public String getInvalidLoginText() {
		
		//this method will return the text of authenticationfailed object
		log.info("loginfailed" + authenticationfailed.getText());
		return authenticationfailed.getText();
		
	}
	
	
	public void registerUser(String emailadd,String firstname1,String lname1,String Passwd1,String Address1,String city1, String id_state, String zip1, String phone1, String alias1) {
		
		log.info("entered email address" + emailadd.toString() );
		this.webElemEmail.sendKeys(emailadd);
		log.info("clicked" + Webcreate.toString() );
		Webcreate.click();
		log.info("firstname" + firstname.toString());
		firstname.sendKeys(firstname1);
		log.info("lastname" + lname1.toString());
		this.lname.sendKeys(lname1);
		this.Passwd.sendKeys(Passwd1);
		this.Address.sendKeys("Address1");
		this.city.sendKeys("city1");
		Select statusdrp= new Select(state);
		statusdrp.selectByVisibleText(id_state);
		zip.sendKeys("zip1");
		mble.sendKeys("phone1");
		alias.sendKeys("alias1");
		register.click();
	}
	
	public String successregister() {
		log.info("registration msg is" + success.getText());
		return success.getText();
	}
	
	public boolean myaccount() {
		log.info("testing after succefuly signin"+ myaccount.getText());
		try {
			myaccount.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return false;
		}	
	}
	
	
	

}

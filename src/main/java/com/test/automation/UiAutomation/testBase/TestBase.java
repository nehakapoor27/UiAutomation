package com.test.automation.UiAutomation.testBase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*1. Testbase java class which is very important. this is the parent class of all the classes
where you will have all the resuable methods, all required configration which you
require for your project and common functionaly which every script require

2. every script will require to create object of the browser and navigate to the URL
 so create 2 method here
*/

public class TestBase {
	
	public static final Logger log = Logger.getLogger(TestBase.class.getName());
	/*//make this variable as public, static - means no need to create an object, final- no need to change
	Logger is the class type and i am saying logger.getlooger for the class testbase. 
	TestBase.class.getName() this is will give your the name of the class*/
	
	// in going forward these below 3 line we are going to convert into property
	// file

	
	public WebDriver driver;
	//String url = "http://automationpractice.com/index.php";
	String url= "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	String browser = "chrome";

	public void init()// the below 2 methods i have combine here and calling from this method
	{
		selectbrowser(browser);
		getUrl(url);
		String log4jConfPath= "log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		
		/*//Once we have log4j property configured then we need to register this log4j 
		then only we can benefit from this log4j by above method 
		PropertyConfigurator is a class given by Apache and congfigur is a method which take argument
		*/


	}
	


	public void selectbrowser(String browser1) {
		if (browser1.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/ankurgupta/Desktop/drivers1/geckodriver");
			log.info("creating object of the" + browser1);
			driver = new FirefoxDriver(); // create the object of the firefox
		}
		
		else if (browser1.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/ankurgupta/Desktop/drivers1/chromedriver");
			driver = new ChromeDriver();
		}
	}

	public void getUrl(String Url) {
		log.info("navigating to"+ Url);
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		/*
		 * i am giving max wait of 60 seconds to load any page. whenever we navigate it
		 * take sometime to load the page I am saying that dont give timeout and wait
		 * for 60 seconds till the page get loaded when we say page loaded means every
		 * element of the page should be loaded and if it will not load with in 60
		 * second so will get pagetimeout. maximum time is 60 seconds if this loads in
		 * 60 second then script will not wait for 60 second it will continue after 10
		 * seconds
		 */

	}
}

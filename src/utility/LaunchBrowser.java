
package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import appModules.Login;
import pageObjects.LoginPage;


public class LaunchBrowser {

	//public static Properties propGet ;
	
	public static WebDriver execute(WebDriver driver, ExtentReports report){
		
		 //report = new ExtentReports("D:\\incture\\AutomationFramWork\\ExtendReports\\"+Constants.reportName+ ".html");
		ExtentTest logger = report.startTest("Launch Browser");
		//ExtentTest logger = report.startTest("Launch Browser");
		
		System.setProperty("webdriver.chrome.driver", "./usr/bin/chromedriver");
		driver = new ChromeDriver();
		logger.log(LogStatus.INFO, "Driver intiantiated");

		driver.get(Constants.URL);
		driver.manage().window().maximize();
		logger.log(LogStatus.INFO, "Maximize the browser and Open the application");
		
		Boolean results =  LoginPage.txt_UserName(driver).isEnabled();
		PlugInFunctions.errorHandling(driver, results, logger, "Portal Launch");

		report.endTest(logger);
		report.flush();
		
		return driver;
		
	}
}
=======
<<<<<<< HEAD
package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import appModules.Login;
import pageObjects.LoginPage;


public class LaunchBrowser {

	//public static Properties propGet ;
	
	public static WebDriver execute(WebDriver driver, ExtentReports report){
		
		 //report = new ExtentReports("D:\\incture\\AutomationFramWork\\ExtendReports\\"+Constants.reportName+ ".html");
		ExtentTest logger = report.startTest("Launch Browser");
		//ExtentTest logger = report.startTest("Launch Browser");
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver = new ChromeDriver();
		logger.log(LogStatus.INFO, "Driver intiantiated");

		driver.get(Constants.URL);
		driver.manage().window().maximize();
		logger.log(LogStatus.INFO, "Maximize the browser and Open the application");
		
		Boolean results =  LoginPage.txt_UserName(driver).isEnabled();
		PlugInFunctions.errorHandling(driver, results, logger, "Portal Launch");

		report.endTest(logger);
		report.flush();
		
		return driver;
		
	}
}
=======
package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import appModules.Login;
import pageObjects.LoginPage;


public class LaunchBrowser {

	//public static Properties propGet ;
	
	public static WebDriver execute(WebDriver driver, ExtentReports report){
		
		 //report = new ExtentReports("D:\\incture\\AutomationFramWork\\ExtendReports\\"+Constants.reportName+ ".html");
		ExtentTest logger = report.startTest("Launch Browser");
		//ExtentTest logger = report.startTest("Launch Browser");
		
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		driver = new ChromeDriver();
		logger.log(LogStatus.INFO, "Driver intiantiated");

		driver.get(Constants.URL);
		driver.manage().window().maximize();
		logger.log(LogStatus.INFO, "Maximize the browser and Open the application");
		
		Boolean results =  LoginPage.txt_UserName(driver).isEnabled();
		PlugInFunctions.errorHandling(driver, results, logger, "Portal Launch");

		report.endTest(logger);
		report.flush();
		
		return driver;
		
	}
}
>>>>>>> 9d1073435435507aa9ee18f5cc972c1c9ac2ac10
>>>>>>> e5f3ff258429eb1b0852a926ac623493270abf2b

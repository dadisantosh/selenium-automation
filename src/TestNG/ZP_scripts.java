package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

import appModules.Login;
import pageObjects.CreateReferenced;
import pageObjects.LoginPage;
import utility.Constants;
import utility.ExcelUtils;
import utility.LaunchBrowser;
import utility.PlugInFunctions;

public class ZP_scripts {
	
	ExtentReports report = PlugInFunctions.reportGeneration(); 
	WebDriver driver;
	@BeforeClass
	public void before() throws Exception
	{
		System.out.println("before");
		ExcelUtils.setExcelFile(Constants.xcelPath+"TestData.xlsx", "Sheet1");
		driver=LaunchBrowser.execute(driver, report); 
		System.out.println("browser launched");
	}
	/*@Test(priority=1)
	public void testcase1() throws InterruptedException
	{
		Login.RequesterLogin(driver, report);
	}
	@Test(priority=2)
	public void testcase2()
	{
	Login.RequesterinvalidLogin(driver, report);
	}
	@Test(priority=3)
	public void testcase3()
	{
		Login.emptyLogin(driver, report);
	}
	
	@Test(priority=4)
	public void testcase4() throws InterruptedException
	{
		Login.ZPapproverLogin(driver, report);
	}
	@Test(priority=5)
	public void testcase5() throws InterruptedException
	{
		Login.PrincipalapproverLogin(driver, report);
	}*/
	@Test(priority=6)
	public void testcase6() throws Exception
	{
		Login.RequesterLogin(driver, report);
		LoginPage.btn_create_return(driver).click();
		CreateReferenced.CustomerCode(driver).sendKeys(ExcelUtils.getCellData(1, 0));
		CreateReferenced.BtnSearch(driver).click();

	}
	@AfterMethod
	public void after()
	{
		Login.Logout(driver, report);
	}

}

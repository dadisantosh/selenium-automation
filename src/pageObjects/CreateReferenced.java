package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.PlugInFunctions;

public class CreateReferenced {
	private static WebElement element;
	public static WebElement CustomerCode(WebDriver driver) {
		element = PlugInFunctions.expWait(driver, PlugInFunctions.loadXPathfile().getProperty("customer_code"));
		return element;
	}
	public static WebElement BtnSearch(WebDriver driver) {
		element = PlugInFunctions.expWait(driver, PlugInFunctions.loadXPathfile().getProperty("btn_search_create_referenced"));
		return element;
	}

}

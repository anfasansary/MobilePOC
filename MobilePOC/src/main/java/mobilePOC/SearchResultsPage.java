package mobilePOC;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import wrapper.MobilePOCWrappers;

public class SearchResultsPage extends MobilePOCWrappers{

	public SearchResultsPage(AndroidDriver<?> driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
	}
	
	public SearchResultsPage findProductAndClick(String productTitle) {
		
		
		return this;
	}
}
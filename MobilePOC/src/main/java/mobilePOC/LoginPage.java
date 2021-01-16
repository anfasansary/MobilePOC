package mobilePOC;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import wrapper.MobilePOCWrappers;

public class LoginPage extends MobilePOCWrappers{
	public LoginPage(AndroidDriver<?> driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
	}
	
	public LoginPage installEbayApp(){
		verifyAndInstallApp();
		return this;
	}

	public LoginPage launchEbayApp(String deviceName, String version){
		launchApp(deviceName, version);	
		switchview();
		return this;
	}
	
	public LoginPage alreadyCustomerButtonClick(){
		clickByID(prop.getProperty("LoginPage.AlreadyCustomer.Id"));
		return this;
	}

	public LoginPage enterUserName(String email){
		enterTextByID(prop.getProperty("LoginPage.Email.Id"),email);
		return this;
	}
	
	public LoginPage clickContinueButton(){
		clickByID(prop.getProperty("LoginPage.Continue.Id"));
		return this;
	}

	public LoginPage enterPassword(String password){
		enterTextByID(prop.getProperty("LoginPage.Password.Id"), password);
		return this;
	}

	public HomePage clickLogin(){
		clickByID(prop.getProperty("LoginPage.Signin.Id"));
		return new HomePage(driver, test);
	}
}

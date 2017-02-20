package com.noon.mobileapp;

import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.noon.mobileapp.base.BaseTest;
import com.noon.mobileapp.pages.SigninPage;
import com.noon.mobileapp.util.DataUtil;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SigninTest extends BaseTest {
	
String testName="SigninTest";
	
	//@Test(dataProvider="getData")
	@Test
	//public void loginTest(Hashtable<String,String> data) throws InterruptedException {
	public void loginTest() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Starting the Sign in test");
		/*if(!DataUtil.isExecutable(xls,testName)|| data.get("Runmode").equals("N")) {
					test.log(LogStatus.SKIP, "Skipping the test as Runmode was NO");
					throw new SkipException("Skipping the test as Runmode was NO");
				}*/
		launchApp();
		allowAppPermission();
		test.log(LogStatus.INFO, "App Launch successfully");
		
		SigninPage signinPage = new SigninPage(aDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),signinPage);
		
		//String userName = data.get("userName");
		//String password = data.get("userPassword");
		String userName = "noontesting2+11@gmail.com";
		String password = "1200@Villa";
		
		signinPage.signinWithEmail(userName,password);
		//execute
		
		//test.log(LogStatus.PASS, "Test Passed");
	}
	
	/*@DataProvider
	public Object[][] getData() {
		return DataUtil.getData(testName, xls);
	}*/
}

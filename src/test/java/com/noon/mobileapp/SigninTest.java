package com.noon.mobileapp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.noon.mobileapp.base.BaseTest;
import com.noon.mobileapp.pages.SigninPage;
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
		String userName = "testnoon10@gmail.com";
		String password = "Test1234";
		
		signinPage.signinWithEmail(userName,password);
		signinPage.verifyLogin();
//		signinPage.logout();

		
		//test.log(LogStatus.PASS, "Test Passed");
	}

    @Test
    //public void loginTest(Hashtable<String,String> data) throws InterruptedException {
    public void loginPhoneTest() throws InterruptedException {
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

        String userName = "+971529961453";
        String password = "Password1";


        signinPage.signinWithEmail(userName,password);
        signinPage.verifyLogin();
//		signinPage.logout();


        //test.log(LogStatus.PASS, "Test Passed");
    }

	@Test
	//public void loginTest(Hashtable<String,String> data) throws InterruptedException {
	public void logoutTest() throws InterruptedException {
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
		String userName = "testnoon10@gmail.com";
		String password = "Test1234";

		signinPage.signinWithEmail(userName,password);
//		signinPage.verifyLogin();
		signinPage.logout();


		//test.log(LogStatus.PASS, "Test Passed");
	}
	
	/*@DataProvider
	public Object[][] getData() {
		return DataUtil.getData(testName, xls);
	}*/
}

package com.noon.mobileapp;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.w3c.dom.Node;

import com.noon.mobileapp.base.BaseTest;
import com.noon.mobileapp.pages.HomePage;
import com.noon.mobileapp.util.DataUtil;
import com.noon.mobileapp.util.NConstants;
import com.noon.mobileapp.util.Xls_Reader;
import com.relevantcodes.extentreports.LogStatus;


public class SideBarMenuTest extends BaseTest {
	String testName="SideBarMenuTest";
	
	@Test
	public void sideBarMenuTest() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Starting SideBarMenu test");
		if(!DataUtil.isExecutable(xls,testName)) {
					test.log(LogStatus.SKIP, "Skipping the test as Runmode was NO");
					throw new SkipException("Skipping the test as Runmode was NO");
		}
		
		launchApp();
		test.log(LogStatus.INFO, "Apps Launched successfully");
		
		HomePage homePage = new HomePage(aDriver, test);
		Node baseNode = homePage.initXML();
		homePage.verifyChildValues(baseNode);
		//execute
		test.log(LogStatus.PASS, "Test Passed");
	}
}

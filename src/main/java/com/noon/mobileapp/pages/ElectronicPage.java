package com.noon.mobileapp.pages;

import com.noon.mobileapp.base.BasePage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ElectronicPage extends BasePage {
	
	public ElectronicPage(AndroidDriver<AndroidElement> aDriver, ExtentTest test) {
		super(aDriver,test);
	}
	
	public void applyFilter() {
		test.log(LogStatus.INFO, "Applying filter by");
		
		test.log(LogStatus.INFO, "Applied filter by successfully");
	}
}

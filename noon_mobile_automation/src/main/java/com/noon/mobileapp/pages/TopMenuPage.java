package com.noon.mobileapp.pages;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
//It is encapsulated class inside all pages object contain another object
public class TopMenuPage {
	public AndroidDriver<AndroidElement> aDriver;
	public ExtentTest test;
	
	public TopMenuPage(AndroidDriver<AndroidElement> aDriver, ExtentTest test) {
		this.aDriver = aDriver;
		this.test = test;
	}

	public void gotoCart() {
		
	}
	
	public void search() {
		
	}
	
}

package com.noon.mobileapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noon.mobileapp.base.BasePage;
import com.noon.mobileapp.util.NConstants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends BasePage {
	AndroidDriver<AndroidElement> aDriver;
	ExtentTest test;
	
	@FindBy(xpath=NConstants.NAVIGATION_MENU_IMAGE)
	public AndroidElement navigationMenuImage;
	
	public HomePage(AndroidDriver<AndroidElement> aDriver, ExtentTest test) {
		super(aDriver,test);
	}
	
	public Object selectFromNavigationMenu() {
		test.log(LogStatus.INFO, "Selecteding from navigation menu");
		navigationMenuImage.click();
		
		aDriver.findElement(By.xpath(NConstants.SHOP_CATEGORY)).click();
		aDriver.findElement(By.xpath(NConstants.ELECTRONIC_LINK)).click();
		test.log(LogStatus.INFO, "Selected item successfully from menu");
		
		//Decision has to be made what we want to return as display
		if(aDriver.findElements(By.xpath(NConstants.ELECTRONIC_TEXT)).size()!=0) {
			//we are Electronics & Appliances display page
			ElectronicPage electronicPage = new ElectronicPage(aDriver,test);
			PageFactory.initElements(new AppiumFieldDecorator(aDriver), electronicPage);
			return electronicPage;
		}
		/*else if(aDriver.findElements(By.xpath(NoonConstants.ENTERTAINMENT_TEXT)).size()!=0) {
		//we are Entertainment & Leisure display page
		//return new EntertainmentPage();	
		}*/
		return null;
	}
	
	public void gotoCart() {
		
	}
	
}

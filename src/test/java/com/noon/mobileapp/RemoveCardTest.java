package com.noon.mobileapp;

import com.noon.mobileapp.base.BaseTest;
import com.noon.mobileapp.pages.MyWalletPage;
import com.noon.mobileapp.pages.SideMenuPage;
import com.noon.mobileapp.pages.SigninPage;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RemoveCardTest extends BaseTest {
	
String testName="RemoveCardTest";

	@Test
	public void removeCardTest() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Starting remove card test");

		launchApp();
		allowAppPermission();
		test.log(LogStatus.INFO, "App Launch successfully");
		
		SigninPage signinPage = new SigninPage(aDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),signinPage);

		SideMenuPage menuPage = new SideMenuPage(aDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),menuPage);

		MyWalletPage walletPage = new MyWalletPage(aDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),walletPage);

		String userName = "testnoon10@gmail.com";
		String password = "Test1234";
		
		signinPage.signinWithEmail(userName,password);
		menuPage.goToMenuPage();
		menuPage.goToMyAccountPage();
		menuPage.goToMyWallet();
		walletPage.waitForPageToLoad();
		walletPage.goToSavedCards();
		walletPage.removeLastCard();
		walletPage.waitForPageToLoad();

		test.log(LogStatus.PASS, "Test Passed");
	}
}

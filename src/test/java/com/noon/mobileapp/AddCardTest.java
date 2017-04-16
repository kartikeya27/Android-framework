package com.noon.mobileapp;

import com.noon.mobileapp.base.BaseTest;
import com.noon.mobileapp.pages.AddCardPage;
import com.noon.mobileapp.pages.MyWalletPage;
import com.noon.mobileapp.pages.SideMenuPage;
import com.noon.mobileapp.pages.SigninPage;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AddCardTest extends BaseTest {
	
String testName="AddNewCardTest";

	@Test
	public void addNewCardTest() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Starting add new card test");

		String userName = "testnoon10@gmail.com";
		String password = "Test1234";
		launchApp();
		allowAppPermission();
		test.log(LogStatus.INFO, "App Launch successfully");
		
		SigninPage signinPage = new SigninPage(aDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),signinPage);

		SideMenuPage menuPage = new SideMenuPage(aDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),menuPage);

		MyWalletPage walletPage = new MyWalletPage(aDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),walletPage);

		AddCardPage addCardPage = new AddCardPage(aDriver, test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),addCardPage);


		
		signinPage.signinWithEmail(userName,password);
		menuPage.goToMenuPage();
		menuPage.goToMyAccountPage();
		menuPage.goToMyWallet();
		walletPage.waitForPageToLoad();
		walletPage.goToSavedCards();
		walletPage.goToAddNewCard();

		addCardPage.addNewCardData("Antanina","4573770040715945","2020","12", false);
		walletPage.waitForPageToLoad();

		test.log(LogStatus.PASS, "Test Passed");
	}
}

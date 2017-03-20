package com.noon.mobileapp;

import com.noon.mobileapp.base.BaseTest;
import com.noon.mobileapp.pages.*;
import com.noon.mobileapp.util.NConstants;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CategoriesTest extends BaseTest {
	
String testName="CategoriesTest";
	
	//@Test(dataProvider="getData")
	@Test
	//public void loginTest(Hashtable<String,String> data) throws InterruptedException {
	public void categoriesTest() throws InterruptedException {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Starting the Categories in test");

		launchApp();
		allowAppPermission();
		test.log(LogStatus.INFO, "App Launch successfully");
		
		SigninPage signinPage = new SigninPage(aDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),signinPage);

		CategoriesPage categoriesPage = new CategoriesPage(aDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),categoriesPage);

		SideMenuPage menuPage = new SideMenuPage(aDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver),menuPage);

//		String userName = "testnoon10@gmail.com";
//		String password = "Test1234";
//		signinPage.signinWithEmail(userName,password);


        menuPage.goToMenuPage();
        menuPage.goToShopByCategoriesPage();
        categoriesPage.verifyMenuMainCategories();

		test.log(LogStatus.PASS, "Test Passed");
	}

    @Test
    public void mainCategoriesTest() throws InterruptedException {
        test = rep.startTest("Main Categories Test");
        test.log(LogStatus.INFO, "Starting the Main Categories test");

        launchApp();
        allowAppPermission();
        test.log(LogStatus.INFO, "App Launch successfully");

        SigninPage signinPage = new SigninPage(aDriver,test);
        PageFactory.initElements(new AppiumFieldDecorator(aDriver),signinPage);

        CategoriesPage categoriesPage = new CategoriesPage(aDriver,test);
        PageFactory.initElements(new AppiumFieldDecorator(aDriver),categoriesPage);

        SideMenuPage menuPage = new SideMenuPage(aDriver,test);
        PageFactory.initElements(new AppiumFieldDecorator(aDriver),menuPage);

        FashionPage fashionPage = new FashionPage(aDriver,test);
        PageFactory.initElements(new AppiumFieldDecorator(aDriver),fashionPage);

        TopMenuPage topmenuPage = new TopMenuPage(aDriver,test);
        PageFactory.initElements(new AppiumFieldDecorator(aDriver),topmenuPage);

        ElectronicsPage electronicsPage = new ElectronicsPage(aDriver,test);
        PageFactory.initElements(new AppiumFieldDecorator(aDriver),electronicsPage);

        ToysPage toysPage = new ToysPage(aDriver,test);
        PageFactory.initElements(new AppiumFieldDecorator(aDriver),toysPage);

        BabyPage babyPage = new BabyPage(aDriver,test);
        PageFactory.initElements(new AppiumFieldDecorator(aDriver),babyPage);

        BooksPage booksPage = new BooksPage(aDriver,test);
        PageFactory.initElements(new AppiumFieldDecorator(aDriver),booksPage);

        HealthPage healthPage = new HealthPage(aDriver,test);
        PageFactory.initElements(new AppiumFieldDecorator(aDriver),healthPage);

        HomeCategoryPage homeCatPage = new HomeCategoryPage(aDriver,test);
        PageFactory.initElements(new AppiumFieldDecorator(aDriver),homeCatPage);

        SportsCategoryPage sportsCatPage = new SportsCategoryPage(aDriver,test);
        PageFactory.initElements(new AppiumFieldDecorator(aDriver),sportsCatPage);

//        String userName = "testnoon10@gmail.com";
//        String password = "Test1234";
//        signinPage.signinWithEmail(userName,password);

        menuPage.goToMenuPage();
        menuPage.goToShopByCategoriesPage();
        categoriesPage.goToCategoryPage(NConstants.FASHION_CAT_LINK);
        fashionPage.verifyFashionCategoryPage();
        topmenuPage.goBack();

        categoriesPage.goToCategoryPage(NConstants.ELECTRONICS_CAT_LINK);
        electronicsPage.verifyElectronicsCategoryPage();
        topmenuPage.goBack();

        categoriesPage.goToCategoryPage(NConstants.TOYS_CAT_LINK);
        toysPage.verifyToysCategoryPage();
        topmenuPage.goBack();

       categoriesPage.goToCategoryPage(NConstants.BABY_CAT_LINK);
       babyPage.verifyBabyCategoryPage();
       topmenuPage.goBack();

       categoriesPage.goToCategoryPage(NConstants.BOOKS_CAT_LINK);
       booksPage.verifyBooksCategoryPage();
       topmenuPage.goBack();

       categoriesPage.goToCategoryPage(NConstants.HEALTH_CAT_LINK);
       healthPage.verifyHealthCategoryPage();
       topmenuPage.goBack();

       categoriesPage.goToCategoryPage(NConstants.HOME_CAT_LINK);
       homeCatPage.verifyHomeCategoryPage();
       topmenuPage.goBack();


//       categoriesPage.goToCategoryPage(NConstants.SPORTS_CAT_LINK);
//       sportsCatPage.verifySportsCategoryPage();
//       topmenuPage.goBack();

        test.log(LogStatus.PASS, "Test Passed");
    }

}

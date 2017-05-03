package com.noon.mobileapp.base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import com.noon.mobileapp.util.ExtentManager;
import com.noon.mobileapp.util.NConstants;
import com.noon.mobileapp.util.Xls_Reader;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import services.CheckoutService;
import services.AddressService;
import services.CheckoutService;

public class BaseTest {
	
	public WebDriver driver;
	public AndroidDriver<AndroidElement> aDriver;
	public ExtentReports rep = ExtentManager.getInstance();
	public ExtentTest test;
	public Xls_Reader xls = new Xls_Reader(NConstants.XLS_PATH);
	
	public void launchApp() throws InterruptedException {
		File app = new File(NConstants.APK_PATH);
		//
		
		//real device settings on local system
		DesiredCapabilities caps = DesiredCapabilities.android();
		caps.setCapability("appiumVersion",NConstants.APPIUM_VERSION);
		//caps.setCapability("AVD_NAME", NConstants.AVD_NAME);
		caps.setCapability("deviceName",NConstants.DEVICE_NAME);
		caps.setCapability("deviceOrientation", NConstants.DEVICE_ORIENTATION);
		//cap.setCapability("browserName", NConstants.BROWSER_NAME);
		caps.setCapability("platformVersion",NConstants.PLATFORM_VERSION);
		caps.setCapability("platformName",NConstants.PLATFORM_NAME);
		caps.setCapability(AndroidMobileCapabilityType.AVD_LAUNCH_TIMEOUT,500000);
		caps.setCapability("fullReset","false");
        caps.setCapability("locationServicesAuthorized", true);

		caps.setCapability("app", app.getAbsolutePath());
		
		//sauce labs android emulator settings
		/*DesiredCapabilities caps = DesiredCapabilities.android();
		caps.setCapability("appiumVersion",NConstants.APPIUM_VERSION);
		caps.setCapability("deviceName",NConstants.DEVICE_NAME);
		caps.setCapability("deviceOrientation",NConstants.DEVICE_ORIENTATION);
		caps.setCapability("browserName", NConstants.BROWSER_NAME);
		caps.setCapability("platformVersion", NConstants.PLATFORM_VERSION);
		caps.setCapability("platformName", NConstants.PLATFORM_NAME);
		caps.setCapability("app", "sauce-storage:app-staging-debug.apk.zip");*/
		
		try {
			test.log(LogStatus.INFO, "Launching app");
			driver = new AndroidDriver<AndroidElement>(new URL(NConstants.HUB_URL),caps);
			//driver = new AndroidDriver<AndroidElement>(new URL(NConstants.HUB_URL),caps);
			aDriver = (AndroidDriver<AndroidElement>)driver;

		} catch (MalformedURLException e) {
			test.log(LogStatus.FAIL, "Application did not launch" + e.getMessage());
			e.printStackTrace();
			Assert.fail("Applicationd did not launch"+ e.getMessage());
		}
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//Thread.sleep(500);
	}
	


    public void allowAppPermission(){

	    try{

            WebDriverWait wait = new WebDriverWait(aDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='android.widget.Button'][2]")));
            aDriver.findElement(By.xpath("//*[@class='android.widget.Button'][2]")).click();
            test.log(LogStatus.INFO, "App permissions popup displayed");

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='android.widget.Button'][2]")));
            aDriver.findElement(By.xpath("//*[@class='android.widget.Button'][2]")).click();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='android.widget.Button'][2]")));
			aDriver.findElement(By.xpath("//*[@class='android.widget.Button'][2]")).click();

            test.log(LogStatus.INFO, "App permissions popup displayed");

        }catch(Exception e){
            test.log(LogStatus.INFO, "App permissions popup did not occur");
        }

    }

	public void allowAppPermissionOne(){

		try{

			WebDriverWait wait = new WebDriverWait(aDriver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='android.widget.Button'][2]")));
			aDriver.findElement(By.xpath("//*[@class='android.widget.Button'][2]")).click();
			test.log(LogStatus.INFO, "App permissions popup displayed");

		}catch(Exception e){
			test.log(LogStatus.INFO, "App permissions popup did not occur");
		}

	}

    public void emptyCart(String login, String password){
    	CheckoutService cs = new CheckoutService();
    	cs.emptyCart(login,password);
	}

	public void deleteAllAddresses(String login, String password){
        AddressService addressService = new AddressService();
        addressService.deleteAllAddresses(login,password);
    }

    public void addDefaultAddress(String login, String password){
        AddressService addressService = new AddressService();

        String type = "home";
        String user_title = "";
        String user_name = "Noontest";
        String zip_code = "";
        String company_name = "";
        String mobile_number = "+971588989160";
        String apartment_number = "1";
        String floor_number = "0";
        String building_name = "Emaar Square Bldg 3";
        String street_name = "Al Sa'ada Street";
        String area_name = "Downtown Dubai";
        String landmark = "Emaar Square";
        String city = "Dubai";
        String country = "AE";
        String address_name = "";
        String gps_lat = "25.233758";
        String gps_long = "55.362766";
        boolean is_default = true;
        boolean deliverable = true;


        jsonobjects.Address address = new jsonobjects.Address(type, user_title, user_name, zip_code, company_name, mobile_number, apartment_number, floor_number, building_name, street_name, area_name, landmark, city, country, address_name, gps_lat, gps_long, is_default, deliverable);

        String addId = addressService.addAddress(address,login,password);
    }

    public void addTestProductToCart(String login, String password){
        CheckoutService checkoutService = new CheckoutService();
        checkoutService.addTestItemToCart(login,password);
    }


    public void quit() {
        if(rep != null) {
            rep.endTest(test);
            rep.flush();
        }
        if(driver != null) {
            driver.quit();
        }
    }

	@BeforeMethod

	public void beforeMethod() {

//		System.out.println("Started Method");

	}

	@AfterMethod
	public void afterMethod() {
        quit();
//		System.out.println("Finished Method");

	}

	@BeforeClass

	public void beforeClass() {

//		System.out.println("Started Class");

	}

	@AfterClass

	public void afterClass() {

//		System.out.println("Finished Class");

	}

	@BeforeTest

	public void beforeTest() {
//		System.out.println("Started the Test");

	}

	@AfterTest

	public void afterTest() {

//		System.out.println("Finished the Test");

	}

	@BeforeSuite

	public void beforeSuite() {
//		System.out.println("Started the Test Suite");

	}

	@AfterSuite

	public void afterSuite() {
//        quit();
//		System.out.println("Finished the Test Suite");

	}
}

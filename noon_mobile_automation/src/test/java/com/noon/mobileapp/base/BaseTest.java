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
import org.testng.annotations.AfterMethod;

import com.noon.mobileapp.util.ExtentManager;
import com.noon.mobileapp.util.NConstants;
import com.noon.mobileapp.util.Xls_Reader;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

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
		caps.setCapability("fullReset","true");
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
	
	@AfterMethod
	public void quit() {
		if(rep != null) {
			rep.endTest(test);
			rep.flush();
		}
		if(driver != null) {
			driver.quit();
		}
	}

    public void allowAppPermission(){

	    try{

            WebDriverWait wait = new WebDriverWait(aDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='android.widget.Button'][2]")));
            aDriver.findElement(By.xpath("//*[@class='android.widget.Button'][2]")).click();
            test.log(LogStatus.INFO, "App permissions popup displayed");

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='android.widget.Button'][2]")));
            aDriver.findElement(By.xpath("//*[@class='android.widget.Button'][2]")).click();

            test.log(LogStatus.INFO, "App permissions popup displayed");

        }catch(Exception e){
            test.log(LogStatus.INFO, "App permissions popup did not occur");
        }


//        while (driver.findElements(By.xpath("//*[@class='android.widget.Button'][2]")).size()>0)
//
//        {  driver.findElement(By.xpath("//*[@class='android.widget.Button'][2]")).click();
//        }
    }
}

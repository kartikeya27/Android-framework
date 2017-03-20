package com.noon.mobileapp;

import org.junit.Ignore;
import org.testng.SkipException;
import org.testng.annotations.Test;
import com.noon.mobileapp.base.BaseTest;
import com.noon.mobileapp.util.DataUtil;
import com.noon.mobileapp.util.NConstants;
import com.noon.mobileapp.util.Xls_Reader;
import com.relevantcodes.extentreports.LogStatus;

public class ApplyFilterTest extends BaseTest {
	
	String testName="ApplyFilterTest";
	
	@Ignore
	public void appyFilterTest() {
		test = rep.startTest(testName);
		test.log(LogStatus.INFO, "Starting the test");
		
		if(!DataUtil.isExecutable(xls, testName)) {
			test.log(LogStatus.SKIP, "Skipping the test as Runmode was NO");
			throw new SkipException("Skipping the test as Runmode was NO");
		}
		//execute
		test.log(LogStatus.PASS, "Test Passed");
	}
}

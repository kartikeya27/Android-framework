package com.noon.mobileapp.base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import com.noon.mobileapp.pages.TopMenuPage;
import com.noon.mobileapp.util.NConstants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.org.apache.xerces.internal.dom.DeferredTextImpl;

public class BasePage {
	public AndroidDriver<AndroidElement> aDriver;
	public ExtentTest test;
	public TopMenuPage menu;
	int level=0;
	public static final String DOWN = "down";
	public static final String UP = "up";

	public BasePage(AndroidDriver<AndroidElement> aDriver, ExtentTest test) {
		menu = new TopMenuPage(aDriver,test);
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), menu);
		this.aDriver = aDriver;
		this.test = test;
		
	}
	
	public TopMenuPage getMenu() {
		return menu;
	}
	
	public Boolean isElementPresent(String locator) {
		test.log(LogStatus.INFO, "Finding presence of element"+locator);
		int s = aDriver.findElements(By.xpath(locator)).size();
		if(s==0)
			return false;
		else
			return true;
	}
	
	public Boolean verifyText(String locator,String expectedText) {
		test.log(LogStatus.INFO, "Finding presence of element"+locator);
		return false;
	}
	/********************reporting function********************/
	public void reportPass(String passMsg) {
		test.log(LogStatus.PASS, passMsg);
	}
	
	public void reportFail(String failMsg) {
		takeScreenShot();
		test.log(LogStatus.FAIL, failMsg);
		Assert.fail(failMsg);
	}
	
	public void takeScreenShot(){
		//decide the file name 
		Date d = new Date();
		String screenshotFile=d.toString().replace(":", "_").replace(" ","_")+".png";
		String path=NConstants.REPORT_PATH+""+screenshotFile;
		//take screenshot
		File scrFile = ((TakesScreenshot)aDriver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Add screenshot to report
		test.log(LogStatus.INFO,"Snapshot below: ("+screenshotFile+")"+
				 test.addScreenCapture(path));
	}
	
	public Node initXML() {
		aDriver.findElement(By.xpath(NConstants.NAVIGATION_MENU_IMAGE)).click();
		File fXmlFile = new File(System.getProperty("user.dir")+"/menu.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder=null;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Document doc=null;
		try {
			doc = dBuilder.parse(fXmlFile);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		doc.getDocumentElement().normalize();

		
		Node baseNode = doc.getChildNodes().item(0);
		return baseNode;
	}
	

	public  void verifyChildValues(Node currentNode) throws InterruptedException {

		  if(! (currentNode instanceof DeferredTextImpl)){
			Element e = (Element)currentNode;

			if(!e.getAttribute("id").equals("")){ // expanded/clicked
				
					if(!e.getAttribute("id").equals("mainmenu")){
						boolean res=verifyElement(e.getAttribute("id"));
						System.out.println("Level - "+level+".Verifying Node "+e.getAttribute("id")+" -result -> "+ res);
						if(!res)
							reportFail("Item not found in menu - "+e.getAttribute("id"));
						if(level==0) {
							aDriver.findElement(By.xpath("//android.widget.CheckedTextView[@text='"+e.getAttribute("id")+"']")).click();
					    }else {
					    	
					        aDriver.findElement(By.xpath("//android.widget.TextView[@text='"+e.getAttribute("id")+"']")).click();
					       
					        Dimension dimensions = aDriver.manage().window().getSize();
							Double screenHeightStart = dimensions.getHeight() * 0.5;
							int scrollStart = screenHeightStart.intValue();
							Double screenHeightEnd = dimensions.getHeight() * 0.2;
							int scrollEnd = screenHeightEnd.intValue();
							aDriver.swipe(0,scrollStart,0,scrollEnd,2000);
							//onView(withId(R.id.list)).perform(scrollToPosition(4));
							
					    }	
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
					}
						level++;
					    }
					
					
			Node child = currentNode.getFirstChild();
			while(child!=null){
				verifyChildValues(child);
				child=child.getNextSibling();
			}
			System.out.println();
			level--;
			if(level==0){
				aDriver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']")).click();
				aDriver.findElement(By.xpath(NConstants.NAVIGATION_MENU_IMAGE)).click();

			}
		
			
		}else{// value is present
			
			boolean res=verifyElement(e.getTextContent());
			System.out.println("Level - "+level+". Verifying "+e.getTextContent()+" -result -> "+ res);
			if(!res)
				reportFail("Item not found in menu - "+e.getTextContent());
			
				currentNode = currentNode.getNextSibling();
				verifyChildValues(currentNode);	
				
		}
					
	  }
			
	}

	public boolean verifyElement(String nextElement){
		System.out.println("Verifying - "+nextElement);
			
		List<AndroidElement> e = null;
		if(level==0){
			e= aDriver.findElementsByAndroidUIAutomator("UiSelector().resourceId(\"com.noon.staging:id/design_menu_item_text\")");
		}else {
			e= aDriver.findElementsByAndroidUIAutomator("UiSelector().resourceId(\"com.noon.staging:id/list_item_title\")");
		}
		
		/*boolean scroll=true;		
		String lastBeforeScroll=null;
		String lastAfterScroll=null;
		while(scroll){
			// finding element
			for(AndroidElement a:e){
				if(a.getText().equals(nextElement)){
					return true;
				}
			}
			
			if(lastAfterScroll.equals(lastBeforeScroll)){ // end of the list
				System.out.println("Not found");
				return false; //not found
			}
			
			
			int h = aDriver.manage().window().getSize().height;
			lastBeforeScroll = e.get(e.size()-1).getText();
			aDriver.swipe(300, h-100, 300, h/2, 4000);
		
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(level==0){
				e= aDriver.findElementsByAndroidUIAutomator("UiSelector().resourceId(\"com.noon.staging:iddesign_menu_item_text\")");
			}else {
				e= aDriver.findElementsByAndroidUIAutomator("UiSelector().resourceId(\"com.noon.staging:id/list_item_title\")");
			}
			lastAfterScroll = e.get(e.size()-1).getText();
			
			
		}*/
	//	System.out.println("------**----------------------------");
		for(AndroidElement a:e){
			//System.out.println(a.getText());
			if(a.getText().equals(nextElement)){
				return true;
			}
		}
		
		return false;
	}
	
	//click
	public void click(String xpathKey) {
		try {
		test.log(LogStatus.INFO, "Click on element"+xpathKey);	
		aDriver.findElement(By.xpath((xpathKey))).click();
		}catch(Exception e) {
			//report an error 
			//e.printStackTrace();
		}
	}

	public boolean swipeToElement(MobileElement elem) {
		WebDriverWait wait = new WebDriverWait(aDriver, 1);
		try{
			wait.until(ExpectedConditions.visibilityOf(elem));
			return true;
		}catch(TimeoutException e){
			test.log(LogStatus.INFO,"Swipe");
		}

		for(int i=0;i<10;i++) {
			Dimension size = aDriver.manage().window().getSize();
			int startx = (int) (size.width * 0.70);
			int endx = (int) (size.width * 0.30);
			int starty = size.height / 2;
			aDriver.swipe(startx, starty, endx, starty, 200);

			try{
				wait.until(ExpectedConditions.visibilityOf(elem));
				return true;
			}catch(TimeoutException e){
				test.log(LogStatus.INFO,"Swipe");
			}

		}
		return false;
	}

    public void verticalScrollDown()
    {
        Dimension size = aDriver.manage().window().getSize();
        int y_start=(int)(size.height*0.60);
        int y_end=(int)(size.height*0.30);
        int x=size.width/2;
        aDriver.swipe(x,y_start,x,y_end,1000);
    }

    public void verticalScrollUp()
    {
        Dimension size = aDriver.manage().window().getSize();
        int y_start=(int)(size.height*0.30);
        int y_end=(int)(size.height*0.60);
        int x=size.width/2;
        aDriver.swipe(x,y_start,x,y_end,1000);
    }

    public boolean scrollToElement(String elem, String direction) {
        WebDriverWait wait = new WebDriverWait(aDriver, 1);
        try{
            wait.until(ExpectedConditions.visibilityOf(aDriver.findElement(By.xpath(elem))));
            return true;
        }catch(TimeoutException | NoSuchElementException e){
            test.log(LogStatus.INFO,"Scroll Down");
        }

        for(int i=0;i<10;i++) {
            if(direction.equalsIgnoreCase("down")){
                verticalScrollDown();
            }else{
                verticalScrollUp();
            }
            try{
                wait.until(ExpectedConditions.visibilityOf(aDriver.findElement(By.xpath(elem))));
                return true;
            }catch(TimeoutException | NoSuchElementException e){
                test.log(LogStatus.INFO,"Scroll");
            }
        }
        return false;
    }
}

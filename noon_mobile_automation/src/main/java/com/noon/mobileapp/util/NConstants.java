package com.noon.mobileapp.util;

import io.appium.java_client.android.AndroidElement;

public interface NConstants {
	//sauce labs parameters
	/*String USERNAME = "kbhatt";
	String ACCESS_KEY = "bf3b0272-6667-4722-a219-09ba5f4dbaee";
	String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";/*
	
	/*String APK_PATH1 = System.getProperty("user.dir")+"/apk/app-sit-debug.apk";
	String APPIUM_VERSION= "1.5.3";
	String DEVICE_NAME= "Samsung Galaxy S5 Device";
	String DEVICE_ORIENTATION = "portrait";
	String BROWSER_NAME="";
	String PLATFORM_VERSION = "5.0";
	String PLATFORM_NAME = "Android";*/
	
	//local device settings on real device
	//String APK_PATH = System.getProperty("user.dir")+"/apk/app-sit-preRelease.apk";
	String APK_PATH = System.getProperty("user.dir")+"/apk/app-production-debug.apk";
	String APPIUM_VERSION= "1.6";
	
	//String DEVICE_NAME = "A33f";
	String DEVICE_NAME = "Nexus";
	//String DEVICE_NAME = "Nexus_6_API_25";
	//String DEVICE_NAME = "Nexus_5_API_23";
	//String AVD_NAME = "Nexus_7";
	String DEVICE_ORIENTATION = "portrait";
	//String BROWSER_NAME="";
	String PLATFORM_VERSION = "5.1.1";
	//String PLATFORM_VERSION = "6.0";
	String PLATFORM_NAME = "Android";
	String HUB_URL = "http://0.0.0.0:4723/wd/hub";
	
	//sauce labs android emulator settings
	//String APK_PATH = System.getProperty("user.dir")+"/apk/app-sit-debug.apk";
	//String APK_PATH = "sauce-storage:app-sit-debug.apk";
	/*String APPIUM_VERSION = "1.4.16";
	String DEVICE_NAME = "LG Nexus 4 GoogleAPI Emulator";
	String BROWSER_NAME="";
	String DEVICE_ORIENTATION = "portrait";
	String PLATFORM_VERSION = "4.4";
	String PLATFORM_NAME = "Android";*/
	
	//Report
	String REPORT_PATH = "/Users/kartikbhatt/Automation/Reports/screenshots/";
	String XLS_PATH = System.getProperty("user.dir")+"/data/TestData.xlsx";
	
	//Elements for signin & register page
	String INITIAL_SCREEN="//android.widget.Button[@index='1']";
	String NAVIGATION_MENU_IMAGE="//android.widget.ImageButton[@content-desc='Drawer Open']";
	String ELECTRONIC_TEXT = "//android.widget.TextView[@text='Electronics & Applicances']";
	String SHOP_CATEGORY = "//android.widget.CheckedTextView[@text='Shop by category']";
	String ELECTRONIC_LINK = "//android.widget.TextView[@text='Electronics & Applicances']";
	String ENTERTAINMENT_TEXT = "//android.widget.TextView[@text='Entertainment & Leisure']";
	String SIGN_IN_LINK = "//android.widget.CheckedTextView[contains(@resource-id,'com.noon.sit:id/design_menu_item_text') and @text='Sign in']";
	String SIGN_IN_TAB = "//android.widget.TextView[contains(@resource-id,'android:id/text1') and @text='Sign in']";
	String SIGNIN_EMAIL="//android.widget.LinearLayout[@index='4']"; 
	String REGISTER_TAB="//android.widget.TextView[@text='Register']";
	String REGISTER_WITH="//android.widget.TextView[@index='1']";
	String GOOGLE_BUTTON="//android.widget.ImageView[contains(@resource-id,'com.noon.sit:id/google_button_login')]";
	String FACEBOOK_BUTTON="//android.widget.ImageView[contains(@resource-id,'com.noon.sit:id/facebook_button_login')]";
	String TWITTER_BUTTON="//android.widget.ImageView[contains(@resource-id,'com.noon.sit:id/twitter_button_login')]";
	String REGISTER_DETAILS="//android.widget.TextView[@text='Or register with your details']";
	String REGISTER_NAME="//android.widget.LinearLayout[@index='4']"; 
	String REGISTER_EMAIL="//android.widget.LinearLayout[@index='5']";
	String USE_MOBILE="//android.widget.TextView[@index='6']";
	String PASSWORD_VIEW_IMAGE="//android.widget.ImageButton[@index='1']";
	String REGISTER_PASSWORD="//android.widget.LinearLayout[@index='7']";
	String REGISTER_BUTTON="//android.widget.Button[@index='8']";
	String PASSWORD_TAB="//android.widget.EditText[@index='0']";
	String SIGNIN_PASSWORD="//android.widget.LinearLayout[@index='6']"; 
	String SIGNIN_BUTTON="//android.widget.Button[@index='7']";
	String HELLO_TEXT="//android.widget.TextView[@text='Hello,']";
	String USER_TEXT="//android.widget.TextView[@text='noon']";
	
	//Element for Checkout page
	String SIGNIN_CENTRAL_BUTTON="//android.widget.Button[@text='Sign in']";
	String MY_ACCOUNT="//android.widget.CheckedTextView[@text='My account']";
	String MY_ORDERS="//android.widget.TextView[@text='My Orders']";
	String RETURN_EXCHANGE="//android.widget.TextView[@text='Return & exchange']";
	String ADDRESS_BOOK="//android.widget.TextView[@text='Address book']";
	String WALLET="//android.widget.TextView[@text='Wallet']";
	String MY_PROFILE="//android.widget.TextView[@text='My profile']";
	String MY_PROFILE_USER_IMAGE="//android.widget.ImageView[@index='0']";
	String MY_PROFILE_USER_NAME="//android.widget.TextView[@index='0']";
	String MY_PROFILE_USER_EMAIL="//android.widget.TextView[@index='1']";
	String MY_PROFILE_USER_PASSWORD="//android.widget.TextView[@index='2']";
	String MY_PROFILE_USER_FRAGMENT_PASSWORD="//android.widget.TextView[@index='3']";
	String MY_PROFILE_USER_SIGNOUT="//android.widget.Button[@text='Sign out']";
	
	String NO_ORDERS="//android.widget.TextView[@text='No orders to show']";
	String SEARCH_TEXT_VIEW="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/search_text_view')]";
	String SEARCH_IMAGEVIEW="//android.widget.ImageView[@index='1']";
	String SEARCH_BAR_CONTAINER="//android.widget.EditText[contains(@resource-id,'com.noon.sit:id/search_edit_text_view')]";
	String LIST_ITEM_LABEL="//android.widget.TextView[@text='theBalm Bronzer/Blush']";
	String PRODUCT_RESULT="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/search_results_count')]";
	String PRODUCT_IMAGE="//android.widget.ImageView[contains(@resource-id,'com.noon.sit:id/list_item_product_image')]";
	String PRODUCT_TITILE="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/list_item_product_title')]";
	String PRODUCT_PRICE="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/list_item_product_price')]";
	String PRODUCT_CART="//android.widget.ImageButton[contains(@resource-id,'com.noon.sit:id/list_item_cart')]";
	String PRODUCT_MENU_CART="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/toolbar_menu_cart')]";
	
	String CART_SINGLE_LABEL="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/single_label_text')]";
	String CART_ITEM_DELETE="//android.widget.ImageView[contains(@resource-id,'com.noon.sit:id/cart_item_delete')]";
	String CART_ITEM_DECREASE="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/cart_item_quantity_decrease')]";
	String CART_ITEM_INCREASE="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/cart_item_quantity_increase')]";
	String CART_CHECKOUT_BUTTON="//android.widget.Button[contains(@resource-id,'com.noon.sit:id/centered_button')]";
	String PICK_LOCATION="//android.widget.TextView[@text='Pick location']";
	String PICK_IMAGE="//android.widget.ImageView";
	String CHECKOUT_ADDRESS="//android.widget.TextView[text='Search your street, building, area?']";
	String CHECKOUT_ADDRESS1="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/address')]";
	String CHECKOUT_ADDRESS2="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/checkout_add_address_current_address')]";
	String CHECKOUT_ADDRESS_SELECT="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/checkout_add_address_current_address')]";
	String CHECKOUT_WORK_ADDRESS="//android.widget.TextView[contains(@resource-id,'android:id/text1')]";
	String CHECKOUT_ADDRESS_TYPE="//android.widget.Spinner[contains(@resource-id,'com.noon.sit:id/checkout_add_address_type')]";
	String CHECKOUT_ADDRESS_NAME="//android.widget.EditText[contains(@resource-id,'com.noon.sit:id/checkout_add_address_kind_name_input')]";
	String CHECKOUT_PERSON_NAME="//android.widget.EditText[contains(@resource-id,'com.noon.sit:id/checkout_add_address_person_input')]";
	String CHECKOUT_PERSON_MOBILE="//android.widget.EditText[contains(@resource-id,'com.noon.sit:id/checkout_add_address_mobile_input')]";
	String CHECKOUT_PERSON_APARTMENT="//android.widget.EditText[contains(@resource-id,'com.noon.sit:id/checkout_add_address_apartment_number_input')]";
	String CHECKOUT_PERSON_FLOOR="//android.widget.EditText[contains(@resource-id,'com.noon.sit:id/checkout_add_address_floor_number_input')]";
	String CHECKOUT_PERSON_BUILDING="//android.widget.EditText[contains(@resource-id,'com.noon.sit:id/checkout_add_address_building_name_input')]";
	String CHECKOUT_PERSON_AREA_NAME="//android.widget.EditText[contains(@resource-id,'com.noon.sit:id/checkout_add_address_area_name_input')]";
	String CHECKOUT_PERSON_LANDMARK="//android.widget.EditText[contains(@resource-id,'com.noon.sit:id/checkout_add_address_landmark_input')]";
	String CHECKOUT_PERSON_CITY="//android.widget.EditText[contains(@resource-id,'com.noon.sit:id/checkout_add_address_city_input')]";
	String CHECKOUT_PERSON_COUNTRY="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/checkout_add_address_country')]";
	String CHECKOUT_SAVE_ADDRESS="//android.widget.Button[contains(@resource-id,'com.noon.sit:id/centered_button')]";
	
	String PLACE_ORDER="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/single_label_text')]";
	String SHIP_TO="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/ship_to_textview')]";
	String SHIP_NAME1="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/checkout_address_p1')]";
	String SHIP_NAME2="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/checkout_address_p2')]";
	String SHIP_NAME3="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/checkout_address_p3')]";
	String SHIP_MAP="//android.widget.ImageView[contains(@resource-id,'com.noon.sit:id/checkout_address_map')]";
	String SHIP_CHOOSE_ADDRESS="//android.widget.ImageView[contains(@resource-id,'com.noon.sit:id/checkout_address_edit')]";
	String SHIP_ADDRESS_ALERT="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/alertTitle')]";
	String SHIP_ADDRESS_ALERT_CANCEL="//android.widget.Button[contains(@resource-id,'android:id/button2')]";
	String SHIP_ITEM_IMAGE="//android.widget.ImageView[contains(@resource-id,'com.noon.sit:id/cart_item_image')]";
	String SHIP_ITEM_NAME="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/cart_item_name')]";
	String SHIP_ITEM_PRICE="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/cart_item_price')]";
	String SHIP_ITEM_QUANTITY="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/cart_item_property_label')]";
	String SHIP_ITEM_VALUE="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/cart_item_property_value')]";
	String SHIP_INFO="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/checkout_shipment_group_shipment_info_label')]";
	String SHIP_INFO_IMAGE="//android.widget.ImageView";
	String SHIP_INFO_ALERT_TITLE="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/alertTitle')]";
	String SHIP_INFO_ALERT_INFO="//android.widget.TextView[contains(@resource-id,'android:id/text1')]";
	String SHIP_INFO_ALERT_CANCEL="//android.widget.Button[contains(@resource-id,'android:id/button2')]";
	String SHIP_SUBTOTAL="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/checkout_shipment_group_subtotal_label')]";
	String SHIP_CHARGE="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/checkout_shipment_group_shipping_label')]";
	String SHIP_TOTAL="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/checkout_shipment_group_total_label')]";
	String SHIP_TOTAL1="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/checkout_subtotal')]";
	String SHIP_PRICE_VALUE="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/checkout_subtotal_value')]";
	String SHIP_SHIPPING="//android.widget.TextView[contains(@text,'Shipping: ')]";
	String SHIP_PRICE_SUB_COMPONENT="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/price_sub_component_value')]";
	String SHIP_GRAND_TOTAL="//android.widget.TextView[contains(@text,'Grand Total')]";
	String SHIP_GRAND_TOTAL_VALUE="//android.widget.TextView[contains(@resource-id,'com.noon.sit:id/checkout_grandtotal')]";
	String SHIP_CONTINUE_BUTTON="//android.widget.Button[contains(@resource-id,'com.noon.sit:id/centered_button')]";
	
	String PAYMENT_DETAILS="//android.view.View[contains(@content-desc,'Payment Details (Test Mode)')]";
	String PAYMENT_CARD="//android.view.View[contains(@content-desc,'Payment Card')]";
	String PAYMENT_CARD_TITLE="//android.view.View[contains(@resource-id,'title-card')]";
	String PAYMENT_AMOUNT="//android.view.View[contains(@content-desc,'Amount: 119.00 AED')]";
	String PAYMENT_CARD_NUMBER_LABEL="//android.view.View[contains(@content-desc,'Card Number')]";
	String PAYMENT_CARD_NUMBER="//android.widget.EditText[contains(@resource-id,'card-number')]";
	String PAYMENT_CARD_EXPIRATION_DATE="//android.view.View[contains(@content-desc,'Expiration Date')]";
	String PAYMENT_CARD_MONTH="//android.widget.Spinner[contains(@resource-id,'expiry-month')]";
	String PAYMENT_CARD_MONTH_NAME="//android.widget.CheckedTextView[contains(@resource-id,'android:id/text1')]";
	String PAYMENT_CARD_YEAR="//android.widget.Spinner[contains(@resource-id,'expiry-year')]";
	String PAYMENT_CARD_YEAR_NAME="//android.widget.CheckedTextView[contains(@resource-id,'android:id/text1')]";
	String PAYMENT_CVV_CODE_LABEL="////android.view.View[contains(@content-desc,'CVV Code')]";
	String PAYMENT_CVV_CODE_NUMBER="//android.widget.EditText[contains(@resource-id,'card_cvn')]";
	String PAYMENT_CVV_CODE_INFO="//android.view.View[contains(@content-desc,'?')]";
	String PAYMENT_CVV_CODE_INFO_IMAGE="//android.widget.Image[contains(@content-desc,'Z')]";
	String PAYMENT_CARD_SAVE="//android.widget.CheckBox[contains(@resource-id,'saveForFuture')]";
	String PAY_BUTTON="//android.widget.Button[contains(@resource-id,'btnCardCSPayment')]";
	String FOOTER_TEXT="//android.view.View[contains(@resource-id,'footer-text')]";
	String FOOTER_LOGO="//android.view.View[contains(@resource-id,'footer-logo')]";
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

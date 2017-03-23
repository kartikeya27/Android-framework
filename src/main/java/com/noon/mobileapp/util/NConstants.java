package com.noon.mobileapp.util;

import com.noon.mobileapp.pages.CheckoutPage;
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
    String APK_PATH = System.getProperty("user.dir") + "/apk/app-production-debug.apk";
    String APPIUM_VERSION = "1.5.3";

    //String DEVICE_NAME = "A33f";
//	String DEVICE_NAME = "LGD85592753e80";
//	String DEVICE_NAME ="BH913A6Q0D";
    String DEVICE_NAME = "emulator-5554";
    String DEVICE_ORIENTATION = "portrait";
    //String BROWSER_NAME="";
    String PLATFORM_VERSION = "6.0";
    //String PLATFORM_VERSION = "6.0";
    String PLATFORM_NAME = "Android";
    String HUB_URL = "http://127.0.0.1:4723/wd/hub";

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
    String REPORT_PATH = System.getProperty("user.dir") + "/target/";
    String XLS_PATH = System.getProperty("user.dir") + "/data/TestData.xlsx";

    //Elements for signin & register page
    String INITIAL_SCREEN = "//android.widget.Button[@index='1']";
    String NAVIGATION_MENU_IMAGE = "//android.widget.ImageButton[contains(@content-desc,'Open drawer')]";
    String ELECTRONIC_TEXT = "//android.widget.TextView[@text='Electronics & Applicances']";
    String SHOP_CATEGORY = "//android.widget.CheckedTextView[@text='Shop by category']";
    String ELECTRONIC_LINK = "//android.widget.TextView[@text='Electronics & Applicances']";
    String ENTERTAINMENT_TEXT = "//android.widget.TextView[@text='Entertainment & Leisure']";
    String SIGN_IN_LINK = "//android.widget.TextView[@text='Register or Sign In']";
    String SIGN_IN_TAB = "//android.widget.TextView[contains(@resource-id,'android:id/text1') and @text='Sign in']";
    String SIGNIN_PASSWORD = "//*[contains(@text,'Password')]";
    String SIGNIN_BUTTON = "//*[contains(@text,'Login')]";
    String FORGOT_PASSWORD = "//android.widget.TextView[@text='Forgot password?']";
    String SIGNIN_EMAIL = "//*[contains(@text,'Phone number or email address*')]";
    String SIGNIN_WITH = "//android.widget.TextView[@text='Sign in with']";
    String MOBILE_NUMBER_LINK = "//android.widget.TextView[@text='Use mobile number']";
    String EMAIL_LINK = "//android.widget.TextView[@text='Use email address']";
    String PASSWORD_VIEW_IMAGE = "//android.widget.ImageButton[@index='1']";
    String GOOGLE_SIGNIN = "//android.widget.LinearLayout[@index='1']";
    String REGISTER_TAB = "//android.widget.TextView[@text='Register']";
    String REGISTER_WITH = "//android.widget.TextView[@index='1']";
    String SIGNIN_DETAILS = "//android.widget.TextView[@text='Or sign in with your details']";
    String GOOGLE_BUTTON = "//android.widget.ImageView[contains(@resource-id,'com.noon:id/google_button_login')]";
    String FACEBOOK_BUTTON = "//android.widget.ImageView[contains(@resource-id,'com.noon:id/facebook_button_login')]";
    String TWITTER_BUTTON = "//android.widget.ImageView[contains(@resource-id,'com.noon:id/twitter_button_login')]";
    String REGISTER_DETAILS = "//android.widget.TextView[@text='Or register with your details']";
    String REGISTER_NAME = "//TextInputLayout[@text='Name*']/android.widget.FrameLayout/android.widget.EditText";
    String REGISTER_EMAIL = "//TextInputLayout[@text='Email address*']/android.widget.FrameLayout/android.widget.EditText";
    String USE_MOBILE = "//android.widget.TextView[@index='6']";
    String USE_EMAIL = "//android.widget.TextView[@text='Use email']";

    String REGISTER_PASSWORD = "//TextInputLayout[@text='Password*']/android.widget.FrameLayout/android.widget.EditText";
    String REGISTER_BUTTON = "//android.widget.Button[@text='Register']";
    String PASSWORD_TAB = "//android.widget.EditText[@index='0']";
    String HELLO_TEXT = "//*[contains(@text='Ahlan']";
    String SIGN_IN_MAIN = "//*[contains(@text,'Sign in with email or phone')]";

    //
    //OTP Page
    //
    String OTP_LABEL = "//android.widget.TextView[contains(@text,\"code\")]";
    String RESEND_EMAIL_LINK = "//android.widget.TextView[@text=\"Resend email\"]";
    String OTP_ACCEPT_ICON = "//android.widget.ImageView[@resource-id=\"com.noon:id/register_login_dialog_otp_icon\"]";
    String OTP_DIGIT_INPUT1 = "//android.widget.EditText[@index=\"0\"]";
    String OTP_DIGIT_INPUT2 = "//android.widget.EditText[@index=\"1\"]";
    String OTP_DIGIT_INPUT3 = "//android.widget.EditText[@index=\"2\"]";
    String OTP_DIGIT_INPUT4 = "//android.widget.EditText[@index=\"3\"]";
    String OTP_DIGIT_INPUT5 = "//android.widget.EditText[@index=\"4\"]";
    String OTP_DIGIT_INPUT6 = "//android.widget.EditText[@index=\"5\"]";


    //Element for Category-Fashion page
    String FASHION_TEXT = "//android.widget.TextView[@text='Fashion']";

    String CATEGORY_TEXT = "//android.widget.TextView[@text='Categories']";
    String FASHION_LINK = "//android.widget.TextView[@text='Fashion']";
    String WOMEN_TEXT = "//android.widget.TextView[@text='Women']";
    String WOMEN_CLOTHING_TEXT = "//android.widget.TextView[@text='Clothing']";
    String WOMEN_FOOTWEAR_TEXT = "//android.widget.TextView[@text='Footwear']";
    String WOMEN_BAGS_TEXT = "//android.widget.TextView[@text='Bags & Luggage']";
    String WOMEN_JEWELLERY_TEXT = "//android.widget.TextView[@text='Jewellery & Watches']";
    String WOMEN_EYEWEAR_TEXT = "//android.widget.TextView[@text='Eyewear']";
    String WOMEN_SPORTS_TEXT = "//android.widget.TextView[@text='Sports']";

    String MEN_TEXT = "//android.widget.TextView[@text='Men']";
    String MEN_CLOTHING_TEXT = "//android.widget.TextView[@text='Clothing']";
    String MEN_FOOTWEAR_TEXT = "//android.widget.TextView[@text='Footwear']";
    String MEN_BAGS_TEXT = "//android.widget.TextView[@text='Bags & Luggage']";
    String MEN_WATCHES_TEXT = "//android.widget.TextView[@text='Watches']";
    String MEN_ACCESSORIES_TEXT = "//android.widget.TextView[@text='Accessories']";
    String MEN_SPORTS_TEXT = "//android.widget.TextView[@text='Sports']";

    String GIRLS_TEXT = "//android.widget.TextView[@text='Girls']";
    String GIRLS_CLOTHING_TEXT = "//android.widget.TextView[@text='Clothing']";
    String GIRLS_SHOES_TEXT = "//android.widget.TextView[@text='Shoes']";
    String GIRLS_ACCESSORIES_TEXT = "//android.widget.TextView[@text='Accessories']";
    String GIRLS_WATCHES_TEXT = "//android.widget.TextView[@text='Watches']";
    String GIRLS_UNDERWEAR_TEXT = "//android.widget.TextView[@text='Underwear']";
    String GIRLS_SPORTS_TEXT = "//android.widget.TextView[@text='Sports']";

    String BOYS_TEXT = "//android.widget.TextView[@text='Boys']";
    String BOYS_CLOTHING_TEXT = "//android.widget.TextView[@text='Clothing']";
    String BOYS_FOOTWEAR_TEXT = "//android.widget.TextView[@text='Footwear']";
    String BOYS_ACCESSORIES_TEXT = "//android.widget.TextView[@text='Accessories']";
    String BOYS_SPORTS_TEXT = "//android.widget.TextView[@text='Sports']";

    String BABY_TEXT = "//android.widget.TextView[@text='Baby']";
    String BABY_GIRLS_CLOTHING_TEXT = "//android.widget.TextView[@text='Girls Clothing']";
    String BABY_BOYS_CLOTHING_TEXT = "//android.widget.TextView[@text='Boys Clothing']";
    String BABY_GIRLS_FOOTWEAR_TEXT = "//android.widget.TextView[@text='Girls Footwear']";
    String BABY_BOYS_FOOTWEAR_TEXT = "//android.widget.TextView[@text='Boys Footwear']";

    //Element for Category-Electronics page
    String ELECTRONICS_LINK = "//android.widget.TextView[@text='Electronics']";
    String ELECTRONICS_TEXT = "//android.widget.TextView[@text='Electronics']";
    String MOBILES_TEXT = "//android.widget.TextView[@text='Mobiles']";
    String TABLETS_TEXT = "//android.widget.TextView[@text='Tablets & E-Readers']";
    String DESKTOP_TEXT = "//android.widget.TextView[@text='Desktops']";
    String HOME_APPLIANCES_TEXT = "//android.widget.TextView[@text='Home Appliances']";
    String AUDIO_VISUAL_TEXT = "//android.widget.TextView[@text='Audio Visual']";
    String LAPTOP_GAMING_TEXT = "//android.widget.TextView[@text='Laptop & Gaming']";
    String CAMERA_TEXT = "//android.widget.TextView[@text='Cameras']";
    String ACCESSORIES_TEXT = "//android.widget.TextView[@text='Accessories']";

    //toys category
    String TOYS_TEXT = "//android.widget.TextView[@text='Toys & Games']";


    //books category
    String BOOKS_TEXT = "//android.widget.TextView[@text='Books, Music & Movies']";

    //health category
    String HEALTH_TEXT = "//android.widget.TextView[@text='Health & Beauty']";

    //home category
    String HOME_TEXT = "//android.widget.TextView[@text='Home & Garden']";

    //sports category
    String SPORTS_TEXT = "//android.widget.TextView[@text='Sports']";

    //Element for Checkout page
    String SIGNIN_CENTRAL_BUTTON = "//android.widget.TextView[@text='Sign in with email or phone >']";

    String NO_ORDERS = "//android.widget.TextView[@text='No orders to show']";
    String SEARCH_TEXT_VIEW = "//android.widget.TextView[contains(@resource-id,'com.noon:id/search_text_view')]";
    String SEARCH_IMAGEVIEW = "//android.widget.ImageView[@index='1']";
    String SEARCH_BAR_CONTAINER = "//android.widget.EditText[contains(@resource-id,'com.noon:id/search_edit_text_view')]";
    String LIST_ITEM_LABEL = "//android.widget.TextView[@text=\"%s\"]";
    String PRODUCT_RESULT = "//android.widget.TextView[contains(@resource-id,'com.noon:id/search_results_count')]";
    String ITEM_IMAGE = "//android.view.View[@NAF='true']";
    String PRODUCT_BASIC_INFO = "//android.widget.TextView[@text=\"%s\"]";

    String PRODUCT_PRICE = "//android.widget.TextView[contains(@text,'AED')]";
    String ITEM_PICKER_THUMB = "//android.widget.ImageView[contains(@resource-id,'com.noon:id/item_picker_thumb')]";
    String PICKABLE_ITEM_TITLE = "//android.widget.TextView[contains(@resource-id,'com.noon:id/pickable_items_title')]";
    String ROW_INFO_IMAGE = "//android.widget.ImageView[contains(@resource-id,'com.noon:id/multiple_row_info_image')]";
    String ROW_INFO_TEXT_PRICE = "//android.widget.TextView[contains(@resource-id,'com.noon:id/multiple_row_info_text_price')]";
    String ROW_INFO_TEXT_STOCK = "//android.widget.TextView[contains(@resource-id,'com.noon:id/multiple_row_info_text_stock')]";
    String ROW_INFO_RADIO = "//android.widget.RadioButton[contains(@resource-id,'com.noon:id/multiple_row_info_radio')]";
    String ITEM_PICKER_TEXT = "//android.widget.TextView[contains(@resource-id,'com.noon:id/item_picker_text')]";
    String SELECT_SIZE = "//android.widget.TextView[contains(@resource-id,'com.noon:id/pickable_items_title')]";
    String CENTERED_BUTTON = "//android.widget.Button[contains(@resource-id,'com.noon:id/centered_button')]";
    String SUPPLIER_INFO = "//android.widget.TextView[contains(@resource-id,'com.noon:id/supplier_info_text_end')]";
    String ITEM_ARROW = "//android.widget.ImageView[contains(@resource-id,'com.noon:id/about_this_item_arrow')]";
    String ITEM_DESCRIPTION = "//android.widget.TextView[contains(@resource-id,'com.noon:id/about_this_item_box_title')]";
    String ITEM_DESCRIPTION_DETAIL = "//android.widget.TextView[@index='0']";


    String ITEM_PRODUCT_TITILE = "//android.widget.TextView[contains(@resource-id,'com.noon:id/list_item_product_title')]";
    String PRODUCT_CART = "//android.widget.ImageButton[contains(@resource-id,'com.noon:id/list_item_cart')]";
    String PRODUCT_MENU_CART = "//android.widget.TextView[contains(@resource-id,'com.noon:id/toolbar_menu_cart')]";

    String CART_SINGLE_LABEL = "//android.widget.TextView[contains(@resource-id,'com.noon:id/single_label_text')]";
    String CART_ITEM_DELETE = "//android.widget.ImageView[contains(@resource-id,'com.noon:id/cart_item_delete')]";
    String CART_ITEM_DECREASE = "//android.widget.TextView[contains(@resource-id,'com.noon:id/cart_item_quantity_decrease')]";
    String CART_ITEM_INCREASE = "//android.widget.TextView[contains(@resource-id,'com.noon:id/cart_item_quantity_increase')]";
    String CART_CHECKOUT_BUTTON = "//android.widget.Button[contains(@resource-id,'com.noon:id/centered_button')]";
    String PICK_LOCATION = "//android.widget.TextView[@text='Pick location']";
    String PICK_IMAGE = "//android.widget.ImageView";
    String CHECKOUT_ADDRESS = "//android.widget.TextView[text='Search your street, building, area?']";
    String CHECKOUT_ADDRESS1 = "//android.widget.TextView[contains(@resource-id,'com.noon:id/address')]";
    String CHECKOUT_ADDRESS2 = "//android.widget.TextView[contains(@resource-id,'com.noon:id/checkout_add_address_current_address')]";
    String CHECKOUT_ADDRESS_SELECT = "//android.widget.TextView[contains(@resource-id,'com.noon:id/checkout_add_address_current_address')]";
    String CHECKOUT_WORK_ADDRESS = "//android.widget.TextView[contains(@resource-id,'android:id/text1')]";
    String CHECKOUT_ADDRESS_TYPE = "//android.widget.Spinner[contains(@resource-id,'com.noon:id/checkout_add_address_type')]";
    String CHECKOUT_ADDRESS_NAME = "//android.widget.EditText[contains(@resource-id,'com.noon:id/checkout_add_address_kind_name_input')]";
    String CHECKOUT_PERSON_NAME = "//android.widget.EditText[contains(@resource-id,'com.noon:id/checkout_add_address_person_input')]";
    String CHECKOUT_PERSON_MOBILE = "//android.widget.EditText[contains(@resource-id,'com.noon:id/checkout_add_address_mobile_input')]";
    String CHECKOUT_PERSON_APARTMENT = "//android.widget.EditText[contains(@resource-id,'com.noon:id/checkout_add_address_apartment_number_input')]";
    String CHECKOUT_PERSON_FLOOR = "//android.widget.EditText[contains(@resource-id,'com.noon:id/checkout_add_address_floor_number_input')]";
    String CHECKOUT_PERSON_BUILDING = "//android.widget.EditText[contains(@resource-id,'com.noon:id/checkout_add_address_building_name_input')]";
    String CHECKOUT_PERSON_AREA_NAME = "//android.widget.EditText[contains(@resource-id,'com.noon:id/checkout_add_address_area_name_input')]";
    String CHECKOUT_PERSON_LANDMARK = "//android.widget.EditText[contains(@resource-id,'com.noon:id/checkout_add_address_landmark_input')]";
    String CHECKOUT_PERSON_CITY = "//android.widget.EditText[contains(@resource-id,'com.noon:id/checkout_add_address_city_input')]";
    String CHECKOUT_PERSON_COUNTRY = "//android.widget.TextView[contains(@resource-id,'com.noon:id/checkout_add_address_country')]";
    String CHECKOUT_SAVE_ADDRESS = "//android.widget.Button[contains(@resource-id,'com.noon:id/centered_button')]";

    String PLACE_ORDER = "//android.widget.TextView[contains(@resource-id,'com.noon:id/single_label_text')]";
    String SHIP_TO = "//android.widget.TextView[contains(@resource-id,'com.noon:id/ship_to_textview')]";
    String SHIP_NAME1 = "//android.widget.TextView[contains(@resource-id,'com.noon:id/checkout_address_p1')]";
    String SHIP_NAME2 = "//android.widget.TextView[contains(@resource-id,'com.noon:id/checkout_address_p2')]";
    String SHIP_NAME3 = "//android.widget.TextView[contains(@resource-id,'com.noon:id/checkout_address_p3')]";
    String SHIP_MAP = "//android.widget.ImageView[contains(@resource-id,'com.noon:id/checkout_address_map')]";
    String SHIP_CHOOSE_ADDRESS = "//android.widget.ImageView[contains(@resource-id,'com.noon:id/checkout_address_edit')]";
    String SHIP_ADDRESS_ALERT = "//android.widget.TextView[contains(@resource-id,'com.noon:id/alertTitle')]";
    String SHIP_ADDRESS_ALERT_CANCEL = "//android.widget.Button[contains(@resource-id,'android:id/button2')]";
    String SHIP_ITEM_IMAGE = "//android.widget.ImageView[contains(@resource-id,'com.noon:id/cart_item_image')]";
    String SHIP_ITEM_NAME = "//android.widget.TextView[contains(@resource-id,'com.noon:id/cart_item_name')]";
    String SHIP_ITEM_PRICE = "//android.widget.TextView[contains(@resource-id,'com.noon:id/cart_item_price')]";
    String SHIP_ITEM_QUANTITY = "//android.widget.TextView[contains(@resource-id,'com.noon:id/cart_item_property_label')]";
    String SHIP_ITEM_VALUE = "//android.widget.TextView[contains(@resource-id,'com.noon:id/cart_item_property_value')]";
    String SHIP_INFO = "//android.widget.TextView[contains(@resource-id,'com.noon:id/checkout_shipment_group_shipment_info_label')]";
    String SHIP_INFO_IMAGE = "//android.widget.ImageView";
    String SHIP_INFO_ALERT_TITLE = "//android.widget.TextView[contains(@resource-id,'com.noon:id/alertTitle')]";
    String SHIP_INFO_ALERT_INFO = "//android.widget.TextView[contains(@resource-id,'android:id/text1')]";
    String SHIP_INFO_ALERT_CANCEL = "//android.widget.Button[contains(@resource-id,'android:id/button2')]";
    String SHIP_SUBTOTAL = "//android.widget.TextView[contains(@resource-id,'com.noon:id/checkout_shipment_group_subtotal_label')]";
    String SHIP_CHARGE = "//android.widget.TextView[contains(@resource-id,'com.noon:id/checkout_shipment_group_shipping_label')]";
    String SHIP_TOTAL = "//android.widget.TextView[contains(@resource-id,'com.noon:id/checkout_shipment_group_total_label')]";
    String SHIP_TOTAL1 = "//android.widget.TextView[contains(@resource-id,'com.noon:id/checkout_subtotal')]";
    String SHIP_PRICE_VALUE = "//android.widget.TextView[contains(@resource-id,'com.noon:id/checkout_subtotal_value')]";
    String SHIP_SHIPPING = "//android.widget.TextView[contains(@text,'Shipping: ')]";
    String SHIP_PRICE_SUB_COMPONENT = "//android.widget.TextView[contains(@resource-id,'com.noon:id/price_sub_component_value')]";
    String SHIP_GRAND_TOTAL = "//android.widget.TextView[contains(@text,'Grand Total')]";
    String SHIP_GRAND_TOTAL_VALUE = "//android.widget.TextView[contains(@resource-id,'com.noon:id/checkout_grandtotal')]";
    String SHIP_CONTINUE_BUTTON = "//android.widget.Button[contains(@resource-id,'com.noon:id/centered_button')]";

    String PAYMENT_DETAILS = "//android.view.View[contains(@content-desc,'Payment Details (Test Mode)')]";
    String PAYMENT_CARD = "//android.view.View[contains(@content-desc,'Payment Card')]";
    String PAYMENT_CARD_TITLE = "//android.view.View[contains(@resource-id,'title-card')]";
    String PAYMENT_AMOUNT = "//android.view.View[contains(@content-desc,'Amount: 119.00 AED')]";
    String PAYMENT_CARD_NUMBER_LABEL = "//android.view.View[contains(@content-desc,'Card Number')]";
    String PAYMENT_CARD_NUMBER = "//android.widget.EditText[contains(@resource-id,'card-number')]";
    String PAYMENT_CARD_EXPIRATION_DATE = "//android.view.View[contains(@content-desc,'Expiration Date')]";
    String PAYMENT_CARD_MONTH = "//android.widget.Spinner[contains(@resource-id,'expiry-month')]";
    String PAYMENT_CARD_MONTH_NAME = "//android.widget.CheckedTextView[contains(@resource-id,'android:id/text1')]";
    String PAYMENT_CARD_YEAR = "//android.widget.Spinner[contains(@resource-id,'expiry-year')]";
    String PAYMENT_CARD_YEAR_NAME = "//android.widget.CheckedTextView[contains(@resource-id,'android:id/text1')]";
    String PAYMENT_CVV_CODE_LABEL = "////android.view.View[contains(@content-desc,'CVV Code')]";
    String PAYMENT_CVV_CODE_NUMBER = "//android.widget.EditText[contains(@resource-id,'card_cvn')]";
    String PAYMENT_CVV_CODE_INFO = "//android.view.View[contains(@content-desc,'?')]";
    String PAYMENT_CVV_CODE_INFO_IMAGE = "//android.widget.Image[contains(@content-desc,'Z')]";
    String PAYMENT_CARD_SAVE = "//android.widget.CheckBox[contains(@resource-id,'saveForFuture')]";
    String PAY_BUTTON = "//android.widget.Button[contains(@resource-id,'btnCardCSPayment')]";
    String FOOTER_TEXT = "//android.view.View[contains(@resource-id,'footer-text')]";
    String FOOTER_LOGO = "//android.view.View[contains(@resource-id,'footer-logo')]";


    //	MyAccount page elements
    String MY_ACCOUNT = "//*[contains(@text,'My Account')]";
    String MY_ORDERS = "//*[@text='All Orders']";
    String RETURN_EXCHANGE = "//*[@text='Returns & exchanges']";
    String ADDRESS_BOOK = "//android.widget.TextView[@text='Address Book']";
    String WALLET = "//android.widget.TextView[@text='My Wallet']";
    String MY_PROFILE = "//*[@text='Profile']";
    String MY_PROFILE_USER_IMAGE = "//android.widget.ImageView[@index='0']";
    String MY_PROFILE_USER_NAME = "//android.widget.TextView[@index='0']";
    String MY_PROFILE_USER_EMAIL = "//android.widget.TextView[@index='1']";
    String MY_PROFILE_USER_PASSWORD = "//android.widget.TextView[@index='2']";
    String MY_PROFILE_USER_FRAGMENT_PASSWORD = "//android.widget.TextView[@index='3']";
    String MY_PROFILE_USER_SIGNOUT = "//*[@text='Sign out']";
    String MY_PROFILE_CONTINUE_SHOPPING = "//android.widget.Button[@text=\"Continue shopping\"]";

    //    Side Menu elements
    String MY_ORDERS_MENU = "//*[@text='My Orders']";
    String MENU_HOME = "//android.widget.CheckedTextView[@text='Home']";
    String MENU_RETURN_EXCHANGE = "//*[@text='Returns & Exchanges']";
    String SHOP_BY_CATEGORY = "//android.widget.CheckedTextView[@text='Shop by Category']";
    String TODAYS_DEALS = "//android.widget.CheckedTextView[contains(@text,'Deals')]";
    String INVITE_FRIENDS = "//*[contains(@text,'Invite your friends')]";
    String CUSTOMER_SERVICE = "//*[contains(@text,'Customer Service')]";
    String CHAT = "//*[contains(@text,'Chat with us')]";
    String CALL_US = "//*[contains(@text,'Call us')]";
    String ABOUT = "//*[contains(@text,'About noon')]";

    String TOOLBAR_LOGO = "//*[@resource-id='com.noon:id/toolbar_logo']";
    String HELLO_LABEL = "//*[@resource-id='com.noon:id/drawer_header_title_label']";

    //
    String CATEGORIES_LABEL = "//*[@text='Categories']";
    String TODAYS_DEALS_LABEL = "//*[contains(@text,\"Today\")]";
    String ITEMS_YOU_VIEWD_LABEL = "//*[contains(@text,\"Items you viewed\")]";
    String RETURN_ITEMS = "//*[contains(@text,\"Return items\")]";
    String RETURN_HISTORY = "//*[contains(@text,\"Return history\")]";

    //    Address Page
    String ADD_FIRST_ADDRESS = "//*[contains(@text,\"Add address\")]";
    String ADD_ANOTHER_ADDRESS = "//*[contains(@text,\"Add new address\")]";
    //    String MAP_DONE = "//*[contains(@text,\"Done\")]";
    String MAP_DONE = "//*[@resource-id=\"com.noon:id/checkout_add_address_save_button\"]";
    String MAP_CANCEL = "//*[contains(@text,\"Cancel\")]";
    String LOCATE_SEARCHING_PROGRESS = "//*[contains(@resource-id,\"com.noon:id/checkout_add_address_searching\")]";
    String LOCATE_MY_LOCATION = "//*[contains(@text,\"Locate me\")]";
    String ALMOST_DONE_ADDRESS = "//*[contains(@text,\"Almost done!\")]";
    String DELIVERY_ADDRESS_LABEL = "//*[contains(@text,\"Delivery address\")]";
    String ADDRESS_COUNTRY = "//TextInputLayout[contains(@text,\"Country\")]/android.widget.FrameLayout/android.widget.EditText";
    String ADDRESS_CITY = "//TextInputLayout[contains(@text,\"City\")]/android.widget.FrameLayout/android.widget.EditText";
    String ADDRESS_BUILDING = "//TextInputLayout[contains(@text,\"Building\")]/android.widget.FrameLayout/android.widget.EditText";
    String ADDRESS_FLAT_NO = "//TextInputLayout[contains(@text,\"Flat number\")]/android.widget.FrameLayout/android.widget.EditText";
    String ADDRESS_FLOOR_NO = "//TextInputLayout[contains(@text,\"Floor Number\")]/android.widget.FrameLayout/android.widget.EditText";
    String ADDRESS_AREA = "//TextInputLayout[contains(@text,\"Area\")]/android.widget.FrameLayout/android.widget.EditText";
    String ADDRESS_STREEET = "//TextInputLayout[contains(@text,\"Street\")]/android.widget.FrameLayout/android.widget.EditText";
    String ADDRESS_DETAILS = "//TextInputLayout[contains(@text,\"Details for courier\")]/android.widget.FrameLayout/android.widget.EditText";
    String ADDRESS_BUSINESS_CHECKBOX = "//android.widget.CheckBox[contains(@text,\"business address\")]";
    String ADDRESS_DEFAULT_CHECKBOX = "//android.widget.CheckBox[contains(@text,\"default address\")]";
    String ADDRESS_NAME = "//TextInputLayout[contains(@text,\"Name\")]/android.widget.FrameLayout/android.widget.EditText";
    String ADDRESS_PHONE = "//TextInputLayout[contains(@text,\"Mobile\")]/android.widget.FrameLayout/android.widget.EditText";
    String ADDRESS_SAVE = "//android.widget.Button[contains(@text,\"Save address\")]";


    //
    // Product page
    //
    String ADD_TO_CART = "//*[contains(@text,'Add to cart')]";
    String CART_ICON = "//*[contains(@resource-id,'com.noon:id/toolbar_menu_cart')]";
    String FREQUENTLY_BOUGHT_TOGETHER = ".//*[contains(@text,'Frequently bought together')]";
    String PRODUCT_DESCRIPTION = ".//*[contains(@text,'Description')]";
    String PRODUCT_SPECIFICATIONS = ".//*[contains(@text,'Specifications')]";
    String PRODUCT_RELATED_VIDEOS = ".//*[contains(@text,'Related videos')]";
    //    String PRODUCT_RELATED_PRODUCTS = ".//*[contains(@text,'Related products')]";
    String RECOMMENDED_PRODUCTS = ".//*[contains(@text,'Recommended products')]";
    String PRODUCT_SIZE_GUIDE = ".//*[contains(@text,'Size guide')]";
    String BUY_NOW = "//android.widget.Button[@text=\"Buy now\"]";
    String MORE_OFFERS = ".//*[contains(@text,'offers available')]";
    String SEE_ALL = ".//*[contains(@text,'See all')]";


    //
    // Cart
    //
    String SECURE_CHECKOUT = "//*[contains(@text,'Secure checkout')]";
    String REMOVE_FROM_CART = "//*[contains(@text,\"Remove\")]";
    //To be replaced
    String INCREASE_QUANTITY_IN_CART = "//android.widget.ImageButton[@index=2]";
    String DECREASE_QUANTITY_IN_CART = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageButton[1]";

    //    String CART_TOTAL = "//android.widget.TextView[contains(@text,'AED')]";
    String CART_TOTAL = " //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]";
    String ITEMS_IN_CART_INFO = "//android.widget.TextView[contains(@text,'in your cart')]";
    String PRODUCT_QUANTITY = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]";
    String CART_EMPTY_LABEL = "//*[contains(@text,'Your cart is empty')]";


    //
    // Checkout
    //
    String SELECT_DELIVERY_MSG = "//android.widget.TextView[contains(@text,'Select your delivery method')]";
    String DEFAULT_ADDRESS = "//*[contains(@text,'Default')]";
    String PAYMENT_PAY_WITH_MSG = "//*[contains(@text,'Pay with')]";
    String PAY_ON_DELIVERY = "//*[contains(@text,'Pay on delivery')]";
    String PLACE_ORDER_BTN = "//*[contains(@text,\"Place Order\")]";
    String SUBTOTAL = "//*[contains(@resource-id,\"com.noon:id/checkout_subtotal_value\")]";
    String GRAND_TOTAL = "//*[contains(@resource-id,\"com.noon:id/checkout_grandtotal\")]";
    String ADD_NEW_CARD_PAYMENT = "//android.widget.TextView[@resource-id=\"com.noon:id/checkout_add_card\"]";
    String PAY_WITH_CARD = "//android.widget.LinearLayout[@resource-id=\"com.noon:id/checkout_card_choose\"]";
    String REVIEW = "//android.widget.TextView[@resource-id=\"com.noon:id/top_label_text\" and @text=\"Review\"]";

    //
    // Categories page
    //
    String ALL_CATEGORIES = "//android.widget.TextView[@text='Categories']";
    String FASHION_CAT_LINK = "//android.widget.TextView[@text='Fashion']";
    String TOYS_CAT_LINK = "//android.widget.TextView[@text='Toys']";
    String BABY_CAT_LINK = "//android.widget.TextView[@text='Baby']";
    String BOOKS_CAT_LINK = "//android.widget.TextView[@text='Books, Music, & Movies']";
    String HEALTH_CAT_LINK = "//android.widget.TextView[@text='Health & Beauty']";
    String HOME_CAT_LINK = "//android.widget.TextView[@text='Home']";
    String SPORTS_CAT_LINK = "//android.widget.TextView[@text='Sports']";
    String ELECTRONICS_CAT_LINK = "//android.widget.TextView[@text='Electronics']";

    //
    //Wallet page
    //
    String TRANSACTIONS_WALLET = "//android.widget.TextView[@text='Transactions']";
    String SAVED_CARDS_WALLET = "//android.widget.TextView[@text='Saved cards']";
    String BALANCE_WALLET = "//android.widget.TextView[@resource-id='com.noon:id/my_account_wallet_host_your_balance_value']";
    String ADD_CARD_BTN_WALLET = "//android.widget.Button[@resource-id='com.noon:id/walled_saved_cards_add_new']";
    String DELETE_FIRST_CARD = "//android.widget.TextView[@resource-id='com.noon:id/manage_payments_list_item_delete_button']";

    //
    //Add new card
    //
    String NAME_ON_CARD = "//android.widget.EditText[@index=0]";
    String CARD_NNUMBER = "//android.widget.EditText[@resource-id=\"com.noon:id/checkout_card_number\"]";
    String MONTH_CARD = "//android.widget.TextView[@resource-id='android:id/text1' and @text='Month']";
    String YEAR_CARD = "//android.widget.TextView[@resource-id='android:id/text1' and @text='Year']";
    String MAKE_DEFAULT_CARD = "//android.widget.CheckBox[@resource-id='com.noon:id/checkout_card_make_default']";
    String SAVE_CARD = "//android.widget.Button[@resource-id='com.noon:id/checkout_card_save']";
    String ADD_NEW_CARD_LABEL = "//android.widget.TextView[@text='Add new card']";
    String CARD_REMOVE_CONFIRMATION_MSG = "//android.widget.TextView[@resource-id=\"com.noon:id/error_message\"]";
    String CARD_REMOVE_CONFIRMATION_BTN_YES =  "//android.widget.Button[@text=\"Yes\"]";


    //
    //Checkout
    //
    String ADD_CHANGE_ADDRESS_CHECKOUT = "//android.widget.TextView[@text='Add or change address']";
    String ADD_NEW_ADDRESS_CHECKOUT = "//android.widget.TextView[@text='Add new address']";


}

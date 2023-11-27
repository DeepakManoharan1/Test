package com.locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillingLocators {
	
		//user login
		@FindBy(xpath="//a[@href='https://demo.smart-hospital.in/site/userlogin']")
		public WebElement login;
		
		//sign in
		@FindBy(xpath="//button[@type='submit']")
		public WebElement signIn;
		
		//radiology
		@FindBy(xpath="(//a[@href='https://demo.smart-hospital.in/patient/dashboard/radioreport'])[1]")
		public WebElement radiology;
		
		@FindBy(xpath="//h3[contains(text(),' Radiology Test Reports')]")
		public WebElement assertRadiology;
		
		@FindBy(xpath="//div[@class='dataTables_filter']//child::input")
		public WebElement search1;
		
		@FindBy(xpath="//a[@class='btn btn-default dt-button buttons-csv buttons-html5']//following-sibling::a[1]")
		public WebElement pdf;
		
		//ambulance
		@FindBy(xpath="(//a[@href='https://demo.smart-hospital.in/patient/dashboard/ambulance'])[1]")
		public WebElement ambulance;
		
		@FindBy(xpath="//h3[contains(text(),' Ambulance Bill')]")
		public WebElement assertAmbulance;
		
		@FindBy(xpath="(//button[@class='btn btn-primary btn-xs'])[4]")
		public WebElement pay;
		
		@FindBy(css="button#pay_button")
		public WebElement add;
		
		@FindBy(xpath="//span[contains(text(),'Pay with Card')]")
		public WebElement payCard;
		
		@FindBy(xpath="//iframe[@src='https://js.stripe.com/v2/m/outer.html#referrer=https%3A%2F%2Fdemo.smart-hospital.in%2F&title=Stripe%20Checkout&url=https%3A%2F%2Fcheckout.stripe.com%2Fv3%2Foivkx0oP8BgueCG8QFpDfA.html%3Fdistinct_id%3D7a5f550c-c665-8b42-0dd1-e449ab4586c4&muid=NA&sid=NA&version=6&preview=false&']")
		public WebElement iframe;
		
		@FindBy(xpath="//input[@type='email']")
		public WebElement email;
		
		@FindBy(xpath="//input[@id='card_number']")
		public WebElement cardNumber;
		
		@FindBy(xpath="//input[@id='cc-exp']")
		public WebElement expiry;
		
		@FindBy(xpath="//input[@id='cc-csc']")
		public WebElement cvc;
		
		@FindBy(xpath="//input[@id='billing-zip']")
		public WebElement zip;
		
		@FindBy(xpath="//span[@class='iconTick']")
		public WebElement payment;
		
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
		public WebElement assertText;
		
		//blood bank
		@FindBy(xpath="//a[@href='https://demo.smart-hospital.in/patient/dashboard/bloodbank']")
		public WebElement bloodBank;
		
		@FindBy(xpath="//a[@href='#activity']")
		public WebElement componentIssue;
		
		@FindBy(xpath="//div[@id='DataTables_Table_1_filter']//child::label//child::input")
		public WebElement search2;
		
		//whatsapp
		@FindBy(xpath="(//a[@class='todoicon'])[1]")
		public WebElement whatsapp;
		
		@FindBy(xpath="(//li[@class='contact'])[1]")
		public WebElement member;
		
		@FindBy(xpath="//input[starts-with(@placeholder, 'Write Your Message...')]")
		public WebElement message;
		
		@FindBy(xpath="//button[@class='submit input_submit']")
		public WebElement send;
		
		//logout
		@FindBy(xpath="//li[@class='dropdown user-menu']//child::a")
		public WebElement profile;
		
		@FindBy(xpath="//a[@href='https://demo.smart-hospital.in/site/logout']")
		public WebElement logout;
}

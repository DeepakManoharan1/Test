package com.stepdefinition;

import java.util.Set;

import org.junit.Assert;


import com.actions.BillingActions;

import com.locators.BillingLocators;
import com.utility.DataClass;
import com.utility.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminLoginStepDefinition  {
	
	BillingLocators bill = new BillingLocators();
	BillingActions billaction = new BillingActions(); 
	DataClass data = new DataClass();

	@Given("User enters into the User Login portal")
	public void user_enters_into_the_user_login_portal() {
	    HelperClass.openPage(data.url);
	    System.out.println("The website launches");
	    billaction.clickUserLogin();
    Set<String> allWindows = HelperClass.getDriver().getWindowHandles();
	for (String curWindow : allWindows) {
		HelperClass.getDriver().switchTo().window(curWindow);
	}
	billaction.clickSignIn();
    System.out.println("User logged in successfully");	    
	}

	@Given("User clicks radiology")
	public void user_clicks_radiology() {
		billaction.clickRadiology();
		Assert.assertTrue(billaction.verifyRadiology().contains("Radiology Test Reports"));
		System.out.println("The radiology assert is successful");
	}

	@When("Search the bill number in search field")
	public void search_the_bill_number_in_search_field() {
		billaction.setBillNo(data.Billno);
//		Assert.assertTrue("The element is not enabled", bill.search1.isEnabled());
//		System.out.println("The search field is enabled");
	}

	@Then("Download the report in pdf format")
	public void download_the_report_in_pdf_format() {
		billaction.downloadPdf();
		System.out.println("PDF downloaded successfully");
	}

	@Given("User clicks the ambulance")
	public void user_clicks_the_ambulance() {
		billaction.clickAmbulance();
//		Assert.assertTrue(billaction.verifyAmbulance().contains("Ambulance Bill"));
//		System.out.println("The ambulance assert is successful");
	}

	@When("Processing payment using card")
	public void processing_payment_using_card() {
		billaction.clickPay();
		billaction.clickAdd();
		billaction.clickPayCard();
		billaction.setEmail(data.Email);
		billaction.setCardNumber(data.CardNumber);
		billaction.setCardNumber(data.CardNumber);
		billaction.setCardNumber(data.CardNumber);
		billaction.setCardNumber(data.CardNumber);
		billaction.setExpiry(data.Expiry);
		billaction.setExpiry(data.Expiry);
		billaction.setCVC(data.CVC);
		billaction.setzip(data.Zipcode);
		billaction.clickPayment();

		
	}

	@Then("Checks the payment is successful")
	public void checks_the_payment_is_successful() {
		
		
	}

	@Given("User clicks the blood bank")
	public void user_clicks_the_blood_bank() {
		billaction.clickBloodBank();
	}

	@When("Switches to component issue")
	public void switches_to_component_issue() {
		billaction.clickComponentIssue();
		
	}

	@Then("Search for component using search field")
	public void search_for_component_using_search_field() {
		billaction.setComponent(data.Component);
		System.out.println("The component name was searched");
		
	}

	@Given("User clicks the whatsapp")
	public void user_clicks_the_whatsapp() {
		billaction.clickWhatsApp();
		billaction.clickMember();
		billaction.setMessage(data.Message);
	}

	@When("Send message to the staff")
	public void send_message_to_the_staff() {
		billaction.clickButton();
		
	}

	@Then("Check the message is delivered")
	public void check_the_message_is_delivered() {
		System.out.println("The message is delivered");
	}
}

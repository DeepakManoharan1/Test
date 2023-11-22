package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.actions.BillingActions;
import com.actions.FrontOfficeAction;
import com.actions.InPatientActions;
import com.actions.OutPatientActions;
import com.locators.BillingLocators;
import com.utility.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminLoginStepDefinition  {
	BillingLocators bill;
	BillingActions billaction = new BillingActions(); 
	FrontOfficeAction frontAction = new FrontOfficeAction();
	OutPatientActions opAct = new OutPatientActions();
	InPatientActions InAct = new InPatientActions();

	public AdminLoginStepDefinition() {
		super();
		bill = new BillingLocators();
		PageFactory.initElements(HelperClass.getDriver(), bill);
		
	}
	public String url = "https://demo.smart-hospital.in/site/login";
	public String verify;

	@Given("user enters into the Admin portal")
	public void user_enters_into_the_admin_portal() {
//		System.out.println("Admin page ");
		HelperClass.log.info("Admin page ");
		HelperClass.openPage(url);
		HelperClass.driver.findElement(By.xpath("(//a[contains(@class,'btn btn-primary')]//i)[2]")).click();
		HelperClass.driver.findElement(By.xpath("//div[@class='form-bottom']//button[1]")).click();
//		System.out.println("Logged in Successfull");
		HelperClass.log.info("Logged in Successfull");
		
		
	}
	
	@Given("user enters into Billing")
	public void user_enters_into_billing() {
		billaction.clickBilling();	    
	}

	@When("user clicks the opd")
	public void user_clicks_the_opd() throws InterruptedException {
	    billaction.clickOPD();
	}

	@When("clicks the Add patient")
	public void clicks_the_add_patient() {
	    billaction.AddPatient();
	}

	@When("clicks the new patient")
	public void clicks_the_new_patient() {
	    billaction.NewPatient();
	}

	@When("enter the Mandatory fields only")
	public void enter_the_mandatory_fields_only() throws InterruptedException {
	    billaction.mandatoryField();
	}
	@When("Missing Mandatory fields only")
	public void missing_mandatory_fields_only() throws InterruptedException {
	   billaction.mandatoryField();
	   billaction.missMandatoryField();
	}


	@Then("enters the other OPD details")
	public void enters_the_other_opd_details() throws InterruptedException {
	    billaction.otherOPDdetails();
	}

	@Then("checks the name")
	public void checks_the_name() {
	    billaction.getUrl();
	    Assert.assertNotSame(billaction.getUrl(), url);
	    HelperClass.log.info("Asserted");
	}
	
	@When("enter some fields")
	public void enter_some_fields() {
		billaction.SomeFeilds();
	    
	}

	@Then("Assert the error")
	public void assert_the_error() throws InterruptedException {
	    Assert.assertTrue(billaction.getErrorMessage().contains("The Age field is required."));
//	    System.out.println("Assertion passed");
	    HelperClass.log.info("Assertion passed");
	}
	
	@Then("Assert the successfull message")
	public void assert_the_successfull_message() throws InterruptedException {
		Assert.assertTrue(billaction.checkingSavedOrNot().contains("Record Saved Successfully"));
//		System.out.println("");
		HelperClass.log.info("Assertion passed in new patient");
	}
	
	@Then("Assert the intentional error")
	public void assert_the_intentional_error() throws InterruptedException {
		Assert.assertTrue(billaction.getPaidErrorMessage().contains("The Paid Amount field is required."));
//	    System.out.println("");
	    HelperClass.log.info("Assertion passed for Intentionally failed full bill module");
	}
/////////////////////////////////
	//front office
	
	@Given("user enters into front office")
	public void user_enters_into_front_office() {
	    frontAction.enterFront();
	}

	@When("clicks the Add visitors")
	public void clicks_the_add_visitors() {
	    frontAction.Addvisitor();
	}

	@When("enter all fields")
	public void enter_all_fields() {
	    frontAction.addAllFields();
	}

	@Then("save the visitors")
	public void save_the_visitors() throws InterruptedException {
	    frontAction.saveVisitor();
	}

	@When("misses some fields")
	public void misses_some_fields() {
	   frontAction.missFields();
	}

	@Then("Assert the error frontOffice")
	public void assert_the_error_front_office() throws InterruptedException {
		Assert.assertTrue(frontAction.assertfrontError().contains("The Purpose field is required."));
//		 System.out.println(""); 
		 HelperClass.log.info("assert passed for front office");
	}

	@When("clicks the Add visitors as inquiry")
	public void clicks_the_add_visitors_as_inquiry() {
	    frontAction.AsInquiry();
	}

	

	@When("clicks the Add visitors as seminar")
	public void clicks_the_add_visitors_as_seminar() {
	   frontAction.AsSeminar();
	}

	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	////////////////////////////////////////////
	
	//outpatient
	
	@Given("user enters into OutPatient")
	public void user_enters_into_out_patient() {
		opAct.userEntersOp();
	}

	@When("enter some fields in OutPatient")
	public void enter_some_fields_in_out_patient() {
	    opAct.enter_some_fields_in_out_patient();
	}

	@Then("Assert the error in outpatient")
	public void assert_the_error_in_outpatient() {
		Assert.assertTrue(opAct.assert_the_error_in_outpatient().contains("The Day field is required."));
		HelperClass.log.info("Error message is asserted");
	}

	@When("enter the Mandatory fields only in outPatient")
	public void enter_the_mandatory_fields_only_in_out_patient() {
	    opAct.enter_the_mandatory_fields_only_in_out_patient();
	}

	@Then("Assert the successfull message in OutPatient")
	public void assert_the_successfull_message_in_out_patient() {
		Assert.assertTrue(opAct.assert_the_successfull_message_in_out_patient().contains("Record Saved Successfully"));
		HelperClass.log.info("Assert the Successfully message");
	}

	@Then("enters the other OPD details in outPatient")
	public void enters_the_other_opd_details_in_out_patient() throws InterruptedException {
	   opAct.enters_the_other_opd_details_in_out_patient(); 
	}

	@Then("checks the name in Outpatient")
	public void checks_the_name_in_outpatient() {
		Assert.assertTrue(opAct.checks_the_name_in_outpatient().contains(""));
		HelperClass.log.info("Record Saved Successfully in outPatient");
		
	}

	@When("Missing Mandatory fields only in outPatient")
	public void missing_mandatory_fields_only_in_out_patient() throws InterruptedException {
	    opAct.missing_mandatory_fields_only_in_out_patient();
	}

	@Then("Assert the intentional error in OutPatient")
	public void assert_the_intentional_error_in_out_patient() {
		Assert.assertTrue(opAct.assert_the_intentional_error_in_out_patient().contains("The Appointment Date field is required."));
		HelperClass.log.info("Asert passed with showing error message");
	}

	

	
/////////////////////////////////
	///////inpatient
	
	@Given("user enters into InPatient")
	public void user_enters_into_in_patient() {
	    InAct.userEntersIp();	    
	}

	@When("enter some fields in InPatient")
	public void enter_some_fields_in_in_patient() {
	    
	    InAct.enter_some_fields_in_in_patient();
	}

	@Then("Assert the error in Inpatient")
	public void assert_the_error_in_inpatient() {
		Assert.assertTrue(InAct.assert_the_error_in_inpatient().contains("The Name field is required."));
		HelperClass.log.info("Assert passed ");
	    
	}

	@When("enter the Mandatory fields only in InPatient")
	public void enter_the_mandatory_fields_only_in_in_patient() {
	    InAct.enter_the_mandatory_fields_only_in_in_patient();
	    
	}

	@Then("Assert the successfull message in InPatient")
	public void assert_the_successfull_message_in_in_patient() {
		String m=InAct.assert_the_successfull_message_in_in_patient();
		Assert.assertTrue(m.contains("Record Saved Successfully"));
		HelperClass.log.info("Record saved");
		
	}

	@Then("enters the other OPD details in InPatient")
	public void enters_the_other_opd_details_in_in_patient() throws InterruptedException {
	    InAct.enters_the_other_opd_details_in_in_patient();
	    
	}

	@Then("checks the name in Inpatient")
	public void checks_the_name_in_inpatient() {
		Assert.assertTrue(InAct.checks_the_name_in_inpatient().contains("Patient Added Successfully"));
		
	    
	}

	@When("Missing Mandatory fields only in InPatient")
	public void missing_mandatory_fields_only_in_in_patient() throws InterruptedException {
	    InAct.missing_mandatory_fields_only_in_in_patient();	    
	}

	@Then("Assert the intentional error in InPatient")
	public void assert_the_intentional_error_in_in_patient() {
		Assert.assertTrue(InAct.assert_the_intentional_error_in_in_patient().contains("The Appointment Date field is required."));
		
	    
	}
	
	
	
	
	/////////////////////////

	@Given("user enter into the IPD-InPatient")
	public void user_enter_into_the_ipd_in_patient() {
		System.out.println("10");
		InAct.userEntersIp();
		
	}

	@Given("Added the In patient details")
	public void added_the_in_patient_details() throws InterruptedException {
		System.out.println("11");
		InAct.AddInPatientDetails();
		Assert.assertNotSame(InAct.getUrl(), url);
//		this.verify = verify;
	}

	@Then("Check the In patient added")
	public void check_the_in_patient_added() {
		
		System.out.println("12");
		System.out.println("patient added success");
//		Assert.assertTrue(logact.getVerifyText().contains("Dashboard"));
//		System.out.println(verify);
//		System.out.println(InAct.checkAssert());
//		InAct.sendNameToCheck(verify);
//		Assert.assertTrue(InAct.checkAssert().contains(verify));
	}
	@Then("Logout1")
	public void logout1() {
		billaction.logout1();
		System.out.println("logout success");
	}
}

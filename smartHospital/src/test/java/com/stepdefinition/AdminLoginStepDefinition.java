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
		System.out.println("Admin page ");
		
		HelperClass.openPage(url);
		HelperClass.driver.findElement(By.xpath("(//a[contains(@class,'btn btn-primary')]//i)[2]")).click();
		HelperClass.driver.findElement(By.xpath("//div[@class='form-bottom']//button[1]")).click();
		System.out.println("Logged in Successfull");
		
		
	}

	@Given("user enters into opd")
	public void user_enters_into_opd() throws InterruptedException {
		System.out.println("1");
		billaction.ClickBillingButton();
		System.out.println("clicked billing");
		
		
	}

	@Given("Added the patient details")
	public void added_the_patient_details() throws InterruptedException {
		System.out.println("2");
		billaction.consultant_Doctor();
	}

	@Then("Check the patient added")
	public void check_the_patient_added() {
		System.out.println("3");
//		billaction.Billing_final();
		
		Assert.assertNotSame(billaction.getUrl(), url);
		System.out.println("Asserted Billing Action");
	}

	@Given("user enter into the FrontOffice")
	public void user_enter_into_the_front_office() {
		System.out.println("4");
		frontAction.enterIntoTheFrontOffice();
		
	}

	@Given("added the visitors")
	public void added_the_visitors() {
		System.out.println("5");
		frontAction.PurposeActions();
		System.out.println("visitor added");
		
	}

	@Then("Check the visitors added")
	public void check_the_visitors_added() {
		System.out.println("6");
		Assert.assertEquals(frontAction.checkingUseradded(),"9361109224");
		System.out.println("Asserted");
		
	}
/////////////////////////////////
	@Given("user enter into the OPD-OutPatient")
	public void user_enter_into_the_opd_out_patient() throws InterruptedException {
		System.out.println("7");
		opAct.userEntersOp();
		System.out.println("User entered into OP");
	}
	@Given("Added the op patient details")
	public void added_the_op_patient_details() throws InterruptedException {
		System.out.println("8");
		opAct.PatientDetails();
		System.out.println("Patient Details Added");
	}

	@Then("Check the op patient added")
	public void check_the_op_patient_added() {
		System.out.println("9");
		Assert.assertNotSame(opAct.getUrl(), url);
		System.out.println("Asserted Out Patient");
	}

	@Given("user enter into the IPD-InPatient")
	public void user_enter_into_the_ipd_in_patient() {
		System.out.println("10");
		InAct.userEntersIp();
		
	}

	@Given("Added the In patient details")
	public void added_the_in_patient_details() throws InterruptedException {
		System.out.println("11");
		verify = InAct.AddInPatientDetails();
		
		this.verify = verify;
	}

	@Then("Check the In patient added")
	public void check_the_in_patient_added() {
		System.out.println("12");
//		Assert.assertTrue(logact.getVerifyText().contains("Dashboard"));
		System.out.println(verify);
		System.out.println(InAct.checkAssert());
		InAct.sendNameToCheck(verify);
		Assert.assertTrue(InAct.checkAssert().contains(verify));
	}
}

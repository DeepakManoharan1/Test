package com.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.locators.InPatientLocators;
import com.utility.HelperClass;

public class InPatientActions {
	InPatientLocators inPat;
	public InPatientActions() {
		this.inPat = new InPatientLocators();
		PageFactory.initElements(HelperClass.getDriver(), inPat);
	}
	public void userEntersIp() {
		inPat.ClickInPatient.click();
	}
	
	public void enter_some_fields_in_in_patient() {
		inPat.year.sendKeys("2023");
		inPat.month.sendKeys("11");
		inPat.day.sendKeys("23");
		inPat.savePatient.click();
	}
	
	public String assert_the_error_in_inpatient() {
		return inPat.errorMsg1.getText();
	}
	
	public void enter_the_mandatory_fields_only_in_in_patient() {
		inPat.patientName.sendKeys("Deepak");
		inPat.year.sendKeys("2023");
		inPat.month.sendKeys("11");
		inPat.day.sendKeys("23");
		inPat.savePatient.click();
	}
	
	public void enters_the_other_opd_details_in_in_patient() throws InterruptedException {
		
		inPat.admissionDate.sendKeys(Keys.ENTER);
		inPat.consultantDoctor.click();
//		Thread.sleep(3000);
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(inPat.consultantDoctorDropDown));
		inPat.consultantDoctorDropDown.click();
//		Thread.sleep(3000);
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(inPat.CreditLimit));
		inPat.CreditLimit.sendKeys("1000");
		Select s = new Select(inPat.betGroup);
		s.selectByIndex(1);
		Thread.sleep(3000);
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(inPat.betNumber));
		inPat.betNumber.click();
//		Thread.sleep(3000);
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(inPat.betNumberDropDown));
		inPat.betNumberDropDown.click();
		String name = inPat.getname.getText();
		inPat.save.click();
	}
	
	public String checks_the_name_in_inpatient() {
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(inPat.sucessmsg2));
		return inPat.sucessmsg2.getText();
	}
	
	public String assert_the_successfull_message_in_in_patient() {
		return inPat.sucessmsg1.getText();
	}
	
	public void missing_mandatory_fields_only_in_in_patient() throws InterruptedException {
		
		inPat.patientName.sendKeys("Deepak");
		inPat.year.sendKeys("2023");
		inPat.month.sendKeys("11");
		inPat.day.sendKeys("23");
		inPat.savePatient.click();
//		inPat.admissionDate.sendKeys(Keys.ENTER);
		inPat.consultantDoctor.click();
		Thread.sleep(3000);
		inPat.consultantDoctorDropDown.click();
		Thread.sleep(3000);
		inPat.CreditLimit.sendKeys("1000");
		Select s = new Select(inPat.betGroup);
		s.selectByIndex(1);
		Thread.sleep(3000);
		inPat.betNumber.click();
		Thread.sleep(3000);
		inPat.betNumberDropDown.click();
		String name = inPat.getname.getText();
		inPat.save.click();
		
	}
	public void AddInPatientDetails() throws InterruptedException {
		inPat.addpatient.click();
		inPat.newPatient.click();
		inPat.patientName.sendKeys("Deepak");
		inPat.year.sendKeys("2023");
		inPat.month.sendKeys("11");
		inPat.day.sendKeys("23");
		inPat.savePatient.click();
		inPat.admissionDate.sendKeys(Keys.ENTER);
		inPat.consultantDoctor.click();
		Thread.sleep(3000);
		inPat.consultantDoctorDropDown.click();
		Thread.sleep(3000);
		inPat.CreditLimit.sendKeys("1000");
		Select s = new Select(inPat.betGroup);
		s.selectByIndex(1);
		Thread.sleep(3000);
		inPat.betNumber.click();
		Thread.sleep(3000);
		inPat.betNumberDropDown.click();
		String name = inPat.getname.getText();
		inPat.save.click();
		
	}
	
	public String assert_the_intentional_error_in_in_patient() {
		return inPat.errorMsg2.getText();
	}
	public String checkAssert() {
		return inPat.checkingName.getText();
	}
	public void sendNameToCheck(String sendNameToCheck1) {
		inPat.searchFieldToCheck.sendKeys(sendNameToCheck1);
	}
	public String getUrl() {
		return HelperClass.driver.getCurrentUrl();
	}

}

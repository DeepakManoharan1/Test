package com.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import com.locators.FrontOfficeLocators;
import com.locators.OutPatientLocators;
import com.utility.HelperClass;

public class OutPatientActions {
	OutPatientLocators op;
	public OutPatientActions() {
		this.op = new OutPatientLocators();
		PageFactory.initElements(HelperClass.getDriver(), op);
	}
	public void userEntersOp() {
		op.clickOutPatient.click();
	}
	public void PatientDetails() throws InterruptedException {
		
		op.addpatient.click();
		op.newPatient.click();
		op.patientName.sendKeys("Deepak");
		op.year.sendKeys("2023");
		op.month.sendKeys("11");
		op.day.sendKeys("23");
//		op.pno.sendKeys("9361109224");
		op.savePatient.click();
		op.apointmentDate.sendKeys(Keys.ENTER);
		op.consultantDoctor.click();
		op.Doctor.click();
		op.chargeCatogory.click();
		op.chargeCatogorySelect.click();
		op.charge.click();
		//repeat
		op.chargeCatogory.click();
		Thread.sleep(3000);
//		op.chargeCatogorySelect.click();
		op.charge.click();
		
		op.chargeDropDown.click();
		op.Appliedcharges.sendKeys("100");
		op.paidAmount.sendKeys("100");
		op.saveAndPrint.click();
		
		
	}
	public String getUrl() {
//		bill.SearchField.sendKeys("Deepak");
		return HelperClass.driver.getCurrentUrl();
	}

}

package com.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
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
	public void AddInPatientDetails() {
		inPat.addpatient.click();
		inPat.newPatient.click();
		inPat.patientName.sendKeys("Deepak");
		inPat.year.sendKeys("2023");
		inPat.month.sendKeys("11");
		inPat.day.sendKeys("23");
		inPat.savePatient.click();
		inPat.admissionDate.sendKeys(Keys.ENTER);
		inPat.consultantDoctor.click();
		inPat.consultantDoctorDropDown.click();
		Select s = new Select(inPat.betGroup);
		s.selectByIndex(1);
		inPat.betNumber.click();
		inPat.betNumberDropDown.click();
		inPat.save.click();
		
		
		
		
		
		
	}

}

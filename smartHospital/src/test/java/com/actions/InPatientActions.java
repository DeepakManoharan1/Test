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
	public String AddInPatientDetails() throws InterruptedException {
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
		Select s = new Select(inPat.betGroup);
		s.selectByIndex(1);
		Thread.sleep(3000);
		inPat.betNumber.click();
		Thread.sleep(3000);
		inPat.betNumberDropDown.click();
		String name = inPat.getname.getText();
		inPat.save.click();
		
		return name;
		
	}
	public String checkAssert() {
		return inPat.checkingName.getText();
	}
	public void sendNameToCheck(String sendNameToCheck1) {
		inPat.searchFieldToCheck.sendKeys(sendNameToCheck1);
	}

}

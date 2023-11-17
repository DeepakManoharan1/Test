package com.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.locators.FrontOfficeLocators;
import com.utility.HelperClass;

public class FrontOfficeAction {
	FrontOfficeLocators front ;
	public FrontOfficeAction() {
		this.front = new FrontOfficeLocators();
		PageFactory.initElements(HelperClass.getDriver(), front);
	}
	
	public void enterIntoTheFrontOffice() {
		front.clickFrontOffice.click();
		front.addVisitors.click();
		front.patientName.sendKeys("Deepak");
	}
	public void PurposeActions() {
		Select s = new Select(front.purpose);
		s.selectByIndex(1);
		front.pno.sendKeys("9361109224");
		front.date.click();
		front.Pickdate.click();
		front.save.click();
	}
	public String checkingUseradded() {
		front.searchBar.sendKeys("9361109224");
		return front.checking.getText();
	}
	

}

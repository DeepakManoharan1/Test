package com.actions;

import org.openqa.selenium.Keys;
import com.locators.*;
import org.openqa.selenium.support.PageFactory;

//import com.locators.BillingLocators;
import com.utility.HelperClass;

public class BillingActions {
	BillingLocators bill ;
	public BillingActions() {
		this.bill = new BillingLocators();
		PageFactory.initElements(HelperClass.getDriver(), bill);
	}
	public void ClickBillingButton() throws InterruptedException {
		bill.billingButton.click();
		Thread.sleep(3000);
		bill.opd.click();
		Thread.sleep(3000);
		bill.opdAddPatient.click();
		bill.NewPatient.click();
		bill.name.sendKeys("Deepak");
		bill.year.sendKeys("2023");
		bill.month.sendKeys("11");
		bill.day.sendKeys("11");
		bill.savePatient.click();
		bill.appointmentDate.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	
	}
	public void consultant_Doctor() throws InterruptedException {
		bill.ConsultantDoctor.click();
		Thread.sleep(3000);
		bill.doctor.click();
		bill.chargeCatogory.click();
		Thread.sleep(5000);
		bill.OPDLevelCheck.click();
		bill.charge.click();
		Thread.sleep(3000);
		//repeat
		bill.chargeCatogory.click();
		Thread.sleep(5000);
		bill.OPDLevelCheck.click();
		bill.charge.click();
		Thread.sleep(3000);
		//repeat
		bill.chargeDropDown.click();
		bill.appliedCharges.sendKeys("150");
		bill.PaidCharges.sendKeys("150");
		bill.SaveAndPrint.click();
		
		
	}
	public void Billing_final() {
//		bill.SearchField.sendKeys("Deepak");
	}
	public String getUrl() {
//		bill.SearchField.sendKeys("Deepak");
		return HelperClass.driver.getCurrentUrl();
	}
	
}

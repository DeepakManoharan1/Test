package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.locators.BillingLocators;
//import com.locators.BillingLocators;
import com.utility.HelperClass;

public class BillingActions {
	BillingLocators bill ;
	public BillingActions() {
		this.bill = new BillingLocators();
		PageFactory.initElements(HelperClass.getDriver(), bill);
	}
	public void clickBilling() {
		bill.billingButton.click();
	}
	
	public void clickOPD() throws InterruptedException {
		Thread.sleep(3000);		
		bill.opd.click();
	}
	public void AddPatient() {
		bill.opdAddPatient.click();
	}
	
	public void NewPatient() {
		bill.NewPatient.click();
	}
	
	public void mandatoryField() throws InterruptedException {
		bill.name.sendKeys("Deepak");
		bill.year.sendKeys("2023");
		bill.month.sendKeys("11");
		bill.day.sendKeys("11");
		bill.savePatient.click();
		
		
	}
	
	public void logout1() {
		HelperClass.driver.navigate().back();
		HelperClass.driver.findElement(By.xpath("(//img[@alt='User Image'])[1]")).click();
		HelperClass.driver.findElement(By.xpath("(//a[@data-toggle='tooltip']/following-sibling::a)[2]")).click();
		
	}
	public String checkingSavedOrNot() throws InterruptedException {
		return bill.ChecksavePatient.getText();
	}
	public void otherOPDdetails() throws InterruptedException {
		bill.appointmentDate.sendKeys(Keys.ENTER);
//		Thread.sleep(3000);
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(bill.ConsultantDoctor));
		bill.ConsultantDoctor.click();
//		Thread.sleep(3000);
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(bill.doctor));
		bill.doctor.click();
		bill.chargeCatogory.click();
//		Thread.sleep(5000);
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(bill.OPDLevelCheck));
		bill.OPDLevelCheck.click();
		bill.charge.click();
		Thread.sleep(3000);
		//repeat
//		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(bill.chargeCatogory));
		bill.chargeCatogory.click();
//		Thread.sleep(5000);
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(bill.OPDLevelCheck));
		bill.OPDLevelCheck.click();
		bill.charge.click();
//		Thread.sleep(3000);
		//repeat
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(bill.chargeDropDown));
		bill.chargeDropDown.click();
		bill.appliedCharges.sendKeys("150");
		//bill.PaidCharges.sendKeys("150");
		bill.SaveAndPrint.click();
		
	}
	public void missMandatoryField() throws InterruptedException {
		bill.appointmentDate.sendKeys(Keys.ENTER);
//		Thread.sleep(3000);
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(bill.ConsultantDoctor));
		bill.ConsultantDoctor.click();
//		Thread.sleep(3000);
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(bill.doctor));
		bill.doctor.click();
		bill.chargeCatogory.click();
//		Thread.sleep(5000);
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(bill.OPDLevelCheck));
		bill.OPDLevelCheck.click();
		bill.charge.click();
		
//		Thread.sleep(3000);
		//repeat
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(bill.chargeCatogory));
		bill.chargeCatogory.click();
//		Thread.sleep(5000);
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(bill.OPDLevelCheck));
		bill.OPDLevelCheck.click();
		bill.charge.click();
//		Thread.sleep(3000);
		//repeat
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(bill.chargeDropDown));
		bill.chargeDropDown.click();
		bill.appliedCharges.sendKeys("150");
		bill.SaveAndPrint.click();
	}
	
	public void SomeFeilds() {
		bill.name.sendKeys("Deepak");
		bill.savePatient.click();
	}
	
	public String getErrorMessage() throws InterruptedException {
		Thread.sleep(2000);
		return bill.ErrorMessage.getText();
	}
	public String getPaidErrorMessage() throws InterruptedException {
		Thread.sleep(2000);
		return bill.ErrorPaidMessage.getText();
	}
	public String getUrl() {
//		bill.SearchField.sendKeys("Deepak");
		return HelperClass.driver.getCurrentUrl();
	}
	
}

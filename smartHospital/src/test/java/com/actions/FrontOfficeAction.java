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
	public void enterFront() {
		front.clickFrontOffice.click();
	}

	public void Addvisitor() {
		front.addVisitors.click();
	}
	
	public void addAllFields() {
		front.patientName.sendKeys("Deepak");
		Select s = new Select(front.Asvisit);
		s.selectByIndex(1);
		front.pno.sendKeys("9361109224");
		front.date.click();
		front.Pickdate.click();
		
	}
	
	public void missFields() {
		front.patientName.sendKeys("Deepak");
		
		front.save.click();
	}
	
	public String assertfrontError() throws InterruptedException {
		Thread.sleep(2000);
		return front.errorMessage.getText();
	}
	
	public void AsInquiry() {
		front.addVisitors.click();
		front.patientName.sendKeys("Deepak");
		Select s = new Select(front.Asvisit);
		s.selectByIndex(2);
//		front.pno.sendKeys("9361109224");
		front.date.click();
		front.Pickdate.click();
	}
	
	public void AsSeminar() {
		front.addVisitors.click();
		front.patientName.sendKeys("Deepak");
		Select s = new Select(front.Asvisit);
		s.selectByIndex(3);
//		front.pno.sendKeys("9361109224");
		front.date.click();
		front.Pickdate.click();
	}
	
	public void saveVisitor() throws InterruptedException {
		front.save.click();
		Thread.sleep(2000);
	}
	


	

}

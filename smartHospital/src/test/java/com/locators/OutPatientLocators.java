package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OutPatientLocators {
	@FindBy(xpath = "//span[text()=' OPD - Out Patient']")
	public WebElement clickOutPatient;
	@FindBy(xpath = "//div[@class='box-tools addmeeting']//a[1]")
	public WebElement addpatient;
	@FindBy(xpath = "//div[contains(@class,'col-lg-2 col-md-2')]//a[1]")
	public WebElement newPatient;
	@FindBy(xpath = "((//label[text()='Name'])[2]/following::input)[1]")
	public WebElement patientName;
	@FindBy(xpath = "(//label[text()='Age (yy-mm-dd) ']/following::input)[1]")
	public WebElement year;
	@FindBy(xpath = "(//label[text()='Age (yy-mm-dd) ']/following::input)[2]")
	public WebElement month;
	@FindBy(xpath = "//input[@placeholder='Month']/following-sibling::input[1]")
	public WebElement day;
	@FindBy(xpath = "(//label[text()='Phone']/following-sibling::input)[2]")
	public WebElement pno;
	@FindBy(xpath = "//button[text()=' Save']")
	public WebElement savePatient;
	@FindBy(xpath = "(//small[@class='req']/following-sibling::input)[1]")
	public WebElement apointmentDate;	
	@FindBy(xpath = "(//span[@class='select2-selection__rendered'])[3]")
	public WebElement consultantDoctor;
	@FindBy(xpath = "(//li[@class='select2-results__option'])[1]")
	public WebElement Doctor;
	@FindBy(xpath = "(//span[@title='Select'])[2]")
	public WebElement chargeCatogory;
	@FindBy(xpath = "//li[text()[normalize-space()='OPD Consultation Fees']]")
	public WebElement chargeCatogorySelect;
	@FindBy(xpath = "(//span[@title='Select'])[2]")
	public WebElement charge;
	@FindBy(xpath = "//li[text()='Consultation Fees ']")
	public WebElement chargeDropDown;
	@FindBy(xpath = "//label[text()='Applied Charge ($)']/following-sibling::input")
	public WebElement Appliedcharges;
	@FindBy(xpath = "//label[text()='Paid Amount ($)']/following-sibling::input")
	public WebElement paidAmount;
	@FindBy(xpath = "//span[text()='Save']")
	public WebElement saveAndPrint;
}

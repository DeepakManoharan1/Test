package com.locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillingLocators {
	
	@FindBy(xpath = "//i[@class='fas fa-file-invoice']/following-sibling::span[1]")
	public
	WebElement billingButton;

	@FindBy(xpath = "(//div[@class='billingbox text-center']//a)[1]")
	public WebElement opd;
	@FindBy(xpath = "//a[contains(@class,'btn btn-primary')]")
	public WebElement opdAddPatient;
	@FindBy(xpath = "//span[text()='New Patient']")
	public WebElement NewPatient;
	@FindBy(xpath = "((//label[text()='Name'])[2]/following::input)[1]")
	public WebElement name;
	@FindBy(xpath = "(//label[text()='Age (yy-mm-dd) ']/following::input)[1]")
	public WebElement year;
	@FindBy(xpath = "(//label[text()='Age (yy-mm-dd) ']/following::input)[2]")
	public WebElement month;
	@FindBy(xpath = "//input[@id='age_month']/following-sibling::input[1]")
	public WebElement day;
	@FindBy(xpath = "//p[text()='The Age field is required.']")
	public WebElement ErrorMessage;
	@FindBy(xpath = "//button[text()=' Save']")
	public WebElement savePatient;
	@FindBy(xpath = "//button[@class='toast-close-button']/following-sibling::div[1]")
	public WebElement ChecksavePatient;
	@FindBy(xpath = "(//label[text()='Appointment Date']/following::input)[1]")
	public WebElement appointmentDate;
	@FindBy(xpath = "(//span[@class='select2-selection select2-selection--single']//span)[3]")
	public WebElement ConsultantDoctor;
	@FindBy(xpath = "//li[@class='select2-results__option select2-results__option--highlighted']/following-sibling::li[1]")
	public WebElement doctor;
	@FindBy(xpath = "(//small[@class='req']/following-sibling::input)[3]")
	public WebElement appliedCharges;
	@FindBy(xpath = "//label[text()='Paid Amount (₹)']/following-sibling::input")
	public WebElement PaidCharges;
	@FindBy(xpath = "(//span[@class='select2-selection__rendered'])[3]")
	public WebElement chargeCatogory;
	@FindBy(xpath = "//li[text()[normalize-space()='OPD Consultation Fees']]")
	public WebElement OPDLevelCheck;
	@FindBy(xpath = "//span[@title='Select']")
	public WebElement charge;
	@FindBy(xpath = "//li[text()='Consultation Fees ']")
	public WebElement chargeDropDown;
	@FindBy(xpath = "//button[@name='save']//span[1]")
	public WebElement SaveAndPrint;
	@FindBy(xpath = "//input[@type='search']")
	public WebElement SearchField;
	@FindBy(xpath = "(//tr[@role='row']//a)[1]")
	public WebElement AddedPatientList;
	@FindBy(xpath = "//p[text()='The Paid Amount field is required.']")
	public WebElement ErrorPaidMessage;
}

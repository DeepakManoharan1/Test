package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InPatientLocators {
	@FindBy(xpath = "//span[text()=' IPD - In Patient']")
	public WebElement ClickInPatient;
	@FindBy(xpath = "//div[@class='box-tools pull-right']//a[1]")
	public WebElement addpatient;
	@FindBy(xpath = "//a[@id='addpip']//span[1]")
	public WebElement newPatient;
	@FindBy(xpath = "((//label[text()='Name'])[3]/following::input)[1]")
	public WebElement patientName;
	@FindBy(xpath = "(//label[text()='Age (yy-mm-dd) ']/following::input)[1]")
	public WebElement year;
	@FindBy(xpath = "//input[@class='form-control patient_age_month']")
	public WebElement month;
	@FindBy(xpath = "//input[@placeholder='Month']/following-sibling::input[1]")
	public WebElement day;
	@FindBy(xpath = "(//button[text()=' Save'])[2]")
	public WebElement savePatient;
	@FindBy(xpath = "//label[text()='Admission Date']/following-sibling::input")
	public WebElement admissionDate;
	@FindBy(xpath = "(//span[@class='select2-selection__rendered'])[3]")
	public WebElement consultantDoctor;
	@FindBy(xpath = "(//ul[@id='select2-consultant_doctor-results']//li)[2]")
	public WebElement consultantDoctorDropDown;
	@FindBy(xpath = "//select[@name='bed_group_id']")
	public WebElement betGroup;
	@FindBy(xpath = "(//span[@title='Select'])[3]")
	public WebElement betNumber;
	@FindBy(xpath = "(//li[@role='treeitem'])[2]")
	public WebElement betNumberDropDown;
	@FindBy(xpath = "(//div[@class='pull-right']//button)[3]")
	public WebElement save;
}

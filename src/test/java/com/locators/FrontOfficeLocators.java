package com.locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FrontOfficeLocators {
	@FindBy(xpath = "//span[text()='Front Office']")
	public WebElement clickFrontOffice;
	@FindBy(xpath = "(//div[@class='box-tools pull-right']//a)[1]")
	public WebElement addVisitors;
	
	@FindBy(xpath = "(//small[@class='req']/following-sibling::input)[2]")
	public WebElement patientName;
	@FindBy(xpath = "(//small[@class='req']/following-sibling::select)[2]")
	public WebElement purpose;
	@FindBy(xpath = "(//label[text()='Phone']/following-sibling::input)[2]")
	public WebElement pno;
	@FindBy(xpath = "(//label[text()='Date']/following-sibling::input)[2]")
	public WebElement date;
	@FindBy(xpath = "//td[text()='23']")
	public WebElement Pickdate;
	@FindBy(xpath = "(//div[@class='modal-footer']//button)[2]")
	public WebElement save;
	@FindBy(xpath = "//input[@type='search']")
	public WebElement searchBar;
	@FindBy(xpath = "//td[text()='9361109224']")
	public WebElement checking;
	
}

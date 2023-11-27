package com.actions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.locators.BillingLocators;
import com.utility.HelperClass;

public class BillingActions {
	BillingLocators bill ;
	Actions act = new Actions(HelperClass.getDriver());
	JavascriptExecutor js = (JavascriptExecutor) HelperClass.getDriver();
	WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(15));
	public BillingActions() {
		this.bill = new BillingLocators();
		PageFactory.initElements(HelperClass.getDriver(), bill);
	}
	public void  clickUserLogin() {
		bill.login.click();
	}
	public void clickSignIn() {
		act.moveToElement(bill.signIn).click().perform();
	}
	public void clickRadiology() {
		bill.radiology.click();
	}
	public String verifyRadiology() {
		return bill.assertRadiology.getText();
	}
	public void setBillNo(String Billno) {
		bill.search1.sendKeys(Billno);
	}
	public void downloadPdf() {
		bill.pdf.click();
	}
	public void clickAmbulance() {
		bill.ambulance.click();
	}
	public String verifyAmbulance() {
		return bill.assertAmbulance.getText();
	}
	public void clickPay() {
		bill.pay.click();
	}
	public void clickAdd() {
		bill.add.click();
	}
	public void clickPayCard() {
		bill.payCard.click();
		HelperClass.getDriver().switchTo().frame(0);
	}
	public void setEmail(String Email){
		bill.email.sendKeys(Email);
	}
	public void setCardNumber(String CardNumber) {
		bill.cardNumber.sendKeys(CardNumber);	
	}
	public void setExpiry(String Expiry) {
		bill.expiry.sendKeys(Expiry);
	}
	public void setCVC(String CVC) {
		bill.cvc.sendKeys(CVC);
	}
	public void setzip(String zip) {
		bill.zip.sendKeys(zip);
	}
	public void clickPayment() {
		wait.until(ExpectedConditions.elementToBeClickable(bill.payment)).click();
		bill.payment.click();
		HelperClass.getDriver().switchTo().parentFrame();
	}
	public void verifyText() {
		bill.assertText.getText();
	}
	public void clickBloodBank() {
		bill.bloodBank.click();
	}
	public void clickComponentIssue() {
		bill.componentIssue.click();
	}
	public void setComponent(String Component) {
		bill.search2.sendKeys(Component);
	}
	public void clickWhatsApp() {
		bill.whatsapp.click();
	}
	public void clickMember() {
		bill.member.click();
	}
	public void setMessage(String Message) {
		bill.message.sendKeys(Message);
	}
	public void clickButton() {
		bill.send.click();
	}
	public void clickProfile() {
		bill.profile.click();
	}
	public void clickLogOut() {
		bill.logout.click();
	}
	
	public void actions(String BillNo,String Component,String Message,String CVC,String CardNumber,String Email,String zip,String Expiry) throws InterruptedException {
		this.setBillNo(BillNo);
		this.setComponent(Component);
		this.setMessage(Message);
		this.setCardNumber(CardNumber);
		this.setCVC(CVC);
		this.setEmail(Email);
		this.setExpiry(Expiry);
		this.setzip(zip);
	}
	
}

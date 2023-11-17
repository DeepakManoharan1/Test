package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocators {
	@FindBy(xpath="//a[contains(.,'User Login')]")
	private
	WebElement clickuserLogin;
	@FindBy(xpath="//div[@class='form-group']/following-sibling::button[1]")
	private
	WebElement clicksignIn;
	public WebElement getClicksignIn() {
		return clicksignIn;
	}
	public void setClicksignIn(WebElement clicksignIn) {
		this.clicksignIn = clicksignIn;
	}
	public WebElement getClickuserLogin() {
		return clickuserLogin;
	}
	public void setClickuserLogin(WebElement clickuserLogin) {
		this.clickuserLogin = clickuserLogin;
	}
	}



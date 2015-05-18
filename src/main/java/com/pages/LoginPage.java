package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;

@DefaultUrl("http://172.22.4.88:9090")
public class LoginPage extends PageObject {

	@FindBy(id = "_58_login")
	private WebElement inputUsername;

	@FindBy(id = "_58_password")
	private WebElement inputPassword;

	@FindBy(css = "[type='submit']")
	private WebElement clickSignin;


	public void inputUsername(String username) {
		inputUsername.sendKeys(username);
	}

	public void inputPassword(String password) {
		inputPassword.sendKeys(password);
	}

	public void inputUsernameMaster(String username) {
		inputUsername.sendKeys(username);
	}

	public void inputPasswordMaster(String password) {
		inputPassword.sendKeys(password);
	}

	public void clickSignin() {
		clickSignin.click();
	}

}
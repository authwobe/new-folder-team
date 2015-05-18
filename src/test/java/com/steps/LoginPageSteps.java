package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.LoginPage;
import com.pages.VacationPage;

@SuppressWarnings("serial")
public class LoginPageSteps extends ScenarioSteps {

	LoginPage LoginPage;
	VacationPage vacationPage;

	@Step
	public void is_the_loginPage() {
		LoginPage.open();
	}

	@Step
	public void inputUsername(String username) {
		LoginPage.inputUsername(username);
	}

	@Step
	public void inputPassword(String password) {
		LoginPage.inputPassword(password);
	}

	@Step
	public void clickSignin() {
		LoginPage.clickSignin();
	}

	@Step
	public void clickVacationButton() {
		vacationPage.clickVacationButton();
		
	}

	@Step
	public void inputUsernameMaster(String username) {
		LoginPage.inputUsernameMaster(username);
	}

	@Step
	public void inputPasswordMaster(String password) {
		LoginPage.inputPasswordMaster(password);
	}

}
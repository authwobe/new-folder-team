package com;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.LoginPageSteps;
import com.steps.MyFreeDaysSteps;
import com.steps.VacationMenuSteps;

@SuppressWarnings("deprecation")
@RunWith(ThucydidesRunner.class)
public class MyFreeDaysTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.22.4.88:9090/login")
	public Pages pages;

	@Steps
	public LoginPageSteps loginPageSteps;
	@Steps
	public VacationMenuSteps vacationMenuSteps;
	@Steps
	public MyFreeDaysSteps myFreeDaysSteps;

	@Test
	public void calculate_given_days_test() {
		loginPageSteps.is_the_loginPage();
		loginPageSteps.inputUsername("mihai.mindrutescu1");
		loginPageSteps.inputPassword("12345");
		loginPageSteps.clickSignin();
		loginPageSteps.clickVacationButton();
		vacationMenuSteps.clickMyFreeDays();
		myFreeDaysSteps.MyFreeDaysPage();
		
	}

}
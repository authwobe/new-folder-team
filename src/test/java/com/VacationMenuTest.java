package com;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.LoginPageSteps;
import com.steps.VacationMenuSteps;

@RunWith(SerenityRunner.class)
public class VacationMenuTest {
	@Managed(uniqueSession = true)
    public WebDriver webdriver;
	@ManagedPages(defaultUrl = "http://172.22.4.88:9090/login")
    public Pages pages;
	
	@Steps
	public LoginPageSteps loginPageSteps;
	@Steps
	public VacationMenuSteps vacationMenuSteps;
	
	@Test
	public void vacationMenuTest() {
		loginPageSteps.is_the_loginPage();
		loginPageSteps.inputUsername("mihai.ionce1");
		loginPageSteps.inputPassword("123456");
		loginPageSteps.clickSignin();
	    loginPageSteps.clickVacationButton();
	    vacationMenuSteps.clickNewRequest();
	    vacationMenuSteps.clickMyRequest();
	    vacationMenuSteps.clickMyFreeDays();
	    vacationMenuSteps.clickFreeDaysHistory();
	    vacationMenuSteps.clickVacationTracker();
	    vacationMenuSteps.clickInbox();
	    vacationMenuSteps.clickViewVacations();
	    vacationMenuSteps.clickVacationReport();
	}
	
	
}

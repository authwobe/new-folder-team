package com;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.google.protobuf.TextFormat.ParseException;
import com.steps.LoginPageSteps;
import com.steps.NewVacationRequestSteps;
import com.steps.VacationMenuSteps;

@SuppressWarnings("deprecation")
@RunWith(ThucydidesRunner.class)
public class ReadMailTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.22.4.88:9090/login")
	public Pages pages;

@Steps
public LoginPageSteps loginPageSteps;
@Steps
public VacationMenuSteps vacationMenuSteps;
@Steps
public NewVacationRequestSteps newVacation;


@Test
	public void create_vacation_request() throws ParseException, java.text.ParseException {
		loginPageSteps.is_the_loginPage();
		loginPageSteps.inputUsername("mihai.mindrutescu1");
		loginPageSteps.inputPassword("12345");
		loginPageSteps.clickSignin();
		loginPageSteps.clickVacationButton();
		vacationMenuSteps.clickNewRequest();
		newVacation.start_create_vacation();
        newVacation.click_start_date();
        newVacation.selectStartDate(9, 8, 2015 );
        newVacation.click_end_date();
        newVacation.selectEndDate(9, 9, 2015);
        newVacation.vacation_type();
        newVacation.vacation_type_holiday();
        newVacation.save_your_vacation();
        newVacation.should_see_message("Your request completed successfully. ");
        
		
   }

}
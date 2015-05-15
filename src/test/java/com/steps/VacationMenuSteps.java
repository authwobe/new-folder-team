package com.steps;
import com.pages.LoginPage;
import com.pages.VacationMenu;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class VacationMenuSteps extends ScenarioSteps {

	VacationMenu VacationMenu;

	
	@Step
	public void clickNewRequest() {
		VacationMenu.clickNewRequest();	
	}
	@Step
	public void clickMyRequest() {
		VacationMenu.clickMyRequest();
	}
	@Step
	public void clickMyFreeDays() {
		VacationMenu.clickFreeDays();
	}
	@Step
	public void clickFreeDaysHistory() {
		VacationMenu.clickFreeDaysHistory();
	}
	@Step
	public void clickVacationTracker() {
		VacationMenu.clickVacationTracker();
	}
	@Step
	public void clickInbox() {
		VacationMenu.clickInbox();
	}
	@Step
	public void clickViewVacations() {
		VacationMenu.clickViewvacation();
	}
	@Step
	public void clickVacationReport() {
		VacationMenu.clickVacationReport();
	}
}


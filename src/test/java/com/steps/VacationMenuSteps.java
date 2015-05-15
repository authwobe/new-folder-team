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
	public void clickMyRequest() {
		VacationMenu.clickMyRequest();
	}
	
	public void clickMyFreeDays() {
		VacationMenu.clickFreeDays();
	}
	public void clickFreeDaysHistory() {
		VacationMenu.clickFreeDaysHistory();
	}
	public void clickVacationTracker() {
		VacationMenu.clickVacationTracker();
	}
	public void clickInbox() {
		VacationMenu.clickInbox();
	}
	public void clickViewVacations() {
		VacationMenu.clickViewvacation();
	}
	public void clickVacationReport() {
		VacationMenu.clickVacationReport();
	}
}

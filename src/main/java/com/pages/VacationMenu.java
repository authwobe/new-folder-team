package com.pages;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import ch.lambdaj.function.convert.Converter;

public class VacationMenu extends PageObject{

	@FindBy(css="a[href='menuItem=new-request']")
	private WebElement newRequest;
	
	@FindBy(css="a[href='menuItem=my-request']")
	private WebElement myRequest;
	
	@FindBy(css="a[href='menuItem=my-free-days']")
	private WebElement myFreeDays;
	
	@FindBy(css="a[href='menuItem=free-days-history']")
	private WebElement freeDaysHistory;
	
	@FindBy(css="a[href='menuItem=vacation-tracker']")
	private WebElement vacationTracker;
	
	@FindBy(css="a[href='menuItem=inbox']")
	private WebElement inbox;
	
	@FindBy(css="a[href='menuItem=view-vacations']")
	private WebElement viewVacation;
	
	@FindBy(css="a[href='menuItem=vacation-report']")
	private WebElement vacationReport;
	
	public void clickNewRequest() {
		newRequest.click();
	}
	public void clickMyRequest() {
		myRequest.click();
	}
	public void clickFreeDays() {
		myFreeDays.click();
	}
	public void clickFreeDaysHistory() {
		freeDaysHistory.click();
	}
	public void clickVacationTracker() {
		vacationTracker.click();
	}
	public void clickInbox() {
		inbox.click();
	}
	public void clickViewvacation() {
		viewVacation.click();
	}
	public void clickVacationReport() {
		vacationReport.click();
	}
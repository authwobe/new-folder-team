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
	
	
}

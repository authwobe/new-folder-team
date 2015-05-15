package com.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class VacationPage extends PageObject{

	@FindBy(css = "a[href='http://172.22.4.88:9090/vacation']")
	private WebElement clickVacationButton;
	
	
	public void clickVacationButton() {
		element(clickVacationButton).waitUntilVisible();
		clickVacationButton.click();
	}

}

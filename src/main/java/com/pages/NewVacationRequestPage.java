package com.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class NewVacationRequestPage extends PageObject {

	@FindBy(css="a[href*='vacationTypeChoice']")
	private WebElement vacationReport;

	
	
//	public void markOption(String optionName){
//		element(vacationTypeContainer).waitUntilVisible();
//		List<WebElement> optionsList = vacationTypeContainer.findElements(By.cssSelector("vacationTypeChoice"));
//		for(WebElement elementNow:optionList){
//			String elementText = elementNow.getText();
//			   System.out.println("Element: "  + elementText);
//			   if(elementText.contains(optionName)){
//			    elementNow.findElement(By.cssSelector("input[type='checkbox']")).click();
//			    break;
//		}
//		}
//	}
//	
//	public void clickNewRequest() {
//		element(newRequest).waitUntilVisible();
//		newRequest.click();
//	}
//	
//	
}
    

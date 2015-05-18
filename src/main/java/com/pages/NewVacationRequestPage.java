package com.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

import org.junit.Assert;

public class NewVacationRequestPage extends PageObject {

 @FindBy(css = "a[href*='menuItem=new-request']")
 private WebElementFacade vacationRequestButton;

 @FindBy(id = "_evovacation_WAR_EvoVacationportlet_startDate")
 private WebElementFacade startDateButton;

 @FindBy(name = "startDate")
 private WebElementFacade startDate;

 @FindBy(id = "_evovacation_WAR_EvoVacationportlet_endDate")
 private WebElementFacade endDateButton;

 @FindBy(name = "endDate")
 private WebElementFacade endDate;

 @FindBy(css = ".vacationType")
 private WebElementFacade vacationTypeMenu;

 @FindBy(id = "_evovacation_WAR_EvoVacationportlet_type_CO")
 private WebElementFacade holidayButton;

 @FindBy(id = "_evovacation_WAR_EvoVacationportlet_saveButton")
 private WebElementFacade saveButton;

 
// @FindBy(css = "div.portlet-msg-success")
 @FindBy(css = "div.portlet-msg-errora")
 private WebElementFacade messageOk;

 public void lookup_terms() {
  vacationRequestButton.click();
 }

 public void lookup_terms2() {
  startDateButton.click();
 }

 public void clickOnStartDate() {
  element(startDate).waitUntilVisible();
  startDate.click();
 }

 public void lookup_terms3() {
  endDateButton.click();
 }

 public void clickOnEndDate() {
  element(endDate).waitUntilVisible();
  endDate.click();

 }

 public void choose_vacation_type() {
  vacationTypeMenu.click();
 }

 public void choose_holiday() {
  vacationTypeMenu.click();
 }

 public void press_button_save() {
  saveButton.click();
 }

 public String message_ok() {
  element(messageOk).waitUntilVisible();
  String messageText = messageOk.getText();
  
  return messageText;
 }
 
 public void should_see_message(String definition) {
  String actualDefinition = message_ok();
        Assert.assertTrue("fail", actualDefinition.contentEquals(definition));
 }
}
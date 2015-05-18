 package com.steps;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.google.protobuf.TextFormat.ParseException;
import com.pages.CalendarPage;
import com.pages.NewVacationRequestPage;

public class NewVacationRequestSteps extends ScenarioSteps {

 NewVacationRequestPage vacationRequestPage;
 CalendarPage calendarPage;

 @Step
 public void start_create_vacation() {
  vacationRequestPage.lookup_terms();
 }

 @Step
 public void click_start_date() {
  vacationRequestPage.lookup_terms2();
 }

 @Step
 public void selectStartDate(int month, int day, int year)
   throws ParseException, java.text.ParseException {
  vacationRequestPage.lookup_terms2();
  calendarPage.setDate(month, day, year);
 }

 @Step
 public void click_end_date() {
  vacationRequestPage.lookup_terms3();
 }

 @Step
 public void selectEndDate(int month, int day, int year) {
  vacationRequestPage.lookup_terms3();
  calendarPage.setDate(month, day, year);
 }

 @Step
 public void vacation_type() {
  vacationRequestPage.choose_vacation_type();
 }

 @Step
 public void vacation_type_holiday() {
  vacationRequestPage.choose_holiday();
 }

 @Step
 public void save_your_vacation() {
  vacationRequestPage.press_button_save();
 }

 @Step
 public void should_see_message(String definition) {
  vacationRequestPage.should_see_message(definition);
        
  
 }
 
}
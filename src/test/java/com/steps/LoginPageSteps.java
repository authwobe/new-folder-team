package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.LoginPage;

@SuppressWarnings("serial")
public class LoginPageSteps extends ScenarioSteps {

 LoginPage LoginPage;
 
 @Step
 public void is_the_loginPage(){
	 LoginPage.open();
 }
 @Step
 public void inputUsername(String username){
	 LoginPage.inputUsername(username);
 }
 @Step	
 public void inputPassword (String password){
	 LoginPage.inputPassword(password);
 }
 @Step
 public void clickSignin () {
	 LoginPage.clickSignin();
	 waitABit(3000);
 }
 @Step
 public void clickVacationButton () {
	 LoginPage.clickVacationButton();
 }
 

 
 
}
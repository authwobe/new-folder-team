package com.steps;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.pages.LoginPage;
import com.pages.MyFreeDaysPage;
import com.pages.VacationMenu;
import com.steps.LoginPageSteps;
import com.steps.VacationMenuSteps;

@SuppressWarnings("serial")
public class MyFreeDaysSteps extends ScenarioSteps {

 LoginPage LoginPage;
 VacationMenu VacationMenu;
 MyFreeDaysPage MyFreeDaysPage;
 
 
     @Step
     public void CheckSumOfTotalAvailableFreeDaysLeft (){
    	 MyFreeDaysPage.CheckSum(); 
     }
     
}













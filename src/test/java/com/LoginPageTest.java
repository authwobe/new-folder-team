package com;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.LoginPageSteps;

@SuppressWarnings("deprecation")
@RunWith(ThucydidesRunner.class)

public class LoginPageTest {
   @Managed(uniqueSession = true)
     public WebDriver webdriver;

     @ManagedPages(defaultUrl = "http://172.22.4.88:9090/login")
     public Pages pages;
     
     @Steps
     public LoginPageSteps LoginPageSteps;

     
     @Test
     public void login_test(){
     LoginPageSteps.is_the_loginPage();
     LoginPageSteps.inputUsername("mihai.mindrutescu1");
     LoginPageSteps.inputPassword("12345");
     LoginPageSteps.clickSignin();
     LoginPageSteps.clickVacationButton();
     }
     
}
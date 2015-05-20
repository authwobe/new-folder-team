package com.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class MyFreeDaysPage extends PageObject {

    @FindBy(css=".my-free-days-table tr td:nth-child(2)")
    private List<WebElement> tableValues;
    
    public int getStartBonusDays() {
        return Integer.parseInt(tableValues.get(0).getText());
    }
    
    public void CheckSum(){
    	int sum=0;
    	int taken=Integer.parseInt(tableValues.get(4).getText());
    	int total=Integer.parseInt(tableValues.get(5).getText());
    	Boolean equals =false;
    	for( int i=0;i<4;i++){	
    		int vacdays=Integer.parseInt(tableValues.get(i).getText());
    		sum=sum+vacdays;	
    	}
    	if(sum-taken==total){
			equals=true;
			Assert.assertTrue("The ammount of days is correct",equals);   } 			
		else
			{
			Assert.assertFalse("The ammount of days is incorrect", equals);
			}
		}
    	
    }

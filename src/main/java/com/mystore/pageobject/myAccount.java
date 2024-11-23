package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myAccount 
{
	   WebDriver ldriver;
	      
	      public myAccount(WebDriver rdriver)
	      {
	    	  ldriver=rdriver;
	    	  PageFactory.initElements(rdriver, this);
	    	
	    	  
	      }
	      @FindBy(id="email_create")
	      WebElement createEmailId;
	      
	      @FindBy(id="SubmitCreate")
	      WebElement submitCreate;
	      
	      public void enterCreateEmailaddress(String emailAdd)
	      {
	    	  createEmailId.sendKeys(emailAdd);
	      }
	      
	      
	      public void clickSubmitCreate() 
	      {
	    	  submitCreate.click();
	      }
	      
}

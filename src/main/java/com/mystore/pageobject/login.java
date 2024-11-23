package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login 
{
  WebDriver ldriver;
      
      public login(WebDriver rdriver)
      {
    	  ldriver=rdriver;
    	  PageFactory.initElements(rdriver, this);
      }  
      
      @FindBy(id="email")
      WebElement LoginEmailId;
      
      @FindBy(id="passwd")
      WebElement LoginPassword;
      
      @FindBy(id="SubmitLogin")
      WebElement LoginSignInButton;
      
      public void loginEmailAddress(String email) 
      {
    	  LoginEmailId.sendKeys(email);
      }
      
      public void loginPassword(String email) 
      {
    	  LoginPassword.sendKeys(email);
      }
      
      public void loginSignIn() 
      {
    	  LoginSignInButton.click();
      }
}


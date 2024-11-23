package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class accountCreationPage 
{
	 WebDriver ldriver;
	 
	 public accountCreationPage(WebDriver rdriver)
     {
   	  ldriver=rdriver;
   	  PageFactory.initElements(rdriver, this);
   	 }
	 
	 @FindBy(id="uniform-id_gender1")
	 WebElement Title;
	 
	 @FindBy(id="customer_firstname")
	 WebElement CustomerFirstName;
	 
	 @FindBy(id="customer_lastname")
	 WebElement CustomerLastName;
	 
	 @FindBy(id="passwd")
	 WebElement CustomerPassword;
	 
	 @FindBy(id="newsletter")
	 WebElement Checkbox;
	 
	 @FindBy(id="submitAccount")
	 WebElement RegisterButton;
	 
	  public void clickTitleButton() 
      {
    	  Title.click();
      }
	  
	  public void customerFName(String FirstName) 
      {
		  CustomerFirstName.sendKeys(FirstName);
      }
	  
	  public void customerLName(String LastName) 
      {
		  CustomerLastName.sendKeys(LastName);
      }
	  
	  public void password(String pwd) 
      {
		  CustomerPassword.sendKeys(pwd);
      }
	  
	  
	  public void checkBox() 
      {
		  Checkbox.click();
      }
	  
	  public void registerButton() 
      {
		  RegisterButton.click();
      }
}

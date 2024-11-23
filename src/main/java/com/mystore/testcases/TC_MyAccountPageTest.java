package com.mystore.testcases;

import org.testng.annotations.Test;

import com.mystore.pageobject.accountCreationPage;
import com.mystore.pageobject.indexpage;
import com.mystore.pageobject.login;
import com.mystore.pageobject.myAccount;

public class TC_MyAccountPageTest extends BaseClass
{
	@Test
    public void verifyRegistrationandLogin() 
    {
    	driver.get(url);
    	indexpage pg=new indexpage(driver);
    	pg.clickOnSignIn();
    	myAccount myAcpg=new myAccount(driver);
    	 myAcpg.enterCreateEmailaddress("aslesrpandey87@gmail.com");
    	myAcpg.clickSubmitCreate();
    	
    	/*accountCreationPage acp =new accountCreationPage(driver);
    	 acp.clickTitleButton();
    	 acp.customerFName("Asles");
    	 acp.customerLName("Pandey");
    	 acp.password("Asles@123");
    	 acp.checkBox();
    	 acp.registerButton();*/
    	 
    	login lg= new login(driver);
    	lg.loginEmailAddress("aslesrpandey87@gmail.com");
    	lg.loginPassword("Asles@123");
    	lg.loginSignIn();
    }
}

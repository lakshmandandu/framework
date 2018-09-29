package com.orangeHRM.qa.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHRM.qa.base.Test1;
import com.orangeHRM.qa.pages.LoginPage;



public class LoginPageTest extends Test1 {

	LoginPage lp;
	boolean status;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void initialize() throws InterruptedException
	{
		initialization();
		lp=new LoginPage();
		
		
	}
	

	@Test
	public void verifyElements()
	{
		verifyStatus(lp.VerifyUN());
		verifyStatus(lp.VerifyPwd());
		verifyStatus(lp.VerifybtnLogin());
		
	}
	@Test
	public void VerifyUserlogin() throws InterruptedException
	{
		//Click on register link
		lp = new LoginPage();
		//lp.ClickonElement("Submit");
		
		//Thread.sleep(10000);
		status = lp.login("UserName", "Password");
		Assert.assertTrue(status);
	}
	
	
	@AfterMethod
	public void close()
{
		closeApp();
}
	
	public void verifyStatus(boolean status)
	{
		Assert.assertTrue(status);
	}
	
}

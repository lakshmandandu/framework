package com.orangeHRM.qa.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.qa.base.Test1;

public class LoginPage extends Test1{

	@FindBy(name="txtUsername")
	WebElement userName;
	
	@FindBy(name="txtPassword")
	WebElement password;
	
	@FindBy(name="Submit")
	WebElement btnLogin;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//UserName
	public boolean VerifyUN()
	{
		return userName.isDisplayed();
	}
	
	//Password
	public boolean VerifyPwd()
	{
		return password.isDisplayed();
	}
	
	//Login button
	public boolean VerifybtnLogin()
	{
		return btnLogin.isDisplayed();
	}
	public boolean login(String UserName,String Password)
	{
		userName.sendKeys(UserName);
		password.sendKeys(Password);
		btnLogin.click();
		return true;
	
	}
		

	
	
}

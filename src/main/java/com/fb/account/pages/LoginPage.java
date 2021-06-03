package com.fb.account.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.account.base.SetupBase;

public class LoginPage extends  SetupBase{
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(name="login")
	WebElement login;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public  HomePage loginToFb()
	{
		username.sendKeys("horet18832@64ge.com");
		password.sendKeys("5504812nammI");
		login.click();
		
		return new HomePage();
	}
	
	

}

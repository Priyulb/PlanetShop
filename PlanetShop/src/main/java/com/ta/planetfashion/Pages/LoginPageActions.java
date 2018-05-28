package com.ta.planetfashion.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.ta.planetfashion.Config.UIActions;
import com.ta.planetfashion.Page.Objects.LoginPageObjects;
import com.ta.planetfashion.base.Base;

public class LoginPageActions extends Base {

	public LoginPageActions() {
		PageFactory.initElements(driver,LoginPageObjects.class);
	}

	public DashboardPageActions CustomerLogin(String UserName,String Password) {
			LoginPageObjects.registeredEmail.sendKeys(UserName);
		LoginPageObjects.registeredPassword.sendKeys(Password);
		UIActions.fn_click(LoginPageObjects.loginButton);
		return new DashboardPageActions();
			
	}

}

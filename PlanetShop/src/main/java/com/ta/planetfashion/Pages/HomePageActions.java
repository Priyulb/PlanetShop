package com.ta.planetfashion.Pages;


import com.ta.planetfashion.base.Base;

import org.openqa.selenium.support.PageFactory;

import com.ta.planetfashion.Config.*;
import com.ta.planetfashion.Page.Objects.HomePageObjects;


public class HomePageActions extends Base{

	// initializing the objects of this page
	public HomePageActions() {
		PageFactory.initElements(driver,HomePageObjects.class);
	}
	
	//Click on cutomer account and navigate to login Page
	public LoginPageActions Navigate_LoginPage()
	{
		
		UIActions.fn_click(HomePageObjects.customerAccount);
		return new LoginPageActions();
	}
}

package com.qa.planetfashion.test;

import org.testng.annotations.Test;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;

import com.ta.planetfashion.Config.UIActions;
import com.ta.planetfashion.DataMgnt.DataManagement;
import com.ta.planetfashion.Pages.HomePageActions;
import com.ta.planetfashion.Pages.LoginPageActions;
import com.ta.planetfashion.base.Base;


public class LoginTest extends Base {
	HomePageActions HomePageActions;
	LoginPageActions LoginPageActions;
	String sheetName = "User_Credentials";
	
	public LoginTest() throws IOException {
		super();
		
	}
	
@BeforeMethod
public void setup() {
	initilize();
	HomePageActions = new HomePageActions();
	LoginPageActions = new LoginPageActions();
	}

@Test (priority=1)
public void LoginPageTitleTest() 

     {
	HomePageActions.Navigate_LoginPage();
	
	String LoginPageTitle= UIActions.getTitle();;
	System.out.println(LoginPageTitle);
	Assert.assertEquals(LoginPageTitle,"Create New Customer Account");
     }


@DataProvider
public Object[][] getLoginTestData(){
	Object data[][] = DataManagement.getTestData(sheetName);
	return data;
}

@Test (priority=2 ,dataProvider="getLoginTestData")
public void CustomerLoginTest(String Username,String Password) throws InterruptedException {
		
	HomePageActions.Navigate_LoginPage();
	LoginPageActions.CustomerLogin(Username,Password);
		
	String DashboardTitle= UIActions.getTitle();
	System.out.println(DashboardTitle);
	Assert.assertEquals(DashboardTitle,"My Account");
}


@AfterMethod
public void close()
{
 driver.quit();
 
 
}


}

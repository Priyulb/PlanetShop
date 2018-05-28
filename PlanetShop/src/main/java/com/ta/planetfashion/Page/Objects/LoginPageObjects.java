package com.ta.planetfashion.Page.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;


public class LoginPageObjects {
	
	
	// Registered Email
	@FindAll ({@FindBy (xpath = ".//*[@id=\"email-r\"]"),@FindBy(name = "login[username]")})
	public static WebElement registeredEmail;
    
	//Registered Pwd
 	@FindBy (id = "pass-r")
	public static WebElement registeredPassword;

	//Forget your Password link
	@FindBy (linkText = "Forgot Your Password?")
	public static WebElement forgetYourPassword;
	
	//login button
	
	@FindBy (id = "send2")
	public static WebElement loginButton;
	
	//New customer Registration
	
	
	@FindBy(id = "firstname")
	public static WebElement firstName;
	
	@FindBy(id = "lastname")
	public static WebElement lastName;
	
	@FindBy(id = "email_address")
	public static WebElement newEmail;
	
	@FindBy(id = "dob")
	public static WebElement dob;
	
	@FindBy(id = "password")
	public static WebElement password;
	
	@FindBy(id = "confirmation")
	public static WebElement confirmPassword;	
	
	@FindBy (xpath = "//button[@title='Register']")
	public static WebElement registerButton;
	
	//Registration different messages
	
		
	@FindBy (xpath = ".//div[@class='global-messages']/ul/li/ul/li/i/span")
	public static WebElement alreadyRegisteredMsg;
	
	@FindBy (xpath = ".//span[contains(text(),'Thank you for registering')]")
	public static WebElement successfullyRegisteredMsg;	
	

}
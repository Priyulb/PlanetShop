package com.ta.planetfashion.Page.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects  {
    
	//Company Logo
	@FindBy (xpath = ".//*[@class='logo h-icon']")
	public static WebElement companyLogo;
	
	//Search Icon
	@FindBy (id = "search")
	public static WebElement searchItem;
	
	@FindBy (xpath = ".//*[@id='customer_login_link']/i")
	public static WebElement customerAccount;
	
	@FindBy (xpath = "//i[@class='icon-wishlist font-biggest']")
	public static WebElement wishList;
	
	@FindBy (xpath = ".//*[@class = 'top-cart-wrapper']/i")
	public static WebElement userCart;
	
	@FindBy (xpath = ".//span[contains(text(),'Streetwear')]")
	public static WebElement categoryStreetwear;
	
	
}
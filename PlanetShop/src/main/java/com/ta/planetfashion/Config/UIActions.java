package com.ta.planetfashion.Config;



import org.openqa.selenium.WebElement;
import com.ta.planetfashion.base.Base;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

public class UIActions extends Base {
	
	 // function to take screenshot		
	
		public static void takeScreenshot(String fileWithPath) throws IOException 
		
		{
			 TakesScreenshot scrShot =((TakesScreenshot)driver);
			 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			 
			//File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
						
		        //Move image file to new destination

	        File DestFile=new File(fileWithPath);
	        	
	        //Copy file at destination

	        FileUtils.copyFile(SrcFile, DestFile);
		}

		
		
	//function to click on a web-element
	
	public static void fn_click(WebElement we) 
	{
		if(we.isDisplayed()==true)
		{
			if(we.isEnabled())
			{
				//System.out.println(Hooks.scenario.getName() + " -> " + "click element: " +  we.getText());	
				we.click();
			}
			else
			{
				System.out.println("WebElement " + we + "is not enabled and can't be clicked");	
			}
		}
		else
		{
			System.out.println( "WebElement " + we + "is not displayed");	
		}
	
			
	}
	
		
		//function to return the title of webpage
	public static String getTitle()
	{
		
		return  driver.getTitle();
	}
	

 	
	}


package com.guru99.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}


	//Using FindBy for locating elements
	@FindBy(how=How.XPATH, using="//input[@type='text']") WebElement Username;
	@FindBy(how=How.XPATH, using="//input[@type='password']") WebElement Password;
	@FindBy(how=How.XPATH, using="//input[@name='btnLogin']") WebElement Login_Btn;
	@FindBy(how= How.XPATH,using = "//input[@type='reset']") WebElement Reset_Btn;



	//Actions

	public String validatetitle(){
		String title =driver.getTitle();
		return title;

	}
	public void login(String un, String pwd){
		Username.sendKeys(un);
		Password.sendKeys(pwd);

		Login_Btn.click();
		
		
	}
}
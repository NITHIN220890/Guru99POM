package com.guru99.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {


	WebDriver driver;
	public HomePage(WebDriver driver){
		this.driver=driver;
	}
	@FindBy(how=How.XPATH,using= "/html/body/div[3]/div/ul/li[2]/a") WebElement New_Customer;
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/ul/li[3]/a")WebElement Edit_Customer;
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/ul/li[4]/a")WebElement Delete_Customer;
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/ul/li[5]/a")WebElement New_Account;



	//Actions

	public void click_NewCustomer(){
		New_Customer.click();
		System.out.println("customer click was perfomed");
	}
}

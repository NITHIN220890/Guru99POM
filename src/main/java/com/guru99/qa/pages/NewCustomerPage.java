package com.guru99.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewCustomerPage {
	
	WebDriver driver;
	public NewCustomerPage(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using= "//input[@type='text' and @name='name']") WebElement Customer_Name;
	@FindBy(how=How.XPATH,using= "//input[@type='radio' and @name='rad1' and @value='f']") WebElement Gender_female;
	@FindBy(how=How.XPATH,using= "//input[@type='radio' and @name='rad1' and @value='m']") WebElement Gender_male;
	@FindBy(how=How.XPATH,using= "//input[@type='date' and @name='dob']") WebElement Dob;
	@FindBy(how=How.XPATH,using="/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea") WebElement Address;
	@FindBy(how=How.XPATH,using="//input[@name='city']") WebElement City;
	@FindBy(how=How.XPATH,using="//input[@name='state']") WebElement State;
	@FindBy(how=How.XPATH,using="//input[@name='pinno']") WebElement Pin;
	@FindBy(how=How.XPATH,using="//input[@name='telephoneno']") WebElement Mobile;
	@FindBy(how=How.XPATH,using="//input[@name='emailid']") WebElement Email;
	@FindBy(how=How.XPATH,using="//input[@name='password']") WebElement Password;
	@FindBy(how=How.XPATH,using="//input[@type='submit']") WebElement Submit;
	@FindBy(how=How.XPATH,using="//input[@type='reset']") WebElement Reset;

	
public void Fill_form() throws InterruptedException{
Customer_Name.sendKeys("Nithin");
Gender_male.click();
Dob.sendKeys("22081990");
Address.sendKeys("Ramapuram Chh");
City.sendKeys("Chennai");
State.sendKeys("TamilNadu");
Pin.sendKeys("600089");
Mobile.sendKeys("8825121979");
Email.sendKeys("nitinkarthick.22@gmail.com");

Password.sendKeys("Siechem@1223");
Submit.click();
Thread.sleep(2000);
System.out.println("successfully clicked");
Alert alert = driver.switchTo().alert();		
String alertMessage= driver.switchTo().alert().getText();		
System.out.println(alertMessage);	
Thread.sleep(5000);
alert.accept();	
System.out.println("Alert Message handled");


}

}


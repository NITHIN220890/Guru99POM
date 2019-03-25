package com.guru99.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.guru99.qa.base.TestBase;
import com.guru99.qa.pages.HomePage;
import com.guru99.qa.pages.LoginPage;
import com.guru99.qa.pages.NewCustomerPage;

public class LoginTest extends TestBase {
	

	@BeforeMethod
	public void initial_Setup() throws IOException{
		initialize();
		driver = new ChromeDriver(); 
		//To maximize browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/V4/");
	}
		
		@Test
		public void tc_01(){
			System.out.println("driver");
			
		}

		@Test
		public void tc_02(){
			LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
			String title =lp.validatetitle();
			Assert.assertEquals(title,"Guru 99");
			
		}
		@Test
		public void tc_03() throws InterruptedException{
			LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
			HomePage hp = PageFactory.initElements(driver, HomePage.class);
			NewCustomerPage ncp = PageFactory.initElements(driver, NewCustomerPage.class);
			lp.login(prop.getProperty("username"),prop.getProperty("password"));
			Thread.sleep(5000);
			hp.click_NewCustomer();
			ncp.Fill_form();
			Thread.sleep(10000);
		}
			@AfterMethod
			public void closure(){
				driver.quit();
			}

}

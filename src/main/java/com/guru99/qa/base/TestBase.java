package com.guru99.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	public static Properties  prop;
	public static WebDriver driver = null;
	@BeforeSuite
	public void initialize() throws IOException{
		
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\nitin\\workspace\\Guru99PomExample\\src\\main\\java\\com\\guru99\\qa\\config\\config.properties");
		prop.load(ip);
		String BrowserName =prop.getProperty("browser");
		System.out.println(BrowserName);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nitin\\Desktop\\chromedriver.exe");	
		/*driver.manage().deleteAllCookies();*/
		/*driver = new ChromeDriver(); 
		//To maximize browser
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
*/


	}

	@AfterSuite
	//Test cleanup
	public void TeardownTest()
	{
		TestBase.driver.quit();
	}


}



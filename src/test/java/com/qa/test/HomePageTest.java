package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;

public class HomePageTest extends TestBase{
	HomePage homepage;
	
	public HomePageTest() {
		super(); // to call properties from TestBase class
	}

	@BeforeMethod
	public void setUp() {
		initialization(); // calling initialization method from TestBase class
		homepage = new HomePage();
	}
	
	@Test(priority = 0)
	public void selectDepartingAndArrivingCity() {
		homepage.ClickDepartureCity(prop.getProperty("DepartingCity"));
		homepage.ClickDestinationCity(prop.getProperty("ArrivingCity"));
		homepage.ClickFindFlightTab();
		String flights = driver.getTitle();
		Assert.assertEquals(flights, "BlazeDemo - reserve");
	}
	
	@Test(priority = 1)
	public void checkTravelTheWorldLink() {
		homepage.ClickTravelTheWorldLink();
		String samePage = driver.getTitle();
		Assert.assertEquals(samePage, "BlazeDemo");
	}
	
	@Test(priority = 2)
	public void checkHomeLink() {
		homepage.ClickHomeLink();
		String loginPage = driver.getTitle();
		Assert.assertEquals(loginPage, "BlazeDemo");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
}

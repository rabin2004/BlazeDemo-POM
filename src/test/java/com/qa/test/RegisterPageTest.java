package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.RegisterPage;

public class RegisterPageTest extends TestBase{
	
	RegisterPage registerpage;
	HomePage homepage;
	
	public RegisterPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		registerpage = new RegisterPage();
		homepage = new HomePage();
	}
	
	@Test (priority = 0)
	public void checkPageTitle() {
		homepage.ClickHomeLink();
		registerpage.clickRegister();
		String title = registerpage.RegisterPageTitle();
		Assert.assertEquals(title, "BlazeDemo");
	}

	
	@Test (priority = 1)
	public void inputValueToRegister() {
		homepage.ClickHomeLink();
		registerpage.clickRegister();
		registerpage.inputName(prop.getProperty("name"));
		registerpage.inputCompany(prop.getProperty("company"));
		registerpage.inputEmail(prop.getProperty("email"));
		registerpage.inputPassword(prop.getProperty("password"));
		registerpage.inputConfirmPassword(prop.getProperty("password"));
		registerpage.clickRegisterBtn();
		WebElement title = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[1]"));
		Assert.assertEquals(title, "Login");
	}
	
	@Test (priority = 2)
	public void clickLoginLink() {
		homepage.ClickHomeLink();
		registerpage.clickRegister();
		registerpage.clickLogin();
		WebElement title = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[1]"));
		Assert.assertEquals(title, "Login");
	}
	
	@Test (priority = 3)
	public void clickRegisterLink() {
		homepage.ClickHomeLink();
		registerpage.clickRegister();
		registerpage.clickRegister();
		WebElement title = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[1]"));
		Assert.assertEquals(title, "Register");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class RegisterPage extends TestBase {

	@FindBy (id = "name")
	WebElement Name;
	
	@FindBy (id = "company")
	WebElement Company;
	
	@FindBy (id = "email")
	WebElement Email;
	
	@FindBy (id = "password")
	WebElement Password;
	
	@FindBy (id = "password-confirm")
	WebElement ConfirmPassword;
	
	@FindBy (xpath = "//button[@type='submit']")
	WebElement RegisterBtn;
	
	@FindBy (linkText = "Login")
	WebElement Login;
	
	@FindBy (linkText = "Register")
	WebElement Register;
	
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String RegisterPageTitle() {
		return driver.getTitle();
	}
	
	public void inputName(String name) {
		Name.sendKeys(name);
	}
	
	public void inputCompany(String company) {
		Company.sendKeys(company);
	}
	
	public void inputEmail(String email) {
		Email.sendKeys(email);
	}
	
	public void inputPassword(String password) {
		Password.sendKeys(password);
	}
	
	public void inputConfirmPassword(String password) {
		ConfirmPassword.sendKeys(password);
	}
	
	public void clickRegisterBtn() {
		RegisterBtn.click();
	}
	
	public void clickLogin() {
		Login.click();
	}
	
	public void clickRegister() {
		Register.click();
	}
}

package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(linkText ="destination of the week! The Beach!")
	WebElement DestinationOfTheWeek;

	@FindBy(name = "fromPort")
	WebElement DepartureCity;
	
	@FindBy(name ="toPort")
	WebElement DestinationCity;
	
	@FindBy(xpath ="//input[@value='Find Flights']")
	WebElement FindFlightTab;
	
	@FindBy(linkText ="Travel The World")
	WebElement TravelTheWorldLink;
	
	@FindBy(linkText ="home")
	WebElement HomeLink;
	
	@FindBy(xpath ="/html/body/div[2]/div/h1")
	WebElement HomePageTitleText;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnDestinationOfTheWeekLink() {
		DestinationOfTheWeek.click();
	}
	
	public void ClickDepartureCity(String DepartingCity) {
		Select select = new Select(DepartureCity);
		select.selectByVisibleText(DepartingCity);
	}
	
	public void ClickDestinationCity(String ArrivingCity) {
		Select select = new Select(DestinationCity);
		select.selectByVisibleText(ArrivingCity);
	}
	
	public void ClickFindFlightTab() {
		FindFlightTab.click();
	}
	
	public void ClickTravelTheWorldLink() {
		TravelTheWorldLink.click();
	}
	
	public void ClickHomeLink() {
		HomeLink.click();
	}
	
	public boolean GetHomePageTitleText() {
		return HomePageTitleText.isDisplayed();
	}
	
	
	
}

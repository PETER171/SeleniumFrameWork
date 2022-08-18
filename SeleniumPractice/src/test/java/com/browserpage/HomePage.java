package com.browserpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath = "//a[@id='navbtn_tutorials']")
	private WebElement htmlElement;
	
	
	public void clickHTMLElement() {
		htmlElement.click();
	}

}

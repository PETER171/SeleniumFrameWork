package com.browserpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;

	//Elements

	//Home SignIn Button
	By homeSignIn = By.xpath("//a[contains(text(),'Sign in')]");
	//Login Elements

	//Sign in Email Input Box
	By emailLogin = By.xpath("//input[@id='email']");

	//Sign in Password Input Box
	By passwordLogin = By.xpath("//input[@id='passwd']");

	//Sign in button
	By signButtonLogin = By.xpath("//span[contains(.,'Sign in')]");

	//Create Account
	//Email Input
	By createEmail = By.xpath("//input[@id='email_create']");

	//Create Account Button
	By createAccButton = By.xpath("//span[contains(.,'Create an account')]");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	//Home Page Sign In Clicked
	public void clickHomeSignIn() {
		driver.findElement(homeSignIn).click();
	}

	//Click Login in Button
	public void clickSignButton() {
		driver.findElement(signButtonLogin).click();
	}

	public void  clickCreateButton(){driver.findElement(createAccButton).click();}


	public void enterEmailAddressLogin(String value){
		driver.findElement(emailLogin).sendKeys(value);
	}

	public void enterPasswordLogin(String value){
		driver.findElement(passwordLogin).sendKeys(value);
	}

	public  void enterCreateEmail(String value){ driver.findElement(createEmail).sendKeys(value);}
}

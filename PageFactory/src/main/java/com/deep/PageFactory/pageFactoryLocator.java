package com.deep.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pageFactoryLocator {
	  static WebDriver driver;
	 
	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	protected static WebElement SignIN;

	@FindBy(id = "email_create")
	protected static WebElement create_email;

	@FindBy(id = "SubmitCreate")
	protected WebElement Submit;

	public WebElement getSignIN() {
		return SignIN;
	}

	public WebElement getCreate_email() {
		return create_email;
	}

	public WebElement getSubmit() {
		return Submit;
	}
	
 
}

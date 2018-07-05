package com.deep.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class zohoSignUpLocater {

	WebDriver driver;

	public By signup = By.xpath("//a[@class='zh-signup']");

	public By emailfield = By.id("emailfield");

	public By password = By.id("password");

	public By checkbox = By.id("signup-termservice");

	public By signupbtn = By.id("signupbtn");

	public By country_DD = By.id("country");

}

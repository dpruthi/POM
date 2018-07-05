package com.deep.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class zohoSignUppage extends zohoSignUpLocater {

	static WebDriver driver = new ChromeDriver();
	static Select select;

	public void loadURL() throws InterruptedException {
		driver.get("https://www.zoho.com/");
	}

	public void fillFields() {

		driver.findElement(emailfield).sendKeys("deep@yopmail.com");
		driver.findElement(password).sendKeys("deep@yopmailcom");

	}

	public void selectCountry() {
		zohoSignUppage.selectDropDownByVisibility(driver.findElement(country_DD), "Canada");
	}

	public static void selectDropDownByVisibility(WebElement element, String visiblity) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		select = new Select(element);
       	select.selectByVisibleText(visiblity);

	}
	
	public void checkBox() {
		driver.findElement(checkbox).click();
		}

	public void signUpButtn() {

		driver.findElement(signupbtn).click();
	}

	public void explicitWait_Click(By locater) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(locater));
		ele.click();

	}

	public void explicitWait_Visible(By locater) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locater));
		
	}

}

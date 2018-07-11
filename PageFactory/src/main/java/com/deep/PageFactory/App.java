package com.deep.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Hello world!
 *
 */
public class App  
{   static WebDriver driver;

	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	public static WebElement SignIN;
	
	@FindBy(id = "email_create")
	public static WebElement create_email;

	@FindBy(id = "SubmitCreate")
	public static WebElement Submit;


    public static void main( String[] args ) throws InterruptedException
    {	
    	/*pageFactoryLocator page = PageFactory.initElements(driver, pageFactoryLocator.class);
    	pageFactoryLocator ref = new pageFactoryLocator();
    	pageFactoryFunction ref3 = new pageFactoryFunction();*/
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\deepak.pruthi\\eclipse-workspace\\PageFactory\\src\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		 PageFactory.initElements(driver, App.class);

    	
    	//ref3.loadUrl();
    	Thread.sleep(6000);
        SignIN.click();
        create_email.sendKeys("tefhfgnhnst@yopmail.com");
        Submit.click();
 
        
  
    	
    }
}

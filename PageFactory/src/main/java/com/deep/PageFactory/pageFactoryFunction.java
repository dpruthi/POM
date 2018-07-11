package com.deep.PageFactory;



import org.openqa.selenium.chrome.ChromeDriver;

public class pageFactoryFunction extends pageFactoryLocator{
	
	
	pageFactoryLocator ref = new pageFactoryLocator();
	
	public void loadUrl() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\deepak.pruthi\\eclipse-workspace\\PageFactory\\src\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

	}
	
	public void SignIn() {

		
		}
}




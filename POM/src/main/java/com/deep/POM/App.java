package com.deep.POM;

public class App {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"\\C:\\Users\\deepak.pruthi\\eclipse-workspace\\autoGithub\\src\\ChromeDriver\\chromedriver.exe\\");

		zohoSignUppage ref = new zohoSignUppage();
		zohoSignUpLocater refr = new zohoSignUpLocater();

		ref.loadURL();
		ref.explicitWait_Click(refr.signup);
		ref.fillFields();
		ref.selectCountry();
		ref.checkBox();
		ref.signUpButtn();
	}
}

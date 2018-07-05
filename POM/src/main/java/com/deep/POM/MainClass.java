package com.deep.POM;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"\\C:\\Users\\deepak.pruthi\\eclipse-workspace\\autoGithub\\src\\ChromeDriver\\chromedriver.exe\\");

		zohoSignUppageFunction zohoSignUppageClass_ref = new zohoSignUppageFunction();
		zohoSignUpLocater zohoSignUpLocaterClass_ref = new zohoSignUpLocater();

		zohoSignUppageClass_ref.loadURL();
		zohoSignUppageClass_ref.explicitWait_Click(zohoSignUpLocaterClass_ref.signup);
		zohoSignUppageClass_ref.fillFields();
		zohoSignUppageClass_ref.selectCountry();
		zohoSignUppageClass_ref.checkBox();
		zohoSignUppageClass_ref.signUpButtn();
	}
}

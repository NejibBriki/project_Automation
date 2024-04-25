package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class RegisterUserWithInvalidMailPage extends BasePage{
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Email Address already exist!']")
	private static WebElement errorMsg;
	
	public RegisterUserWithInvalidMailPage() {
		super(Setup.getDriver());
	}

	
	public static WebElement getErrorMsg() {
		return errorMsg;
	}
}

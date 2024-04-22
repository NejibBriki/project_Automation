package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class SigninPage extends BasePage {
	
	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Login to your account']")
	private static WebElement msgPageLogin;
	
	@FindBy(how = How.XPATH, using = "//input[@data-qa='login-email']")
	private static WebElement email;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
	private static WebElement passworrd;
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Login']")
	private static WebElement btnLogin;
	
	@FindBy(how = How.XPATH, using = " //*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a/b")
	private static WebElement nameLoged;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Your email or password is incorrect!']")
	private static WebElement errorMsg;
	
	
	
	
	
	public SigninPage() {
		super(Setup.getDriver());
	}
	
	
	public static WebElement getMsgPageLogin() {
		return msgPageLogin;
	}

	
	public static WebElement getEmail() {
		return email;
	}
	
	
	public static WebElement getPassworrd() {
		return passworrd;
	}
	
	
	public static WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public static WebElement getNameLoged() {
		return nameLoged;
	}
	
	
	public static WebElement getErrorMsg() {
		return errorMsg;
	}
	
	

}

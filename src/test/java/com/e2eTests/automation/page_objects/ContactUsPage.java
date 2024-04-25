package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class ContactUsPage extends BasePage {
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Contact us']")
	private static WebElement contactBtn;
	
	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Get In Touch']")
	private static WebElement msgVerif;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Name']")
	private static WebElement name;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Email']")
	private static WebElement email;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Subject']")
	private static WebElement subject;
	
	@FindBy(how = How.XPATH, using = "//textarea[@id='message']")
	private static WebElement msgTxt;
	
	
	
	@FindBy(how = How.XPATH, using = "//input[@name='upload_file']")
	private static WebElement uploadFile;
	
	@FindBy(how = How.XPATH, using = "//input[@name='submit']")
	private static WebElement SubmitBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@class='status alert alert-success']")
	private static WebElement successMsg;
	
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Home']")
	private static WebElement homeBtn;
	
	
	public ContactUsPage() {
		super(Setup.getDriver());
	}

	public static WebElement getContactBtn() {
		return contactBtn;
	}
	
	public static WebElement getMsgVerif() {
		return msgVerif;
	}
	
	public static WebElement getName() {
		return name;
	}
	
	public static WebElement getEmail() {
		return email;
	}
	
	public static WebElement getSubject() {
		return subject;
	}
	
	public static WebElement getMsgTxt() {
		return msgTxt;
	}
	
	public static WebElement getUploadFile() {
		return uploadFile;
	}
	
	public static WebElement getSubmitBtn() {
		return SubmitBtn;
	}
	
	public static WebElement getSuccessMsg() {
		return successMsg;
	}
	
	public static WebElement getHomeBtn() {
		return homeBtn;
	}
}

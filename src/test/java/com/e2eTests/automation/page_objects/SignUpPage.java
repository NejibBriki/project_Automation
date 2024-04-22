package com.e2eTests.automation.page_objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class SignUpPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Signup / Login']")
	private static WebElement btnLogin;
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Signup']")
	private static WebElement btnSignUp;
	
	
	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='New User Signup!']")
	private static WebElement newUserSignUp;
	
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Name']")
	private static WebElement name;
	
	@FindBy(how = How.XPATH, using = "//input[@data-qa='signup-email']")
	private static WebElement email;
	
	@FindBy(how = How.XPATH, using = "//b[normalize-space()='Enter Account Information']")
	private static WebElement accountInfo;
	
	@FindBy(how = How.XPATH, using = "//input[@id='id_gender1']")
	private static WebElement title;
	

	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	private static WebElement password;
	
	@FindBy(how = How.XPATH, using = "//select[@id='days']")
	private static WebElement day;
	
	@FindBy(how = How.XPATH, using = "//select[@id='months']")
	private static WebElement month;
	
	@FindBy(how = How.XPATH, using = "//select[@id='years']")
	private static WebElement year;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='newsletter']")
	private static WebElement newlester;
	
	@FindBy(how = How.XPATH, using = "//input[@id='optin']")
	private static WebElement receiveOffre;
	
	@FindBy(how = How.XPATH, using = "//input[@id='first_name']")
	private static WebElement firstNanme;
	
	@FindBy(how = How.XPATH, using = "//input[@id='last_name']")
	private static WebElement lastName;
	
	@FindBy(how = How.XPATH, using = "//input[@id='company']")
	private static WebElement company;
	
	@FindBy(how = How.XPATH, using = "//input[@id='address1']")
	private static WebElement adresse;
	
	@FindBy(how = How.XPATH, using = "//input[@id='address2']")
	private static WebElement adress2;
	
	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	private static WebElement state;
	
	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	private static WebElement city;
	
	@FindBy(how = How.XPATH, using = "//input[@id='zipcode']")
	private static WebElement zipCode;
	
	@FindBy(how = How.XPATH, using = "//input[@id='mobile_number']")
	private static WebElement tel;
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Create Account']")
	private static WebElement createAccountBtn;
	
	@FindBy(how = How.XPATH, using = "//b[normalize-space()='Account Created!']")
	private static WebElement msgAccountCreated;
	
	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	private static WebElement continuBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a/b")
	                                 //*[@id="header"]/div/div/div/div[2]/div/ul/li[10]/a/b
	private static WebElement nameLoged;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Delete Account']")
	private static WebElement deleteBtn;
	
	
	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	private static WebElement finishBtn;
	
	@FindBy(how = How.XPATH, using = "//b[normalize-space()='Account Deleted!']")
	private static WebElement deleteMsg;
	
	public SignUpPage() {
		super(Setup.getDriver());
	}

	public static WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public static WebElement getBtnSignUp() {
		return btnSignUp;
	}
	
	public static WebElement getName() {
		return name;
	}
	
	public static WebElement getNewUserSignUp() {
		return newUserSignUp;
	}
	
	public static WebElement getEmail() {
		return email;
	}
	
	public static WebElement getAccountInfo() {
		return accountInfo;
	}
	
	public static WebElement getTitle() {
		return title;
	}
	
	public static WebElement getPassword() {
		return password;
	}
	
	public static WebElement getDay() {
		return day;
	}
	
	public static WebElement getMonth() {
		return month;
	}
	
	public static WebElement getYear() {
		return year;
	}
	
	public static WebElement getNewlester() {
		return newlester;
	}
	
	public static WebElement getReceiveOffre() {
		return receiveOffre;
	}
	
	public static WebElement getFirstName() {
		return firstNanme;
	}
	
	public static WebElement getLastName() {
		return lastName;
	}
	
	public static WebElement getCompany() {
		return company;
	}
	
	public static WebElement getAdresse() {
		return adresse;
	}
	
	public static WebElement getAdresse2() {
		return adress2;
	}
	
	public static WebElement getState() {
		return state;
	}
	
	public static WebElement getCity() {
		return city;
	}
	
	public static WebElement getZipCode() {
		return zipCode;
	}
	
	public static WebElement getTel() {
		return tel;
	}
	
	public static WebElement getCreateAccountBtn() {
		return createAccountBtn;
	}
	
	public static WebElement getMsgAccountCreated() {
		return msgAccountCreated;
	}
	
	public static WebElement getContinuBtn() {
		return continuBtn;
	}
	
	public static WebElement getNameLoged() {
		return nameLoged;
	}
	
	public static WebElement getDeleteBtn() {
		return deleteBtn;
	}
	
	public static WebElement getFinishBtn() {
		return finishBtn;
	}
	
	public static WebElement getDeleteMsg() {
		return deleteMsg;
	}
}

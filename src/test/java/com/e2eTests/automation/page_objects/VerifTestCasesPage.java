package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class VerifTestCasesPage extends BasePage {
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Test Cases')]")
	private static WebElement testCasesBtn;
	
	public VerifTestCasesPage() {
		super(Setup.getDriver());
	}
	
	public static WebElement getTestCasesBtn() {
		return testCasesBtn;
	}

}

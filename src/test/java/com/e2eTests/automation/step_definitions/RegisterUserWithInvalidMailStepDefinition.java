package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.RegisterUserWithInvalidMailPage;

import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Validations;

import io.cucumber.java.en.Then;

public class RegisterUserWithInvalidMailStepDefinition {

	public RegisterUserWithInvalidMailPage registerUserWithInvalidMailPage;

	public Validations validations;
	public SeleniumUtils seleniumUtils;

	public RegisterUserWithInvalidMailStepDefinition() {
		registerUserWithInvalidMailPage = new RegisterUserWithInvalidMailPage();
		validations = new Validations();
		seleniumUtils = new SeleniumUtils();

	}

	@Then("je verifie Email Address already exist! est visible")
	public void jeVerifieEmailAddressAlreadyExistEstVisible() {
		validations.isElementDisplayed(RegisterUserWithInvalidMailPage.getErrorMsg());
	}

}

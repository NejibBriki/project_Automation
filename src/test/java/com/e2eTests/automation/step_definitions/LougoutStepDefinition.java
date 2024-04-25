package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.LogoutPage;

import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Validations;


import io.cucumber.java.en.When;

public class LougoutStepDefinition {
	
	public LogoutPage logoutPage;
	
	public Validations validations;
	public SeleniumUtils seleniumUtils;

	public LougoutStepDefinition() {
		logoutPage = new LogoutPage();
		validations = new Validations();
		seleniumUtils = new SeleniumUtils();

	}

	@When("je clique sur logout")
	public void jeCliqueSurLogout() {
		seleniumUtils.click(LogoutPage.getLogoutBtn());
	}
	




}

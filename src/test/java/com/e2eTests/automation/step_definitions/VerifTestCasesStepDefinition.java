package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.VerifTestCasesPage;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Validations;

import io.cucumber.java.en.*;

public class VerifTestCasesStepDefinition {

	public VerifTestCasesPage verifTestCasesPage;

	public Validations validations;
	public SeleniumUtils seleniumUtils;
	public ConfigFileReader configFileReader;

	public VerifTestCasesStepDefinition() {
		verifTestCasesPage = new VerifTestCasesPage();
		validations = new Validations();
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		validations = new Validations();

	}

	@When("je clique sur le bouton test cases")
	public void jeCliqueSurLeBoutonTestCases() {
		seleniumUtils.click(VerifTestCasesPage.getTestCasesBtn());
	}

	@Then("je verifie si je navigue sur la page de test cases")
	public void jeVerifieSiJeNavigueSurLaPageDeTestCases() {
		validations.checkChangedURL(configFileReader.getProperties("testcases.Url"));
	}

}

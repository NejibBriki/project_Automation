package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.SigninPage;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninStepDefinition {

	public SigninPage signinPage;
	public ConfigFileReader configFileReader;
	public Validations validations;
	public SeleniumUtils seleniumUtils;

	public SigninStepDefinition() {
		signinPage = new SigninPage();
		validations = new Validations();
		seleniumUtils = new SeleniumUtils();

	}

	@Then("page de connexion est bien affiche")
	public void pageDeConnexionEstBienAffiche() {
		validations.isElementDisplayed(SigninPage.getMsgPageLogin());
	}

	@When("je saisis une adresse mail valide {string}")
	public void jeSaisisUneAdresseMailValide(String email) {
		seleniumUtils.writeText(SigninPage.getEmail(), email);
	}

	@When("je saisi un password valide {string}")
	public void jeSaisiUnPasswordValide(String password) {
		seleniumUtils.writeText(SigninPage.getPassworrd(), password);
	}

	@When("je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		seleniumUtils.click(SigninPage.getBtnLogin());
	}

	@Then("je verifie si je suis bien connecté")
	public void jeVerifieSiJeSuisBienConnecté() {
		validations.assertEquals(SigninPage.getNameLoged(), "nejib");
	}
	
	
	

	@When("je saisis une adresse mail non valide {string}")
	public void jeSaisisUneAdresseMailNonValide(String email) {
		seleniumUtils.writeText(SigninPage.getEmail(), email);
	}
	@When("je saisi un password non valide {string}")
	public void jeSaisiUnPasswordNonValide(String password) {
		seleniumUtils.writeText(SigninPage.getPassworrd(), password);
	}
	@Then("je verifie si Your email or password is incorrect!' est visible")
	public void jeVerifieSiYourEmailOrPasswordIsIncorrectEstVisible() {
		validations.isElementDisplayed(SigninPage.getErrorMsg());
	}




}

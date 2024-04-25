package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.ContactUsPage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Validations;

import io.cucumber.java.en.*;

public class ContactUsStepDefinition {

public ContactUsPage contactUsPage;
	
	public Validations validations;
	public SeleniumUtils seleniumUtils;

	public ContactUsStepDefinition() {
		contactUsPage = new ContactUsPage();
		validations = new Validations();
		seleniumUtils = new SeleniumUtils();

	}
	

	@When("Je clique sur bouton  contact")
	public void jeCliqueSurBoutonContact() {
		seleniumUtils.click(ContactUsPage.getContactBtn());
	}
	@Then("verifier GET IN TOUCH est visible")
	public void verifierGETINTOUCHEstVisible() {
		validations.isElementDisplayed(ContactUsPage.getMsgVerif());
	}
	@When("je saisis le nom {string}")
	public void jeSaisisLeNom(String nom) {
		seleniumUtils.writeText(ContactUsPage.getName(), nom);
	}
	@When("je saisi le mail {string}")
	public void jeSaisiLeMail(String email) {
		seleniumUtils.writeText(ContactUsPage.getEmail(), email);
	}
	@When("je saisi le sujet {string}")
	public void jeSaisiLeSujet(String subject) {
		seleniumUtils.writeText(ContactUsPage.getSubject(), subject);
	}
	@When("je saisi le message {string}")
	public void jeSaisiLeMessage(String message) {
		seleniumUtils.writeText(ContactUsPage.getMsgTxt(), message);
	}
	@When("je telecharge un fichier {string}")
	public void jeTelechargeUnFichier(String path) {
		seleniumUtils.writeText(ContactUsPage.getUploadFile(), path);
	}
	@When("je clique sur le bouton submit")
	public void jeCliqueSurLeBoutonSubmit() {
		seleniumUtils.click(ContactUsPage.getSubmitBtn());
	}
	@When("je clique sur le bouton OK")
	public void jeCliqueSurLeBoutonOK() {
		seleniumUtils.acceptAlert();
	}
	@Then("je verifie Success! Your details have been submitted successfully. est visible")
	public void jeVerifieSuccessYourDetailsHaveBeenSubmittedSuccessfullyEstVisible() {
		validations.isElementDisplayed(ContactUsPage.getMsgVerif());
	}
	@When("je clique sur Home")
	public void jeCliqueSurHome() {
		seleniumUtils.click(ContactUsPage.getHomeBtn());
	}



}

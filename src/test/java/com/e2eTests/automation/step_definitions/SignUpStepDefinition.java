package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.SignUpPage;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.SelectFromListUtils;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;
import com.e2eTests.automation.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpStepDefinition {

	public SignUpPage signUpPage;
	public ConfigFileReader configFileReader;
	public Validations validations;
	public SeleniumUtils seleniumUtils;
	public SelectFromListUtils selectFromListUtils;

	public SignUpStepDefinition() {
		signUpPage = new SignUpPage();
		configFileReader = new ConfigFileReader();
		validations = new Validations();
		seleniumUtils = new SeleniumUtils();
		selectFromListUtils = new SelectFromListUtils();
	}

	@Given("Je visite l'application automationexercise")
	public void jeVisiteLApplicationAutomationexercise() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));

	}

	@Then("page home est bien affiche")
	public void pageHomeEstBienAffiche() {
		 validations.checkChangedURL(configFileReader.getProperties("home.url"));
		
	}

	@When("Je clique sur bouton  Login")
	public void jeCliqueSurBoutonLogin() {
		seleniumUtils.click(SignUpPage.getBtnLogin());
	}

	@Then("page de creation est bien affiche")
	public void pageDeCreationEstBienAffiche() {
		validations.isElementDisplayed(SignUpPage.getNewUserSignUp());
	}

	@When("Je saisis le nom {string}")
	public void jeSaisisLeNom(String nom) {
		seleniumUtils.writeText(SignUpPage.getName(), nom);
	}

	@When("Je saisis le mail {string}")
	public void jeSaisisLeMail(String email) {
		seleniumUtils.writeText(SignUpPage.getEmail(), email);
	}

	@When("je clique su Signup")
	public void jeCliqueSuSignup() {
		seleniumUtils.click(SignUpPage.getBtnSignUp());
	}

	@Then("je verifie si ENTER ACCOUNT INFORMATION est visible")
	public void jeVerifieSiENTERACCOUNTINFORMATIONEstVisible() {

		validations.isElementDisplayed(SignUpPage.getAccountInfo());

	}

	@When("je clique sur Mr")
	public void jeCliqueSurMr() {

		seleniumUtils.click(SignUpPage.getTitle());

	}

	@When("Je saisis le password {string}")
	public void jeSaisisLePassword(String password) {

		seleniumUtils.writeText(SignUpPage.getPassword(), password);

	}

	@When("je saisis uen date d'anniversaire")
	public void jeSaisisUenDateDAnniversaire() {

		selectFromListUtils.selectDropDownListByVisibleText(SignUpPage.getDay(), "24");
		selectFromListUtils.selectDropDownListByVisibleText(SignUpPage.getMonth(), "December");
		selectFromListUtils.selectDropDownListByVisibleText(SignUpPage.getYear(), "1988");

	}

	@When("je clique sur Sign up for our newsletter!")
	public void jeCliqueSurSignUpForOurNewsletter() {

		seleniumUtils.click(SignUpPage.getNewlester());

	}

	@When("je clique sur Receive special offers from our partners")
	public void jeCliqueSurReceiveSpecialOffersFromOurPartners() {

		seleniumUtils.click(SignUpPage.getNewlester());

	}

	@When("Je saisis le first name  {string}")
	public void jeSaisisLeFirstName(String firstName) {
		
		seleniumUtils.writeText(SignUpPage.getFirstName(), firstName);

	}

	@When("Je saisis le last name {string}")
	public void jeSaisisLeLastName(String lastName) {
		seleniumUtils.writeText(SignUpPage.getLastName(), lastName);

	}

	@When("Je saisis company {string}")
	public void jeSaisisCompany(String company) {
		
		seleniumUtils.writeText(SignUpPage.getCompany(), company);

	}

	@When("Je saisis Adresse  {string}")
	public void jeSaisisAdresse(String adresse) {
		
		seleniumUtils.writeText(SignUpPage.getAdresse(), adresse);

	}

	@When("Je saisis Adresse {int}  {string}")
	public void jeSaisisAdresse(Integer int1, String adresse2) {
		seleniumUtils.writeText(SignUpPage.getAdresse2(), adresse2);

	}

	@When("Je saisis State {string}")
	public void jeSaisisState(String state) {
		
		seleniumUtils.writeText(SignUpPage.getState(), state);

	}

	@When("Je saisis City   {string}")
	public void jeSaisisCity(String city) {
		seleniumUtils.writeText(SignUpPage.getCity(), city);

	}

	@When("Je saisis ZipCode {string}")
	public void jeSaisisZipCode(String zipCode) {
		
		seleniumUtils.writeText(SignUpPage.getZipCode(), zipCode);

	}

	@When("Je saisis Number Mobile {string}")
	public void jeSaisisNumberMobile(String tel) {
		
		seleniumUtils.writeText(SignUpPage.getTel(), tel);

	}

	@When("je clique sur Create Account button")
	public void jeCliqueSurCreateAccountButton() {
		seleniumUtils.click(SignUpPage.getCreateAccountBtn());

	}

	@Then("je verifie le message ACCOUNT CREATED! si il est visible")
	public void jeVerifieLeMessageACCOUNTCREATEDSiIlEstVisible() {
		
		validations.isElementDisplayed(SignUpPage.getMsgAccountCreated());

	}

	@When("je clique sur Continue")
	public void jeCliqueSurContinue() {
		
		seleniumUtils.click(SignUpPage.getContinuBtn());

	}

	@Then("je verifie si Logged in as username est visible")
	public void jeVerifieSiLoggedInAsUsernameEstVisible() {
		
		validations.assertEquals(SignUpPage.getNameLoged(), "nejib");

	}

	@When("je clique sur Delete Account")
	public void jeCliqueSurDeleteAccount() {
		seleniumUtils.click(SignUpPage.getDeleteBtn());

	}

	@Then("je verifie le message ACCOUNT DELETED!")
	public void jeVerifieLeMessageACCOUNTDELETED() {
		
		validations.isElementDisplayed(SignUpPage.getDeleteMsg());

	}

	@Then("je clique continue")
	public void jeCliqueContinue() {
		
		seleniumUtils.click(SignUpPage.getFinishBtn());

	}

}

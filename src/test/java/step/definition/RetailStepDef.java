package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPage;

public class RetailStepDef extends Base {
	
	RetailPage retailPage = new RetailPage();
	 
	@Given("user is on retail website")
	public void user_is_on_retail_website() {
	Assert.assertTrue(retailPage.isTestEnvironmentLogoPresent());
	logger.info("user is on retail website");
		
	}
	
	@When("user click on myAccount")
	public void user_click_on_myAccount() {
	retailPage.clickOnMyAccount();
	logger.info("user clicked on myAccount");
	}
	
	@And("user click on Login option")
	public void user_click_on_Login_option() {
	retailPage.clickOnLoginOption();
	logger.info("user clicked on login option");
	}
	
	@And("user enter userName {string} and password {string}")
	public void user_enter_userName_and_password(String email, String pass) {
	retailPage.enterUserNameAndPassword( email, pass);
	logger.info("user entered "+email+ " and "+ pass);
	}
	
	@And("user click on Login button")
	public void user_click_on_Login_button() {
	retailPage.clickOnLoginButton();
	logger.info("user clicked on Login button");
	}
	
	@Then("user should be logged into myAccount page")
	public void user_should_be_logged_into_myAccount_page() {
	Assert.assertTrue(retailPage.isMyAccountValidationPresent());	
	logger.info("user is on My Account page");
		
	}
	
	@When("User click on Register for an Affiliate Account link")
	public void User_click_on_Register_for_an_Affiliate_Account_link() {
	retailPage.clickOnRegisterForAnAffiliateAccountLink();
	logger.info("User clicked on Register for an Affiliate Account link");
	}

}

package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPage extends Base {
	
	
	public RetailPage(){
	PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath ="//a[@title = 'My Account']")
	private WebElement myAccount;
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginOption;
	
	@FindBy(id = "input-email")
	private WebElement emailField;
	
	@FindBy(id = "input-password")
	private WebElement passwordField;
	
	@FindBy(xpath = "//input[@type ='submit']")
	private WebElement LoginButton;
	
	@FindBy(xpath = "//h2[contains(text(),'My Account')]")
	private WebElement myAccountValidation;
	
	@FindBy(xpath = "//a[contains(text(),'TEST ENVIRONMENT')]")
	private WebElement homePageLogo;
	
	public void clickOnMyAccount() {
	myAccount.click();
	}
	
	public void clickOnLoginOption() {
	loginOption.click();
	}
	
	public void enterUserNameAndPassword(String emailValue, String passValue) {
	emailField.sendKeys(emailValue);
	passwordField.sendKeys(passValue);	
	}
	
	public void clickOnLoginButton() {
	LoginButton.click();
	}
	
	public boolean isMyAccountValidationPresent() {
	if(myAccountValidation.isDisplayed()) {
		return true;
	}else {
		return false;
    } 
	
  }
	public boolean isTestEnvironmentLogoPresent() {
	if(homePageLogo.isDisplayed()) {
		return true;
		
	}else {
		return false;
   }
	
	
  }

}

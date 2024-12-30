package stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModelElements.CustomerCreateAccount;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class stepDefinition {
	WebDriver driver;
	CustomerCreateAccount account;
	
	@Given("User navigate to the URL {string}")
	public void user_navigate_to_the_url(String url) throws InterruptedException {
	     driver = new ChromeDriver();
	     account = new CustomerCreateAccount(driver);
	     Thread.sleep(5000);
	     driver.get(url);
	   
	}

	@Given("User click on Create an Account link")
	public void user_click_on_create_an_account_link() {
	    account.createAnAccount();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String expectedUrl) {
	   String actualUrl = driver.getCurrentUrl();
	   assertEquals(expectedUrl, actualUrl);
	}

	@When("User create an account with {string} {string} {string} {string} {string}")
	public void user_create_an_account_with(String fname, String lname, String email, String pass, String cpass) {
	    account.enterFname(fname);
	    account.enterLname(lname);
	    account.enterEmail(email);
	    account.enterPass(pass);
	    account.enterConfirmpass(cpass); 
	}

	@When("User click on Create an Accountbutton")
	public void user_click_on_create_an_accountbutton() {
		account.clickOnCreateAnAccount();
	}

	@Then("User should see my account dashboard with page Title {string}")
	public void user_should_see_my_account_dashboard_with_page_title(String expectedTitle) {
		 String actualTitle = driver.getTitle();
		   assertEquals(expectedTitle, actualTitle);
	}

	@Then("User click on SignOut")
	public void user_click_on_sign_out() throws InterruptedException {
	    account.signOutAccount();
	    Thread.sleep(7000);
	}

	@Given("User click on Signin Link")
	public void user_click_on_signin_link() {
	  account.signInAccount();
	}

	@Given("User Enters Email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String emailid, String passw) {
		account.validSignIn(emailid, passw);
	}



	
}

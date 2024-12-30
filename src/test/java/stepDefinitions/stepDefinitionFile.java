package stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModelElements.CustomerCreateAccount;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinitionFile {
	WebDriver driver;
	CustomerCreateAccount acc;
	
	@Given("User navigate to the URL {string}")
	public void user_navigate_to_the_url(String url) throws InterruptedException {
		driver= new ChromeDriver();
		driver.get(url);
		
	}
	@Given("User click on Create an Account link")
	public void user_click_on_create_an_account_link() {
		acc= new CustomerCreateAccount(driver);
	   acc.createAnAccount();
	}
	@Then("Page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		 String actualTitle = driver.getTitle();
		   assertEquals(expectedTitle, actualTitle);
	}
	@When("User create an account with {string} {string} {string} {string} {string}")
	public void user_create_an_account_with(String fname, String lname, String email, String pass, String cpass) {
	  acc.enterFname(fname);
	  acc.enterLname(lname);
	  acc.enterEmail(email);
	  acc.enterPass(pass);
	  acc.enterConfirmpass(cpass);
	}
	@When("User click on Create an Accountbutton")
	public void user_click_on_create_an_accountbutton() {
	    acc.clickOnCreateAnAccount();
	}
	@Then("User should see my account dashboard with page Title {string}")
	public void user_should_see_my_account_dashboard_with_page_title(String expTitle) {
		 String actualTitle = driver.getTitle();
		   assertEquals(expTitle, actualTitle);
	}
	@Then("User click on SignOut")
	public void user_click_on_sign_out() {
	   acc.signOutAccount();
	}




}

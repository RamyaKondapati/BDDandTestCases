package PageObjectModelElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerCreateAccount {
   
	WebDriver driver;
	
    public CustomerCreateAccount(WebDriver idriver) {
		driver=idriver;
		PageFactory.initElements(driver,this);
	}
	
	//repo
	@FindBy (xpath="(//a[text()=\"Create an Account\"])[1]") WebElement createAccountLink;
	 @FindBy(xpath="//input[@name='firstname']") WebElement firstname;
	 @FindBy(xpath="//input[@name='lastname']") WebElement lastname;
	 @FindBy(xpath="//input[@name='email']") WebElement email;
	@FindBy(xpath="//input[@id=\"password\"]") WebElement password;
	@FindBy(xpath="//input[@id=\"password-confirmation\"]") WebElement confirmpw;
	@FindBy(xpath="//button[@class=\"action submit primary\"]") WebElement createAccBtn;
	@FindBy(xpath="(//button[@class=\"action switch\"])[1]") WebElement dropdownArrow ;
	@FindBy(xpath="(//a[contains(text(),'Sign Out')])[1]") WebElement signOutBtn;
	@FindBy(xpath="(//a[contains(text(),\"Sign In\")])[1]") WebElement signInLink;
	 @FindBy(xpath="//input[@id=\"email\"]") WebElement customerEmail;
	 @FindBy(xpath="//input[@name=\"login[password]\"]") WebElement customerPass;
	 @FindBy(xpath="(//button[@name='send'])[1]") WebElement signInButton;
//	@FindBy(xpath="") WebElement a;
//	@FindBy(xpath="") WebElement a;
//	@FindBy(xpath="") WebElement a;
//	@FindBy(xpath="") WebElement a;
//	@FindBy(xpath="") WebElement a;
//	@FindBy(xpath="") WebElement a;
	
	
	public void createAnAccount() {
		createAccountLink.click();
	}
	public void enterFname(String fn) {
		firstname.sendKeys(fn);
	}
	public void enterLname(String ln) {
		lastname.sendKeys(ln);
	}
	public void enterEmail(String em) {
		email.sendKeys(em);
	}
	public void enterPass(String psw) {
		password.sendKeys(psw);
	}
	public void enterConfirmpass(String cpsw) {
		confirmpw.sendKeys(cpsw);
	}
	public void clickOnCreateAnAccount() {
		createAccBtn.click();
	}
	public void signOutAccount() {
		dropdownArrow.click();
		signOutBtn.click();
	}
	public void signInAccount() {
		signInLink.click();
	}
	public void validSignIn(String customerEm,String customerPw) {
		customerEmail.sendKeys(customerEm);
		customerPass.sendKeys(customerPw);
		signInButton.click();
	}
}

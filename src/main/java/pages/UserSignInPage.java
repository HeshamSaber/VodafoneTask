package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserSignInPage extends PagesBase {

	public UserSignInPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "email_create")
	WebElement CreateNewUserEmail;
	@FindBy(id = "SubmitCreate")
	WebElement CreateNewUserBTN;
	@FindBy(id = "email")
	WebElement RegisteredUserEmail;
	@FindBy(id = "passwd")
	WebElement RegisteredUserPassword;
	@FindBy(id = "SubmitLogin")
	WebElement LoginBTN;


	public void firstRegistration(String Email) {
		filltext(CreateNewUserEmail, Email);
		clickButton(CreateNewUserBTN);
	}
	
	public void LogInToAccount (String Email, String Password) {
		filltext(RegisteredUserEmail, Email);
		filltext(RegisteredUserPassword, Password);
		clickButton(LoginBTN);
	}
}
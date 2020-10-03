package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PagesBase{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(className = "login")
	WebElement Signin;

	@FindBy(partialLinkText = "Women")
	WebElement WomenCategory;
	
	
	public void openSignInPage() 
	{
		clickButton(Signin);
	}
	
	public void openWomenCategory() {
		clickButton(WomenCategory);
	}
	
	
}

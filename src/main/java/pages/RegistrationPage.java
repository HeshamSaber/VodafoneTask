package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends PagesBase{

	public RegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "id_gender1")
	WebElement GenderRBtn;
	@FindBy(id = "customer_firstname")
	WebElement CustomerFirstNameTXT;
	@FindBy(id = "customer_lastname")
	WebElement CustomerLastNameTXT;
	@FindBy(id = "email")
	WebElement EmailTXT;
	@FindBy(id = "passwd")
	WebElement NewPasswordTXT;
	@FindBy(id = "firstname")
	WebElement AddressFirstNameTXT;
	@FindBy(id = "lastname")
	WebElement AddressLastNameTXT;
	@FindBy(id = "address1")
	WebElement Address1TXT;
	@FindBy(id = "city")
	WebElement CityTXT;
	@FindBy(id = "id_state")
	WebElement StateSelect;
	@FindBy(id = "postcode")
	WebElement PostCodeTXT;
	@FindBy(id = "id_country")
	WebElement CountrySelect;
	@FindBy(id = "phone_mobile")
	WebElement PhoneTXT;
	@FindBy(id = "alias")
	WebElement AddressAliasTXT;
	@FindBy(id = "submitAccount")
	WebElement SubmitBTN;

	public void registrationForm(String firstName, String lastName, String Password, String address,String city,
			String statevalue,String Postcode, String countryvalue, String Phone, String AliasName) 
	{
		clickButton(GenderRBtn);
		filltext(CustomerFirstNameTXT, firstName);
		filltext(CustomerLastNameTXT, lastName);
		filltext(NewPasswordTXT, Password);
		filltext(AddressFirstNameTXT, firstName);
		filltext(AddressLastNameTXT, lastName);
		filltext(Address1TXT, address);
		filltext(CityTXT, city);
		Select stateValue = new Select(StateSelect);
		stateValue.selectByValue(statevalue);
		filltext(PostCodeTXT, Postcode);
		Select countryValue = new Select(CountrySelect);
		countryValue.selectByValue(countryvalue);
		filltext(PhoneTXT, Phone);
		filltext(AddressAliasTXT, AliasName);
		clickButton(SubmitBTN);
	}

}

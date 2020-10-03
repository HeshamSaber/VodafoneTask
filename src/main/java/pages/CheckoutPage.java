package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PagesBase {

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(partialLinkText = "Proceed to checkout")
	WebElement summaryCheckOutBTN;
	
	@FindBy(xpath = "//*[@id=\"address_delivery\"]/li[1]/h3")
	public WebElement addressValidationMSG;
	
	@FindBy(name = "processAddress")
	WebElement addressCheckOutBTN;
	
	@FindBy(id = "cgv")
	WebElement shippingCheckBox;
	
	@FindBy(name = "processCarrier")
	WebElement shippingCheckOutBTN;
	
	@FindBy(partialLinkText = "Pay by bank wire")
	public WebElement bankTransferBTN;
	
	@FindBy(css = "span.navigation_page")
	public WebElement confirmOrderPageValidation;
	
	@FindBy(css = "button.button.btn.btn-default.button-medium")
	WebElement comfirmOrderBTN;
	
	@FindBy(css = "a.account")
	WebElement moveToUserAccount;
	
	public void SummaryCheckOut() {
		clickButton(summaryCheckOutBTN);		
	}
	
	public void AddressCheckOut() {
		clickButton(addressCheckOutBTN);		
	}
	
	public void ShippingCheckOut() {
		clickButton(shippingCheckBox);
		clickButton(shippingCheckOutBTN);
	}
	
	public void PaymentViaBankTransfer() {
		clickButton(bankTransferBTN);
	}
	
	public void ConfirmOrder() {
		clickButton(comfirmOrderBTN);		
	}
	
	public void MoveToUserAccount() {
		clickButton(moveToUserAccount);
	}

}

package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CheckoutPage;

public class CheckOutTest extends TestBase{

	CheckoutPage checkoutObjects;
	
	@Test
	public void CheckOutProcess() {
		checkoutObjects = new CheckoutPage(driver);
		checkoutObjects.SummaryCheckOut();
		Assert.assertTrue(checkoutObjects.addressValidationMSG.getText().contains("YOUR DELIVERY ADDRESS"));
		checkoutObjects.AddressCheckOut();
		checkoutObjects.ShippingCheckOut();
		checkoutObjects.PaymentViaBankTransfer();
		Assert.assertTrue(checkoutObjects.confirmOrderPageValidation.getText().contains("Bank-wire payment."));
		checkoutObjects.ConfirmOrder();
		checkoutObjects.MoveToUserAccount();
	}

}

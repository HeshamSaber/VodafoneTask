package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.MyAccountPage;

public class CheckOrderInAccountTest extends TestBase{
	
	MyAccountPage accountObjects;
	
	@Test
	public void CheckOrderInaccount() {
		accountObjects = new MyAccountPage(driver);
		accountObjects.OpenOrdersPage();
		accountObjects.OpenOrdersDetailsPage();
		Assert.assertTrue(accountObjects.orderProductName.getText().contains("Blouse - Color : Black, Size : S"));
	}

}

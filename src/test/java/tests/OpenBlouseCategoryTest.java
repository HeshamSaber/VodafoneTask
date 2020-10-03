package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductPage;

public class OpenBlouseCategoryTest extends TestBase {
	HomePage homeObjects;
	ProductPage productObjects;
	
	@Test
	public void openBlouse() {
		homeObjects = new HomePage(driver);
		homeObjects.openWomenCategory();
		productObjects = new ProductPage(driver);
		Assert.assertTrue(productObjects.WomanValidation.getText().contains("WOMEN"));
		productObjects.OpenTopsSubCat();
		productObjects.OpenBlouseSubCat();
		productObjects.openBlouseProductPage();
		Assert.assertTrue(productObjects.productModel.getText().contains("demo_2"));
		productObjects.addToCart();
		productObjects.checkOutProduct();
	}
	

}

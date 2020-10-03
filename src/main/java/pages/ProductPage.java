package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PagesBase{

	public ProductPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css="span.cat-name")
	public WebElement WomanValidation;
	
	@FindBy(partialLinkText = "Tops")
	WebElement topsSubCat;
	
	@FindBy(partialLinkText = "Blouses")
	WebElement blouseSubCat;
	
	@FindBy(partialLinkText = "Blouse")
	WebElement blouseProduct;
	
	@FindBy(css="span.editable")
	public WebElement productModel;
	
	@FindBy(id="add_to_cart")
	WebElement addToCartBTN;
	
	@FindBy(partialLinkText = "Proceed to checkout")
	WebElement checkOutBTN;
	
	public void OpenTopsSubCat() {
		clickButton(topsSubCat);
	}
	
	public void OpenBlouseSubCat() {
		clickButton(blouseSubCat);
	}
	
	public void openBlouseProductPage() {
		clickButton(blouseProduct);
	}
	
	public void addToCart() {
		clickButton(addToCartBTN);
	}
	
	public void checkOutProduct() {
		clickButton(checkOutBTN);
	}

}

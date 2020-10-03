package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PagesBase {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(css = "p.info-account")
	public WebElement infoAccountTXT;
	
	@FindBy(css = "a.logout")
	WebElement signOutBTN;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span")
	WebElement ordersBTN;
	
	@FindBy(xpath = "//*[@id=\"order-list\"]/tbody/tr/td[7]/a[1]/span")
	WebElement ordersDetails;
	
	@FindBy(xpath = "//*[@id=\"order-detail-content\"]/table/tbody/tr/td[2]/label")
	public WebElement orderProductName;
	
	
	public void SignOutClick() {
		clickButton(signOutBTN);
	}
	
	public void OpenOrdersPage() {
		clickButton(ordersBTN);
	}
	
	public void OpenOrdersDetailsPage() {
		clickButton(ordersDetails);
	}
	
}

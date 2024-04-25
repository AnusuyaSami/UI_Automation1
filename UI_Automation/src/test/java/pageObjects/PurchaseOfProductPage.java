package pageObjects;

import org.openqa.selenium.By;

import lombok.Data;

@Data
public class PurchaseOfProductPage {

	private By dismissButton = By.xpath("//button[@aria-label='Close Welcome Banner']");
	private By meWantItButton = By.xpath("//a[text()='Me want it!']");
	private By accountButton = By.xpath("//button[@aria-label='Show/hide account menu']");
	private By loginButtonTab = By.xpath("//button[@aria-label='Go to login page']");
	private By eMailTab = By.xpath("//input[@aria-label='Text field for the login email']");
	private By passWordTab = By.xpath("//input[@aria-label='Text field for the login password']");
	private By loginButton = By.xpath("//button[@type='submit']/span[1]");
	private By applePomaceItem = By.xpath("//div[text()=' Apple Pomace ']/../../..//span[text()='Add to Basket']");
	private By applePomaceMessageTab = By.xpath("//span[contains(text(),'Placed Apple Pomace into basket.')]");
	private By viewCartButton = By.xpath("//button[@routerlink='/basket']");
	private By checkOutButton = By.xpath("//button/span[text()=' Checkout ']");
	private By addNewAddressButton = By.xpath("//span[contains(text(),'Add')]");
	private By countryTab = By.xpath("//input[@id='mat-input-3']");
	private By nameTab = By.xpath("//input[@id='mat-input-4']");
	private By mobileNumberTab = By.xpath("//input[@id='mat-input-5']");
	private By zipCodeTab = By.xpath("//input[@id='mat-input-6']");
	private By addressTab = By.id("address");
	private By cityTab = By.xpath("//input[@id='mat-input-8']");
	private By stateTab = By.xpath("//input[@id='mat-input-9']");
	private By submitButton = By.xpath("//span[text()=' Submit ']");
	private By selectAddressButton = By.xpath("//span[@class='mat-radio-container']");
	private By continueButton = By.xpath("//span[text()='Continue']/..");
	private By chooseDeliveryOptionTab = By.xpath("//div[3]/h1");
	private By selectDeliveryTab = By.xpath("//*[@id='mat-radio-43']//span[@class='mat-radio-container']");
	private By addNewCardTab = By.xpath("//*[contains(text(),' Add new card ')]");
	private By cardNameTab = By.xpath("//input[@id='mat-input-10']");
	private By CardNumberTab = By.xpath("//input[@id='mat-input-11']");
	private By MonthTab = By.xpath("//select[@id='mat-input-12']");
	private By yearTab = By.xpath("//select[@id='mat-input-13']");
	private By selectCardTab = By.xpath("//input[@id='mat-radio-46-input']/..");
	private By placeOrderButton = By.xpath("//*[@id='checkoutButton']");

}

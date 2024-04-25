package pageObjects;

import org.openqa.selenium.By;

import lombok.Data;

@Data
public class SoldOutFor1LeftProductPage {

	private By onlyOneLeftItemmessageTab = By.xpath("//span[contains(text(),'Permafrost\" 2020 Edition into basket.')]");
	private By onlyOneLeftItem = By
			.xpath("//div[text()=' Juice Shop \"Permafrost\" 2020 Edition ']/../../..//span[text()='Add to Basket']");
	private By viewCartButton = By.xpath("//button[@routerlink='/basket']");
	private By checkOutButtonTab = By.xpath("//button[@id='checkoutButton']");
	private By checkOutButton = By.xpath("//button/span[text()=' Checkout ']");
	private By addNewAddressButtonTab = By.xpath("//span[contains(text(),'Add')]");
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
	private By continueButton = By.xpath("//span[text()='Continue']");
	private By chooseDeliveryOptionTab = By.xpath("//div[3]/h1");
	private By selectDeliveryTab = By.xpath("//*[@id='mat-radio-43']//span[@class='mat-radio-container']");
	private By paymentOptionTab = By.xpath("//h1[text()='My Payment Options']");
	private By addNewCardTab = By.xpath("//*[contains(text(),' Add new card ')]");
	private By cardNameTab = By.xpath("//input[@id='mat-input-10']");
	private By CardNumberTab = By.xpath("//input[@id='mat-input-11']");
	private By MonthTab = By.xpath("//select[@id='mat-input-12']");
	private By yearTab = By.xpath("//select[@id='mat-input-13']");
	private By selectCardTab = By.xpath("//input[@id='mat-radio-46-input']/..");
	private By orderSummaryTab = By.xpath("//div[text()='Order Summary']");
	private By placeOrderButton = By.xpath("//*[@id='checkoutButton']");
	private By deliveryAddressAssertTab = By.xpath("//b[text()='Delivery Address']");
	private By homeButton = By.xpath("//button[@aria-label='Back to homepage']/span[1]");

}

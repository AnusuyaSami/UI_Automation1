package testClasses;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

import net.datafaker.Faker;
import pageObjects.SoldOutFor1LeftProductPage;

public class TestSoldOutFor1leftProduct {

	public static void soldOutfor1LeftProduct() throws InterruptedException {
		CommonActions.getInstance().login();
		SoldOutFor1LeftProductPage soldOutFor1LeftProductpage = new SoldOutFor1LeftProductPage();

		Faker faker = new Faker();
		faker.address().country();
		faker.name().fullName();
		faker.number().digits(10);
		faker.address().zipCode();
		faker.address().buildingNumber();
		faker.address().city();
		faker.address().state();
		faker.number().digits(16);
		faker.number().randomDigitNotZero();

		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getOnlyOneLeftItem()).click();
		WebElement hiddenElement = CommonActions.driver
				.findElement(soldOutFor1LeftProductpage.getOnlyOneLeftItemmessageTab());
		String onlyOneLeftItemmessage = hiddenElement.getAttribute("textContent");
		System.out.println(onlyOneLeftItemmessage);
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getViewCartButton()).click();
		String checkOutAssertmessage = CommonActions.driver.findElement(soldOutFor1LeftProductpage.getCheckOutButton())
				.getText();
		System.out.println(checkOutAssertmessage);
		Thread.sleep(2000);
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getCheckOutButton()).click();
		String addressAssertmessage = CommonActions.driver
				.findElement(soldOutFor1LeftProductpage.getAddNewAddressButtonTab()).getText();
		System.out.println(addressAssertmessage);
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getAddNewAddressButton()).click();
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getCountryTab()).click();
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getCountryTab())
				.sendKeys(faker.address().country());
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getNameTab()).click();
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getNameTab()).sendKeys(faker.name().fullName());
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getMobileNumberTab()).click();
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getMobileNumberTab())
				.sendKeys(faker.number().digits(10));
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getZipCodeTab()).click();
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getZipCodeTab())
				.sendKeys(faker.address().zipCode());
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getAddressTab()).click();
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getAddressTab())
				.sendKeys(faker.address().buildingNumber());
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getCityTab()).click();
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getCityTab()).sendKeys(faker.address().city());
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getStateTab()).click();
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getStateTab()).sendKeys(faker.address().state());
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getSubmitButton()).click();
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getSelectAddressButton()).click();
		// Thread.sleep(2000);
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getContinueButton()).click();
		String deliveryOptionmessage = CommonActions.driver
				.findElement(soldOutFor1LeftProductpage.getChooseDeliveryOptionTab()).getText();
		System.out.println(deliveryOptionmessage);
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getSelectDeliveryTab()).click();
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getContinueButton()).click();
		String paymentOptionmessage = CommonActions.driver.findElement(soldOutFor1LeftProductpage.getPaymentOptionTab())
				.getText();
		System.out.println(paymentOptionmessage);
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getAddNewCardTab()).click();
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getCardNameTab()).click();
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getCardNameTab()).sendKeys(faker.name().fullName());
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getCardNumberTab()).click();
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getCardNumberTab())
				.sendKeys(faker.number().digits(16));
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getMonthTab()).click();
		WebElement expiryDate = CommonActions.driver.findElement(soldOutFor1LeftProductpage.getMonthTab());

		Select dropdown = new Select(expiryDate);
		dropdown.selectByValue("3");

		WebElement expiryYear = CommonActions.driver.findElement(soldOutFor1LeftProductpage.getYearTab());

		Select dropdown2 = new Select(expiryYear);
		dropdown2.selectByValue("2088");

		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getSubmitButton()).click();
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getContinueButton()).click();
		Thread.sleep(1000);
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getSelectCardTab()).click();
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getContinueButton()).click();
		String orderSummarymessageTab = CommonActions.driver
				.findElement(soldOutFor1LeftProductpage.getOrderSummaryTab()).getText();
		System.out.println(orderSummarymessageTab);
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getPlaceOrderButton()).click();
		String deliveryAddressAssertmessage = CommonActions.driver
				.findElement(soldOutFor1LeftProductpage.getDeliveryAddressAssertTab()).getText();
		System.out.println(deliveryAddressAssertmessage);
		Thread.sleep(1000);
		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getHomeButton()).click();

		CommonActions.driver.findElement(soldOutFor1LeftProductpage.getOnlyOneLeftItem()).click();
		WebElement hiddenElement1 = CommonActions.driver
				.findElement(soldOutFor1LeftProductpage.getOnlyOneLeftItemmessageTab());
		String outOfStockMessage = hiddenElement1.getAttribute("textContent");
		System.out.println(outOfStockMessage);

	}

}

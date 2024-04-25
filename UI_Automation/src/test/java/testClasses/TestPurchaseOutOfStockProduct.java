package testClasses;

import org.testng.annotations.Test;

import pageObjects.OutOfStockProductPage;

public class TestPurchaseOutOfStockProduct {

	@Test
	public void purchaseoutOfStock() throws InterruptedException {

		CommonActions.getInstance().login();
		OutOfStockProductPage outOfstockProductPage = new OutOfStockProductPage();
		CommonActions.driver.findElement(outOfstockProductPage.getKingoftheHillFacemaskItem()).click();
		Thread.sleep(2000);
		String outOfStockmessage = CommonActions.driver.findElement(outOfstockProductPage.getOutOfStockmessageTab())
				.getAttribute("textContent");
		System.out.println(outOfStockmessage);
//Assert
	}

}

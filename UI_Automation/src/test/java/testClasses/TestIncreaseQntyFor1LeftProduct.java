package testClasses;





import org.openqa.selenium.WebElement;

import pageObjects.IncreaseQntyFor1LeftProductPage;



public class TestIncreaseQntyFor1LeftProduct {
	

	public void increaseInQuantityforOneLeftOut() {
		
		CommonActions.getInstance().login();
		IncreaseQntyFor1LeftProductPage increaseQntyFor1LeftProductpage  =new IncreaseQntyFor1LeftProductPage();
		CommonActions.driver.findElement(increaseQntyFor1LeftProductpage.getOneLeftItem()).click();
		WebElement hiddenElement = CommonActions.driver.findElement(increaseQntyFor1LeftProductpage.getOneLeftItemmessageTab());
		String oneLeftItemmessage = hiddenElement.getAttribute("textContent");
		System.out.println(oneLeftItemmessage);
		CommonActions.driver.findElement(increaseQntyFor1LeftProductpage.getViewCartButton()).click();
		CommonActions.driver.findElement(increaseQntyFor1LeftProductpage.getAddQuantityButton()).click();
		WebElement viewCartHiddenElement = CommonActions.driver.findElement(increaseQntyFor1LeftProductpage.getViewCartItemmessageTab());
		String viewCartItemmessage = viewCartHiddenElement.getAttribute("textContent");
		System.out.println(viewCartItemmessage);
	}

	}

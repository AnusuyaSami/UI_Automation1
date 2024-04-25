package testClasses;

import pageObjects.ItemsPerPageCountPage;

public class TestItemsPerPageCount {

	public void itemsPerPageCount() {
		CommonActions.getInstance().login();
		ItemsPerPageCountPage itemsPerPageCountpage = new ItemsPerPageCountPage();
		String defaultItemPerPageCount = CommonActions.driver
				.findElement(itemsPerPageCountpage.getDefaultItemPerPageCountTab()).getText();
		System.out.println(defaultItemPerPageCount);
		CommonActions.driver.findElement(itemsPerPageCountpage.getDropDowntArrow()).click();
		CommonActions.driver.findElement(itemsPerPageCountpage.getTwiceTheDefaultItemPerPageCountTab()).click();
		String twiceTheDefaultItemPerPageCount = CommonActions.driver
				.findElement(itemsPerPageCountpage.getTwiceTheDefaultItemPerPageCountTab()).getText();
		System.out.println(twiceTheDefaultItemPerPageCount);
		CommonActions.driver.findElement(itemsPerPageCountpage.getDropDowntArrow()).click();
		CommonActions.driver.findElement(itemsPerPageCountpage.getThriceTheDefaultItemPerPageCountTab()).click();
		String thriceTheDefaultItemPerPageCount = CommonActions.driver
				.findElement(itemsPerPageCountpage.getThriceTheDefaultItemPerPageCountTab()).getText();
		System.out.println(thriceTheDefaultItemPerPageCount);

	}

}

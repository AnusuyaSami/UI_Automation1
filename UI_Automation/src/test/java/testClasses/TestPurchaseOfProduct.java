package testClasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

import net.datafaker.Faker;
import pageObjects.PurchaseOfProductPage;

public class TestPurchaseOfProduct {

	public void purchaseOfProduct() throws IOException, InterruptedException {
		CommonActions.getInstance().login();
		PurchaseOfProductPage purchaseOfProductpage = new PurchaseOfProductPage();
		CommonActions.driver.findElement(purchaseOfProductpage.getApplePomaceItem()).click();
		Thread.sleep(500);
		WebElement hiddenElement = CommonActions.driver.findElement(purchaseOfProductpage.getApplePomaceMessageTab());
		String applePomacemessage = hiddenElement.getAttribute("textContent");
		System.out.println(applePomacemessage);
		CommonActions.driver.findElement(purchaseOfProductpage.getViewCartButton()).click();
		Thread.sleep(1000);
		CommonActions.driver.findElement(purchaseOfProductpage.getCheckOutButton()).click();

		CommonActions.driver.findElement(purchaseOfProductpage.getAddNewAddressButton()).click();

		CommonActions.driver.findElement(purchaseOfProductpage.getCountryTab()).click();
		CommonActions.driver.findElement(purchaseOfProductpage.getCountryTab())
				.sendKeys(purchaseOfProductpage.contentlist.get(4));
		CommonActions.driver.findElement(purchaseOfProductpage.getNameTab()).click();
		CommonActions.driver.findElement(purchaseOfProductpage.getNameTab())
				.sendKeys(purchaseOfProductpage.contentlist.get(0));
		CommonActions.driver.findElement(purchaseOfProductpage.getMobileNumberTab()).click();
		CommonActions.driver.findElement(purchaseOfProductpage.getMobileNumberTab()).sendKeys("2347869087");
		CommonActions.driver.findElement(purchaseOfProductpage.getZipCodeTab()).click();
		CommonActions.driver.findElement(purchaseOfProductpage.getZipCodeTab()).sendKeys("19645");
		CommonActions.driver.findElement(purchaseOfProductpage.getAddressTab()).click();
		CommonActions.driver.findElement(purchaseOfProductpage.getAddressTab())
				.sendKeys(purchaseOfProductpage.contentlist.get(1));
		CommonActions.driver.findElement(purchaseOfProductpage.getCityTab()).click();
		CommonActions.driver.findElement(purchaseOfProductpage.getCityTab())
				.sendKeys(purchaseOfProductpage.contentlist.get(2));
		CommonActions.driver.findElement(purchaseOfProductpage.getStateTab()).click();
		CommonActions.driver.findElement(purchaseOfProductpage.getStateTab())
				.sendKeys(purchaseOfProductpage.contentlist.get(3));
		CommonActions.driver.findElement(purchaseOfProductpage.getSubmitButton()).click();
		CommonActions.driver.findElement(purchaseOfProductpage.getSelectAddressButton()).click();
		Thread.sleep(2000);

		CommonActions.driver.findElement(purchaseOfProductpage.getContinueButton()).click();
		CommonActions.driver.findElement(purchaseOfProductpage.getSelectDeliveryTab()).click();
		CommonActions.driver.findElement(purchaseOfProductpage.getContinueButton()).click();
		CommonActions.driver.findElement(purchaseOfProductpage.getAddNewCardTab()).click();
		CommonActions.driver.findElement(purchaseOfProductpage.getCardNameTab()).click();
		CommonActions.driver.findElement(purchaseOfProductpage.getCardNameTab())
				.sendKeys(purchaseOfProductpage.contentlist.get(0));
		CommonActions.driver.findElement(purchaseOfProductpage.getCardNumberTab()).click();
		CommonActions.driver.findElement(purchaseOfProductpage.getCardNumberTab()).sendKeys("4567342189075643");
		CommonActions.driver.findElement(purchaseOfProductpage.getMonthTab()).click();
		WebElement expiryDate = CommonActions.driver.findElement(purchaseOfProductpage.getMonthTab());

		Select dropdown = new Select(expiryDate);
		dropdown.selectByValue("6");

		WebElement expiryYear = CommonActions.driver.findElement(purchaseOfProductpage.getYearTab());

		Select dropdown2 = new Select(expiryYear);
		dropdown2.selectByValue("2081");

		CommonActions.driver.findElement(purchaseOfProductpage.getSubmitButton()).click();
		CommonActions.driver.findElement(purchaseOfProductpage.getContinueButton()).click();
		CommonActions.driver.findElement(purchaseOfProductpage.getSelectCardTab()).click();
		CommonActions.driver.findElement(purchaseOfProductpage.getContinueButton()).click();
		CommonActions.driver.findElement(purchaseOfProductpage.getPlaceOrderButton()).click();

	}

	public static void readExcel() throws IOException {

		List<String> topiclist = new ArrayList<String>();
		List<String> contentlist = new ArrayList<String>();
		FileInputStream excel = new FileInputStream(
				"C:\\Users\\12159\\eclipse-workspace\\UI_Automation\\src\\test\\resources\\TestData\\Address.xlsx");

		Workbook workbook = new XSSFWorkbook(excel);
		Sheet sheet = workbook.getSheetAt(0);
		Iterator<Row> rowIterator = sheet.iterator();

		while (rowIterator.hasNext()) {
			Row rowValue = rowIterator.next();

			Iterator<Cell> columnIterator = rowValue.iterator();
			int i = 2;
			while (columnIterator.hasNext()) {
				if (i % 2 == 0) {
					topiclist.add(columnIterator.next().getStringCellValue());
				} else {
					contentlist.add(columnIterator.next().getStringCellValue());
				}
				i++;
			}
		}

	}

}

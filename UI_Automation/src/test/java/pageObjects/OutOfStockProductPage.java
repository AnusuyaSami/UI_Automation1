package pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import lombok.Data;

@Data
public class OutOfStockProductPage {

	private By dismissButton = By.xpath("//button[@aria-label='Close Welcome Banner']");
	private By meWantItButton = By.xpath("//a[text()='Me want it!']");
	private By accountButton = By.xpath("//button[@aria-label='Show/hide account menu']");
	private By loginButtonTab = By.xpath("//button[@aria-label='Go to login page']");
	private By eMailTab = By.xpath("//input[@aria-label='Text field for the login email']");
	private By passWordTab = By.xpath("//input[@aria-label='Text field for the login password']");
	private By loginButton = By.xpath("//button[@type='submit']/span[1]");
	private By outOfStockmessageTab = By.xpath("//span[contains(text(),'Salesman Artwork into basket')]");
	private By kingoftheHillFacemaskItem = By.xpath("//span[text()='Sold Out']/../..//*[text()='Add to Basket']");

}

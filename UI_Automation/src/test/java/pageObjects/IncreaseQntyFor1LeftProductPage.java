package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import lombok.Data;

@Data
public class IncreaseQntyFor1LeftProductPage {

	private By dismissButton = By.xpath("//button[@aria-label='Close Welcome Banner']");
	private By meWantItButton = By.xpath("//a[text()='Me want it!']");
	private By accountButton = By.xpath("//button[@aria-label='Show/hide account menu']");
	private By loginButtonTab = By.xpath("//button[@aria-label='Go to login page']");
	private By eMailTab = By.xpath("//input[@aria-label='Text field for the login email']");
	private By passWordTab = By.xpath("//input[@aria-label='Text field for the login password']");
	private By loginButton = By.xpath("//button[@type='submit']/span[1]");

	private By oneLeftItemmessageTab = By.xpath("//span[contains(text(),'Salesman Artwork into basket')]");
	private By viewCartItemmessageTab = By.xpath("//span[contains(text(),'out of stock!')]");
	private By oneLeftItem = By
			.xpath("//div[text()=' Best Juice Shop Salesman Artwork ']/../../..//span[text()='Add to Basket']");

	private By viewCartButton = By.xpath("//button[@routerlink='/basket']");
	private By addQuantityButton = By.xpath("//mat-cell[contains(text(),'Salesman Artwork ')]/..//button[2]");

}

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import lombok.Data;

@Data
public class ItemsPerPageCountPage {

	private By dismissButton = By.xpath("//button[@aria-label='Close Welcome Banner']");
	private By meWantItButton = By.xpath("//a[text()='Me want it!']");
	private By accountButton = By.xpath("//button[@aria-label='Show/hide account menu']");
	private By loginButtonTab = By.xpath("//button[@aria-label='Go to login page']");
	private By eMailTab = By.xpath("//input[@aria-label='Text field for the login email']");
	private By passWordTab = By.xpath("//input[@aria-label='Text field for the login password']");
	private By loginButton = By.xpath("//button[@type='submit']/span[1]");

	private By defaultItemPerPageCountTab = By.xpath("//span[contains(@class,'mat-select-min')]");
	private By dropDowntArrow = By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c31-12']");
	private By twiceTheDefaultItemPerPageCountTab = By.xpath("//mat-option[@id='mat-option-1']");
	private By thriceTheDefaultItemPerPageCountTab = By.xpath("//mat-option[@id='mat-option-2']");

}

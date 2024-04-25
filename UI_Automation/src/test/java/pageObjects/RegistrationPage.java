package pageObjects;

import org.openqa.selenium.By;

import lombok.Data;

@Data
public class RegistrationPage {

	private By dismissButton = By.xpath("//button[@aria-label='Close Welcome Banner']");
	private By meWantItButton = By.xpath("//a[text()='Me want it!']");
	private By accountButton = By.xpath("//button[@aria-label='Show/hide account menu']");
	private By loginButtonTab = By.xpath("//button[@aria-label='Go to login page']");
	private By notYetCustomer = By.linkText("Not yet a customer?");
	private By registerEmailTab = By.xpath("//input[@aria-label='Email address field']");
	private By registerPasswordTab = By.xpath("//input[@aria-label='Field for the password']");
	private By registerRepeatPasswordTab = By.xpath("//input[@aria-label='Field to confirm the password']");
	private By registerSecurityQuestionTab = By.xpath("//span[contains(@class,'mat-select-placeholder mat')]");
	private By registerSecurityQuestion = By.xpath("//span[text()=' Your favorite book? ']");
	private By registerSecurityAnswerTab = By
			.xpath("//input[@aria-label='Field for the answer to the security question']");
	private By registerButton = By.xpath("//span[text()=' Register ']");

}

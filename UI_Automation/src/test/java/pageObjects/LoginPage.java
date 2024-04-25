package pageObjects;

import org.openqa.selenium.By;

import lombok.Data;

@Data
public class LoginPage {

	private By eMailTab = By.xpath("//input[@aria-label='Text field for the login email']");
	private By passWordTab = By.xpath("//input[@aria-label='Text field for the login password']");
	private By loginButton = By.xpath("//button[@type='submit']/span[1]");

}

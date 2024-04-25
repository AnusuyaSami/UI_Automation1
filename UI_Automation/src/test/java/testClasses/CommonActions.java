package testClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import lombok.Data;
import pageObjects.LoginPage;
import pageObjects.RegistrationPage;
@Data
public class CommonActions {

	private CommonActions() {
	}

	private static CommonActions commonActions;

	public static CommonActions getInstance() {
		if (commonActions == null) {
			commonActions = new CommonActions();
		}
		return commonActions;

	}

	public static  WebDriver driver;
	public static String URL = "https://demo.owasp-juice.shop/#/";
@BeforeSuite
	public void launchBrowser() {

		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		RegistrationPage registerpage=new RegistrationPage();
		driver.findElement(registerpage.getDismissButton()).click();
		driver.findElement(registerpage.getMeWantItButton()).click();
		driver.findElement(registerpage.getAccountButton()).click();
		driver.findElement(registerpage.getLoginButtonTab()).click();

	}

	public void registration() {
		RegistrationPage registerpage=new RegistrationPage();

		driver.findElement(registerpage.getNotYetCustomer()).click();
		driver.findElement(registerpage.getRegisterEmailTab()).click();
		driver.findElement(registerpage.getRegisterEmailTab()).sendKeys("Abcd123@gmail.com");
		driver.findElement(registerpage.getRegisterPasswordTab()).click();
		driver.findElement(registerpage.getRegisterPasswordTab()).sendKeys("!23456789");
		driver.findElement(registerpage.getRegisterRepeatPasswordTab()).click();
		driver.findElement(registerpage.getRegisterRepeatPasswordTab()).sendKeys("!23456789");
		driver.findElement(registerpage.getRegisterSecurityQuestionTab()).click();
		driver.findElement(registerpage.getRegisterSecurityQuestion()).click();
		driver.findElement(registerpage.getRegisterSecurityAnswerTab()).sendKeys("HarryPotter");
		driver.findElement(registerpage.getRegisterButton()).click();

	}
	
	public void login() {
		LoginPage loginpage=new LoginPage();
		driver.findElement(loginpage.getEMailTab()).click();
		driver.findElement(loginpage.getEMailTab()).sendKeys("Abcd123@gmail.com");
		driver.findElement(loginpage.getPassWordTab()).click();
		driver.findElement(loginpage.getPassWordTab()).sendKeys("!23456789");
		driver.findElement(loginpage.getLoginButton()).click();

	}

}

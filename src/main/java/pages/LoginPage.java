package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import util.HelperMethods;

public class LoginPage {

	// Concept of Data Encapsulation is implemented here by declaring members as Private and accessing then inside public mentods
	private WebDriver driver;

	private By username = By.id("user-name");
	private By pssword = By.id("password");
	private By loginButton = By.id("login-button");
	
	private By homePageLogo = By.xpath("//div[@class='app_logo']");
	private WebElement element;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUsername(String userName){
		element = driver.findElement(username);
		HelperMethods.waitForVisibility(element, driver);
		element.sendKeys(userName);
	}

	public void enterPassword(String Password){
		driver.findElement(pssword).sendKeys(Password);
	}
	
	public void clickLoginButton(){
		driver.findElement(loginButton).click();
	}
	
	public void checkHomePageLogo(){
		Assert.assertTrue(driver.findElement(homePageLogo).isDisplayed());
	}
}

package util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperMethods {
	
	public static void waitForVisibility(WebElement element, WebDriver driver) throws Error{
        new WebDriverWait(driver, Duration.ofSeconds(20))
             .until(ExpectedConditions.visibilityOf(element));
 }

}

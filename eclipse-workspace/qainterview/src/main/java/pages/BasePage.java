package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	WebDriver driver;
	WebDriverWait wait;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	// type

	public void type(By locator, String text) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	
		driver.findElement(locator).sendKeys(text);

	}

	// click

	public void click(By locater) {
		driver.findElement(locater).click();
	}

	public String getResult(By locater) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locater));

		return driver.findElement(locater).getText();
	}

	public boolean isElementDisplay(By locater) {
		return driver.findElement(locater).isDisplayed();

	}

	public boolean isElementclickable(By locater) {
		return driver.findElement(locater).isDisplayed() && driver.findElement(locater).isEnabled();
	}
}

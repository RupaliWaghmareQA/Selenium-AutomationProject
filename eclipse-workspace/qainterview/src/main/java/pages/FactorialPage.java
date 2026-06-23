package pages;

import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FactorialPage extends BasePage {

	// Locators

	By textbox = By.name("number");
	By button = By.id("getFactorial");
	By result = By.id("resultDiv");
	By About = By.linkText("About");
	By Terms = By.xpath("//a[text()='Terms and Conditions']");
	By privacyLink = By.xpath("//a[text()='Privacy']");
	
	By allLinks =By.tagName("a");

	
	public FactorialPage(WebDriver driver) {
super(driver);
//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
//
//wait = new WebDriverWait(driver, Duration.ofSeconds(60));

// Page Actions
	}
	
	
	public void enterNumber(String num) {
		
		WebElement text=wait.until(ExpectedConditions.visibilityOfElementLocated(textbox));
	text.clear();
		
		type(textbox, num);
	}

	public void clickOnButton() {
		WebElement btn=wait.until(ExpectedConditions.visibilityOfElementLocated(button));
		click(button);

	}

	public String getResultText() {
		WebElement res=wait.until(ExpectedConditions.visibilityOfElementLocated(result));


	    wait.until(ExpectedConditions.textToBePresentInElementLocated(result, "factorial"));
		
		return getResult(result);
		

	}

	// for textbox

	public boolean isTextboxDisplayed() {
		return isElementDisplay(textbox);
	}

	public boolean isTextboxClickable() {
		return isElementclickable(textbox);
	}

   //for button
	public boolean isButtonDisplayed() {
		return isElementDisplay(button);
	}

	public boolean isButtonClickable() {
		return isElementclickable(button);
	}

//click on About link
	public void clickonAbout() 
	{
		WebElement link= wait.until(ExpectedConditions.visibilityOfElementLocated(About));

	    driver.findElement(About).click();
	    
		wait.until(ExpectedConditions.urlContains("about"));

	}
	
	//Return all links
	public List<WebElement> getAllLink()
	{
		return driver.findElements(allLinks);
	}
	
	
	public boolean isAboutDisplay()
	{
		return isElementDisplay(About);
	}

	public boolean isTermsDisplay()
	{
		return isElementDisplay(Terms);
	}

	public boolean isPrivacyDisplay()
	{
		return isElementDisplay(privacyLink);
	}
	
	
	
	//Class2 Methods
	
	public String getTextBoxPlaceholder()
	{
		return driver.findElement(textbox).getAttribute("placeholder");
		
	}
	
	public String getTitleOfthePage()
		{
		 wait.until(ExpectedConditions.titleIs("Factoriall"));
		return driver.getTitle();
	}
	
	public String getURLOfpage()
	{
		wait.until(ExpectedConditions.urlContains("http"));
		return driver.getCurrentUrl();
	}
	
	
}

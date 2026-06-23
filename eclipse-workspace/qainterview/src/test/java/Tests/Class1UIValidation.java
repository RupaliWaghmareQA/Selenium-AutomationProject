package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.BasePage;
import pages.FactorialPage;

public class Class1UIValidation extends BaseTest {
	
	@Test
	public void verifyUIElements()
	{
		FactorialPage page =new FactorialPage(driver);
		// Textbox
		page.enterNumber("5");
		
		Assert.assertTrue(page.isTextboxDisplayed());
		
		//Calculate button

		Assert.assertTrue(page.isButtonDisplayed());
		
		Assert.assertTrue(page.isAboutDisplay());
		Assert.assertTrue(page.isPrivacyDisplay());
		Assert.assertTrue(page.isTermsDisplay());
		
		Assert.assertTrue(page.isButtonClickable());

		}
}
